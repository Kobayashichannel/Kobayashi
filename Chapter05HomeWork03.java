import java.util.Scanner;
//
public class Chapter05HomeWork03 {

	//编写一个main方法
	public static void main(String[] args) {
		System.out.println("请输入年份:");
		Scanner myScanner = new Scanner(System.in);

		int year = myScanner.nextInt();
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
			System.out.println(year + "年是闰年");
		} else {
			System.out.println(year + "年不是闰年");
		}
		System.out.println("程序执行结束");
	} 
}