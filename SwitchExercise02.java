import java.util.Scanner;
public class SwitchExercise02 {

	//编写一个main方法
	public static void main(String[] args) {

        //创建Scanner的对象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入1-12");
		int month = myScanner.nextInt();
		switch(month) {
		    case 3:
		    case 4:
		    case 5:
		    	System.out.println("这是春季");
		    	break;
		    case 6:
		    case 7:
		    case 8:
		    	System.out.println("这是夏季");
		    	break;
		    case 9:
		    case 10:
		    case 11:
		    	System.out.println("这是秋季");
		    	break;
		    case 12:
		    case 1:
		    case 2:
		    	System.out.println("这是冬季");
		    	break;
		    default:
		    	System.out.println("你的输入有误");
		}
	}
}