//������ϰ
import java.util.Scanner;

public class If04 {

	//��дһ��main����
	public static void main(String[] args) {
		/*
		���뱣��ͬ־��֥�����÷�
		�����
		���÷�Ϊ100��ʱ,��� ���ü���;
		���÷�Ϊ(80,90]ʱ �����������;
		���÷�Ϊ[60,80)ʱ �������һ��;
		�������,��� ���ò�����
		��Ӽ������뱣����֥�����÷�,�������ж�
		�ٶ����÷�Ϊ���� int
		*/

		Scanner myScanner = new Scanner(System.in);
		//�����û�����
		System.out.println("���������÷�:");
		int grade = myScanner.nextInt();

		//�ȶ���������÷�,����һ����Χ����Ч�ж� 1-100,������ʾ�������
        
        if(grade >=1 && grade <= 100) {
		//��Ϊ��4�����,����ʹ�ö��֧
			if(grade == 100) {
				System.out.println("���ü���");
			} else if (grade > 80 && grade <= 99) {
				System.out.println("��������");
			} else if (grade >= 60 && grade <= 80) {
				System.out.println("����һ��");
			} else {//������������"���ò�����"
	            System.out.println("���ò�����");
			}

        } else {
            System.out.println("���÷���Ҫ��1-100,����������:)");
        }
     
    }
}