import java.util.Scanner;//导入

public class If03 {

	//编写一个main方法
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入数字");
		int x = myScanner.nextInt();
		int y = myScanner.nextInt();
		if(x > 5){
	    if(y > 5){
			System.out.println(x + y);
		}System.out.println("韩顺平教育~");
		}else{
			System.out.println("x is" + x);
		}

	}
}