package com.hspedu.string_;

public class StringMethod02 {
    public static void main(String[] args) {
        //1.toUpperCase转换成大写
        String s = "hello";
        System.out.println(s.toUpperCase()); //HELLO
        //2.toLowerCase
        System.out.println(s.toLowerCase()); //hello
        //3.concat拼接字符串
        String s1 = "宝玉";
        s1 = s1.concat("林黛玉").concat("薛宝").concat("together");
        System.out.println(s1);//宝玉林黛玉薛宝together
        //4.replace 替换字符串中的字符
        s1 = "宝玉 and 林黛玉 林黛玉 林黛玉";
        //在s1中,将所有的 林黛玉 替换成 jack
        //  老韩解读:s1.replace() 方法执行后,返回的结果才是替换过的.
        //  注意对 s1没有任何影响
        String s11 = s1.replace("宝玉","jack");
        System.out.println(s1); //宝玉 and 林黛玉 林黛玉 林黛玉
        System.out.println(s11); //jack and 林黛玉 林黛玉 林黛玉
        //5. split 分割字符串,对于某些分割字符,我们需要转义 比如 | \\等
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        //老韩解读
        //1. 以,为标准时 poem 进行分割,返回一个数组
        //2. 在对字符串进行分割时候,如果有特殊字符,需要加入 转移符 \
        String[] split = poem.split(",");
        poem = "E:\\aaa\\bbb";
        split = poem.split("\\\\");
        // String[] split = poem.spilt("\\\\");
        // String[] split = poem.spilt("\\\\");
        System.out.println("==分割后内容==");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //6.toCharArray 转换成字符数组
        s = "happy";
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        //7.compareTo 比较两个字符串的大小,如果前者大,
        //则返回正数,如果后者大,则返回负数,如果相等,则返回0
        //老韩解读
        //(1) 如果长度相同,并且每个字符也相同,就返回0
        //(2) 如果长度相同或者不相同,但是在进行比较时,可以区分大小
        //     就返回 if (c1 != c2) {
        //                return c1 - c2;
        //              }
        //(3) 如果前面的部分相同,就返回 str1.len - str2.len
        String a = "jackabc"; //len = 3
        String b = "jack"; //len = 4
        System.out.println(a.compareTo(b)); //返回值是 'c' - 'a' = 2的值
        //8.format 格式字符串
        /**
         * 占位符有:

         */
        String name = "john";
        int age = 10;
        double score = 98.3 /3;
        char gender = '男';
        //将所有的信息都拼接在一个字符串.
        //1. %S,%d,%.2f,%c 称为占位符
        //2. 这些占位符由后面变量来替换
        //3. %S 表示后面由 字符串来替换
        //4. %d 是整数来替换
        //5. %.2f 表示使用小数来替换，替换后,只会保留小数点两位,并且进行四舍五入的处理
        //6. %c 使用Char 类型来替换
        String info =
                "我的姓名是" + name + "年龄是" + age + ",成绩是" + score + "性别是" + gender + "。希望大家喜欢我";
        System.out.println(info);

        String formatStr = "我的姓名是%S 年龄是%d, 成绩是%.2f 性别是%c.希望大家喜欢我";

        String info2 = String.format(formatStr,name,age,score,gender);

        System.out.println("info2=" + info2);

    }
}
