import java.util.Scanner;
//�����Ӧ��
//
public class Array02 {

	//��дһ��main�ķ���
	public static void main(String[] args) {
		//��ʾ �������� ������[]=new ��������[��С]
		//ѭ������5���ɼ�, ���浽double����,�����

		//����
		//1. ����һ�� double ����, ��С 5

		double[] scores = new double[5];
		//2. ѭ������
		//   scores.length ��ʾ����Ĵ�С/����
		Scanner myScanner = new Scanner(System.in);
		for( int i = 0; i < scores.length; i++){
            System.out.println("�������" + (i+1) + "��Ԫ�ص�ֵ");
            scores[i] = myScanner.nextDouble();
		}

		//���, ��������
		System.out.println("==�����Ԫ��/ֵ���������:====");
		for( int i = 0; i < scores.length; i++){
			  System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ" + scores[i]);
		}
            
	}
}