
public class LogicOperatorExercise01 {

    //编写一个main方法
    public static void main(String[] args) {

    	int x = 5;
    	int y = 5;
    	if(x++ == 6 & ++y == 6) { //逻辑与
                  x = 11;
    	}
    	System.out.println("x=" + x + "y=" + y);

    }
}

