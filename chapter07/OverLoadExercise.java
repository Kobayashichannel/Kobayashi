
public class OverLoadExercise {

	//��дһ��main����
	public static void main(String[] args) {

		//�������main ()�����зֱ��ò������������������
		Methods method = new Methods();
		method.m(10);//100
		method.m(10, 20);//100
		method.m("��˳ƽ���� hello");

		//����
		System.out.println(method.max(10, 24));
		System.out.println(method.max(10.0, 21.4));
		System.out.println(method.max(10.0, 1.4, 30));

	}
}

/*
��д����,��Methods�ж����������ط���������.������Ϊm.
���������ֱ����һ��int����������int������һ���ַ����������ֱ�ִ��ƽ�����㲢������,
��˲�������,����ַ�����Ϣ.�������main()�����зֱ��ò������������������

�����������ط���max(), ��һ������,��������intֵ�е����ֵ
�ڶ�������,��������doubleֵ�е����ֵ,����������,
���ص�����doubleֵ�е����ֵ,���ֱ��������������
*/

class Methods {

	//����
	//1. ������ max
	//2. �β� (int)
	//3. int
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

	//����
	//1. ������ max
	//2. �β� (double,double)
	//3. double
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}

	//����
	//1. ������ max
	//2. �β� (double,double,double)
	//3. double
	public double max(double n1, double n2, double n3) {

		//���n1 �� n2�����ֵ
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}


	//1. ������ m
	//2. �β� (int)
	//3. void
	public void m(int n) {
		System.out.println("ƽ��=" + (n * n));
	}

	//1. ������ m
	//2. �β� (int)
	//3. void
	public void m(int n1, int n2) {
		System.out.println("���=" + (n1 * n2));
	}

	//1. ������ m
	//2. �β� (int)
	//3. void
	public void m(String str) {
		System.out.println("�����str=" + str);
	}

}