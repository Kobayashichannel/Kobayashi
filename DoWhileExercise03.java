import java.util.Scanner;
public class DoWhileExercise03 {

	//��дһ��main����
	public static void main(String[] args) {

		//�����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��Ǯλ��
		//[System.out.println("�Ϻ���:��Ǯ��Y/N")]  do...while
		//
		//����Ϊ��
		//(1) ��ͣ���ʻ�Ǯ��
		//(2) ʹ��char answer ���ܣ�����һ��Scanner����
		//(3) ��do-while��while �ж������ y �Ͳ���ѭ��
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
		   System.out.println("�Ϻ�ʹ��������~");
           System.out.println("�Ϻ���:��Ǯ��Y/N");
           answer = myScanner.next().charAt(0);
           System.out.println("���Ļش���" + answer);
		}while(answer !='y');//�ж������ܹؼ�

		System.out.println("������Ǯ��");
	}
}