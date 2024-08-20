//演示for的使用细节

public class ForDetail02 {

	//编写一个main方法
	public static void main(String[] args) {

		int count = 3;
		for (int i = 0,j = 0; i < count; i++,j += 2){
			System.out.println("i=" + i + "j=" + j);
		}
	}
}
