

public class OverLoad01 {

	//��дһ��main����
	public static void main(String[] args) {

		// System.out.println(100);
		// System.out.println("hello,world");
		// System.out.println('h');
		// System.out.println(1.1);
		// System.out.println(true);
		//
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2));
		System.out.println(mc.calculate(1.1, 2));
	}
}

class MyCalculator {
	//���������ĺ�
	public int calculate(int n1, int n2) {
		System.out.println("calculate(int n1, int n2) ������..");
		return n1 + n2;
	}
	
	// û�й��ɷ�������,��Ȼ�Ǵ����,��Ϊ�Ƿ������ظ����塣
	// public void calculate(int n1, int n2) {
	// 	System.out.println("calculate(int n1, int n2) ������..");
	// 	int res = n1 + n2;

	//���������Ƿ񹹳�����,û�й���,���Ƿ������ظ�����,�ʹ���
	// public double calculate(int a1, double a2) {
	// 	System.out.println("calculate(int a1, int a2) ������..");
	// 	return a1 + a2;
	}
	//һ��double, һ��int��
	public double calculate(double n1, int n2) {
		System.out.println("calculate(double n1, int n2) ������..");
		return n1 + n2;
	}
	//����int�ĺ�
	public int calculate(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
}
