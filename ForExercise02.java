

public class ForExercise02 {

	//编写一个main方法
	public static void main(String[] args) {

		//完成下面的表达式输出
		//
		//化繁为简
		//(1) 先输出 0 - 5
		//(2) 后面的+是 5-i

		//先死后活
		//(1) 5 替换成变量n

        int n = 10;
		for( int i = 0;  i <= n; i++){
			System.out.println(i + "+" + (n-i) + "=" + n);
		}
	}
}