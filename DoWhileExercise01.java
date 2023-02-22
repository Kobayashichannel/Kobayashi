
public class DoWhileExercise01 {

	//编写一个main方法
	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		do {
			//循环执行语句
			System.out.println("i=" + i);
            //循环变量迭代
            i++;
            sum += i;
            

		}while(i <= 100);
		System.out.println("sum" + sum);

		System.out.println("退出 do..while 继续执行" + i);
	}
}