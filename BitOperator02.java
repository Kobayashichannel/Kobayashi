
public class BitOperator02 {

	//编写一个main方法
	public static void main(String[] args) {
		System.out.println(1 >> 2); //0
		System.out.println(1 << 2); //4
		System.out.println(4 << 3); //32
		System.out.println(15 >> 2); //3

		System.out.println(-10.4%3); //-1.4的近似值 

		int i =66;
		System.out.println(++i+i);

		int num1 = ((int)"18");
		int num2 = (18.0);
		double num3 = 3d;
		double num4 = 8;
		int i = 48; 
		char ch = i+1;
		byte b = 19;
		short s = b + 2;

	}
}
