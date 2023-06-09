package com.hspedu.annotation_;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings({"all"})
public class SuppressWarnings_ {

    //老韩解读
    //1. 当我们不希望看到这些警告的时候, 可以使用 SuppressWarnings注解来抑制警告信息
    //2. 在{""}中, 可以写入你希望的抑制(不显示)警告信息
    //3. 可以指定的警告类型有
    //4. 关于SuppressWarnings 作用范围是和你的放置的位置相关
    //   比如 @SuppressWarnings 放置在 main方法, 那么抑制警告的范围就是 main
    //5. 看看 @SuppressWarnings 源代码
    /*
    @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
        @Retention(RetentionPolicy.SOURCE)
        public @interface SuppressWarnings {
            String[] value();
            }
     */
    //@SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("");
        list.add("");
        list.add("");
        int i;
        System.out.println(list.get(1));
    }

    public void f1(){
        //@SuppressWarnings({"all"})
        List list = new ArrayList();
        list.add("");
        list.add("");
        list.add("");
        //@SuppressWarnings({"all"})
        int i;
        System.out.println(list.get(1));
    }
}
