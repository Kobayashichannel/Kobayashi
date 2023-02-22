
public class LogicOperatorExercise02 {

    //编写一个main方法
    public static void main(String[] args) {

        int x = 5, y = 5;

        if(x++ == 6 && ++y == 6){ //短路与
                    x = 11;
        }
        System.out.println("x=" + x + "y=" + y);
    }
}