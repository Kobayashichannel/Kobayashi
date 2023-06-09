
public class LogicOperatorExercise04 {

    //编写一个main方法
    public static void main(String[] args) {

    	int x = 5;
    	int y = 5;
    	if(x++ == 5 || ++y == 5){ //短路或
            x = 11;
        }
        System.out.println("x=" + x + "y=" + y);
    }
}