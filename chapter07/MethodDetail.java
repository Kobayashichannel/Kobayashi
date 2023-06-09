

public class MethodDetail {

	//编写一个main方法
	public static void main(String[] args) {

		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);

		//1. 一个方法最多有一个返回值 [思考,如何返回多个结果 返回数组]
	}
}

class AA {

	public int[] getSumAndSub(int n1, int n2) {

		int[] resArr = new int[2]; //创建一个数组
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	//2. 返回类型可以为任意类型,包含基本类型或	引用类型(数组,对象)
	//   看 getSumAndSub

	//3. 如果方法要求有返回数据类型,则方法体重最后的执行语句必须为 return 值;
	//而且要求返回值类型必须和return的值类型一致或兼容;
	//
	public double f1() {
		
	}
}