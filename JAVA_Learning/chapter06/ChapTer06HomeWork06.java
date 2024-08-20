

public class ChapTer06HomeWork06 {

	//编写一个main的方法
	public static void main(String[] args) {

		char[] arr1 = {'a','z','b','c'};
		char[] arr2 = arr1;
		arr1[2] = '韩';

		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr1[i] + "," + arr2[i]);
		}
		
	}
}