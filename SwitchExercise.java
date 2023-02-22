import java.util.Scanner;
public class SwitchExercise {

	//编写一个main方法
	public static void main(String[] args) {

		//使用 switch 把小写类型的
		//char型转为大写(键盘输入)。只转换 a->A,b->B,c,d,e.
		//其他的输出"other".

		//创建Scanner的对象
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("请输入a-e");
		// char c1 = myScanner.next().charAt(0);
		// switch(c1) {
		//     case 'a':
		//     	System.out.println("A");
		//     	break;
		//     case 'b':
		//     	System.out.println("B");
		//     	break;
		//     case 'c':
		//     	System.out.println("C");
		//     	break;
		//     case 'd':
		//     	System.out.println("D");
		//     	break;
		//     case 'e':
		//     	System.out.println("E");
		//     	break;
		//     default:
		//     	System.out.println("你的输入有误");
		// }

		//对学生成绩大于60分的，输出"合格"。低于60分的,
		//输出"不合格"。(注:输入的成绩不能大于100),提示 成绩/60
		//思路分析
		//1. 这道题,可以使用 分支来完成,但是要求使用switch
		//2. 这里我们需要一个转换,变成思路：
		//   如果成绩在[60,100],(int)(成绩/60) = 1
		//   如果成绩在[0,60),(int)(成绩/60) = 0
        
		//代码实现

		double score = 88.5;
		//使用if-else 保证输入的成绩有效的 0-100
        if( score >= 0 && score <= 100){
		switch((int)(score / 60)) {
		    case 0 :
		    	System.out.println("不合格");
		    	break;
		    case 1 :
		    	System.out.println("合格");
		    	break;
		}

	        // default :
	    	 //   System.out.println("输入有误");
        } else {
        	System.out.println("输入的成绩要在0-100之间");
        }
	}
}