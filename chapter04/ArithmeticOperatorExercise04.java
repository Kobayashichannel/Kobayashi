//课堂练习题
public class ArithmeticOperatorExercise04 {

    //编写一个main方法
    public static void main(String[] args) {

        //1.需求
        //定义一个变量保存华氏温度,华氏温度转换摄氏温度的公式为
        //:5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度
        //
        //2.思路分析
        //(1) 先定义一个double huashi(华氏温度) 变量保存 华氏温度
        //(2) 根据给出的公式,进行计算即可5/9*(华氏温度-100)
        //    考虑数学公式java语言的特性
        //(3) 将得到的结果保存到 double sheshi
        //3.走代码

        double huaShi = 234.6;
        double sheShi = 5.0 / 9 * (huaShi - 100);
        System.out.println("华氏温度" + huaShi 
            + "对应的摄氏度=" + sheShi);

    }
}
