package cn.itcast.mp;

import cn.itcast.mp.mapper.UserMapper;
import cn.itcast.mp.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserMapper2 {

    @Test
    public void testSelectById() {
        User user = new User();
        user.setId(2L);

        User user1 = user.selectById();
        System.out.println(user1);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setUserName("liubei");
        user.setPassword("123456");
        user.setAge(31);
        user.setName("刘备");
        user.setMail("liubei@itcast.cn");

        // 调用AR的insert方法进行插入数据
        boolean insert = user.insert();
        System.out.println("result => " + insert);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(12L); //查询条件
        user.setAge(31); //更新数据

        boolean result = user.updateById();
        System.out.println("result => " + result);
    }

    /**
     * 测试全表更新,SQL分析器的阻断效果
     */
    @Test
    public void testUpdateAll() {
        User user = new User();
        user.setAge(31); //更新数据

        boolean result = user.update(null); //设置为null，没有条件,全表更新
        System.out.println("result => " + result);
    }

    /**
     * 测试乐观锁
     */
    @Test
    public void testUpdateVersion() {
        User user = new User();
        user.setId(2L); //查询条件

        User userVersion = user.selectById();

        user.setAge(48); //更新数据
        user.setVersion(userVersion.getVersion()); //当前版本信息

        boolean result = user.updateById(); //设置为null，没有条件,全表更新
        System.out.println("result => " + result);
    }


    @Test
    public void testDelete(){
        User user = new User();
        user.setId(13L);

        boolean delete = user.deleteById();
        System.out.println("result => " + delete);
    }

    @Test
    public void testSelect() {
        User user = new User();

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.gt("age", 30); //大于等于30岁的用户查询出来

        List<User> users = user.selectList(wrapper);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }


}
