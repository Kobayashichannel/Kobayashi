

public class MethodDetail {

	//��дһ��main����
	public static void main(String[] args) {

		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("��=" + res[0]);
		System.out.println("��=" + res[1]);

		//1. һ�����������һ������ֵ [˼��,��η��ض����� ��������]
	}
}

class AA {

	public int[] getSumAndSub(int n1, int n2) {

		int[] resArr = new int[2]; //����һ������
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	//2. �������Ϳ���Ϊ��������,�����������ͻ�	��������(����,����)
	//   �� getSumAndSub

	//3. �������Ҫ���з�����������,�򷽷���������ִ��������Ϊ return ֵ;
	//����Ҫ�󷵻�ֵ���ͱ����return��ֵ����һ�»����;
	//
	public double f1() {
		
	}
}