package cn.itcast.mp;

import cn.itcast.mp.enums.SexEnum;
import cn.itcast.mp.mapper.UserMapper;
import cn.itcast.mp.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        User user = new User();
        user.setAge(29);
        user.setMail("guanyu@itcast.cn");
        user.setName("关羽");
        user.setUserName("guanyu");
        user.setPassword("123456");
        user.setVersion(1);
        user.setSex(SexEnum.WOMAN);//使用枚举类型

        //返回的result是受影响的行数，并不是自增后的id
        int result = this.userMapper.insert(user);
        System.out.println("result = " + result);

        //获取自增长的id后，自增后的id会回填到对象中
        System.out.println(user.getId());
    }

    @Test
    public void testSelectById() {
        User user = this.userMapper.selectById(1L);
        System.out.println(user);
    }

    //根据ID条件更新
    @Test
    public void testUpdateById() {
        User user = new User();
        user.setId(1L); //条件，根据ID更新
        user.setPassword("666666"); //更新的字段
        user.setAge(19);

        int result = this.userMapper.updateById(user);
        System.out.println("result => " + result);

    }

    // 根据 whereEntity 条件，更新记录
    @Test
    public void testUpdate() {
        User user = new User();
        user.setAge(22);

        //更新的条件以及字段
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("id", 1).set("age", 22);
        //根据条件做更新
        int result = this.userMapper.update(user, wrapper);
        System.out.println("result = " + result);
    }

    // 根据 whereEntity 条件，更新记录
    @Test
    public void testUpdate2() {
        //更新的条件以及字段
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("age", 22).set("password", "999999999") //更新的字段
                .eq("user_name", "zhangsan");
        //根据条件做更新
        int result = this.userMapper.update(null, wrapper);
        System.out.println("result = " + result);
    }

    //根据 ID 删除
    @Test
    public void testDeleteById() {
        int result = this.userMapper.deleteById(2L);
        System.out.println("result => " + result);
    }

    //根据 columnMap 条件，删除记录
    @Test
    public void testDeleteByMap() {

        Map<String, Object> map = new HashMap<>();
        map.put("user_name", "zhangsan");
        map.put("password", "999999999");

        //根据map删除数据,多条件之间是and的关系
        int result = this.userMapper.deleteByMap(map);
        System.out.println("result => " + result);
    }

    // 根据 entity 条件，删除记录
    @Test
    public void testDelete() {
        //用法一:
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.eq("user_name", "caocao")
//                .eq("password", "123456");

        //用法二: 推荐!
        User user = new User();
        user.setPassword("123456");
        user.setUserName("caocao1");

        QueryWrapper<User> wrapper = new QueryWrapper<>(user);

        // 根据包装条件做删除
        int result = this.userMapper.delete(wrapper);
        System.out.println("result => " + result);
    }

    //选着ID批量删除
    @Test
    public void testDeleteBatchIds() {
        //根据id批量删除数据
        int result = this.userMapper.deleteBatchIds(Arrays.asList(10L, 11L));
        System.out.println("result => " + result);
    }

    @Test
    public void testSelectBatchIds() {
        // 根据ID批量查询
        List<User> users = this.userMapper.selectBatchIds(Arrays.asList(2L, 3L, 4L, 100L));
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testSelectOne() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //查询条件
        wrapper.eq("user_name", "lisi");
        //查询的数据超过一条时,会抛出异常
        User user = this.userMapper.selectOne(wrapper);
        System.out.println(user);
    }

    @Test
    public void testSelectSex() {
        User user = new User();

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //查询条件
        wrapper.ge("sex", SexEnum.WOMAN); //查询性别为女的数据
        //查询的数据超过一条时,会抛出异常
        List<User> users = user.selectList(wrapper);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }

    @Test
    public void testSelectCount() {

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //gt(大于), lt(小于)
        wrapper.gt("age", 20); //条件:年龄大于20岁的用户

        //根据条件查询数据条数
        Integer count = this.userMapper.selectCount(wrapper);
        System.out.println("count=> " + count);
    }

    @Test
    public void testSelectList() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //设置查询条件
        wrapper.like("email", "itcast");

        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testSelectPage() {

        Page<User> page = new Page<>(3, 1); //查询第1页,查询1条数据

        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        //设置查询条件
        wrapper.gt("email", "itcast"); // 设置邮箱中带有itcast的字符

        //根据条件查询数据
        IPage<User> iPage = this.userMapper.selectPage(page, wrapper);
        System.out.println("数据总条数：" + iPage.getTotal());
        System.out.println("总页数：" + iPage.getPages());
        System.out.println("当前页数：" + iPage.getCurrent());

        List<User> records = iPage.getRecords();
        for (User user : records) {
            System.out.println("user = " + user);
        }
    }

    //自定义的方法
    @Test
    public void testFindById() {
        User user = this.userMapper.findById(2L);
        System.out.println(user);
    }

    @Test
    public void testAllEq() {

        Map<String, Object> params = new HashMap<>();
        params.put("name", "李四");
        params.put("age", "20");
        params.put("password", null);

        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.allEq(params);
//        wrapper.allEq(params,false);
//        wrapper.allEq((k, v) -> (k.equals("name") || k.equals("age")),params);
        wrapper.allEq((k, v) -> (k.equals("age") || k.equals("id")) || k.equals("password"),params);

        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    //基本比较
    @Test
    public void testEq() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
//SELECT id,user_name,password,name,age,email FROM tb_user WHERE password = ?AND age >= ? AND name IN (?,?,?)
        wrapper.eq("password", "123456")
                .ge("age", 20)
                .in("name", "李四", "王五", "赵六");

        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    //模糊查询
    @Test
    public void testLike() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //SELECT id,user_name,password,name,age,email FROM tb_user WHERE name LIKE ?
        //Parameters: %曹%(String)
        wrapper.like("name", "曹");
        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    //排序
    @Test
    public void testOrderByAgeDesc() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //按照年龄倒序排序
        wrapper.orderByDesc("age");

        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    //逻辑查询
    @Test
    public void testOr() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "王五").or().eq("age", 21);

        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    //指定字段查询
    @Test
    public void testSelect() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "王五")
                .or()
                .eq("age", 21)
                .select("id" , "age", "name"); //指定查询的字段


        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindAll(){
        List<User> users = this.userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

}





