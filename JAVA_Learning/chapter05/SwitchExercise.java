import java.util.Scanner;
public class SwitchExercise {

	//��дһ��main����
	public static void main(String[] args) {

		//ʹ�� switch ��Сд���͵�
		//char��תΪ��д(��������)��ֻת�� a->A,b->B,c,d,e.
		//���������"other".

		//����Scanner�Ķ���
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("������a-e");
		// char c1 = myScanner.next().charAt(0);
		// switch(c1) {
		//     case 'a':
		//     	System.out.println("A");
		//     	break;
		//     case 'b':
		//     	System.out.println("B");
		//     	break;
		//     case 'c':
		//     	System.out.println("C");
		//     	break;
		//     case 'd':
		//     	System.out.println("D");
		//     	break;
		//     case 'e':
		//     	System.out.println("E");
		//     	break;
		//     default:
		//     	System.out.println("�����������");
		// }

		//��ѧ���ɼ�����60�ֵģ����"�ϸ�"������60�ֵ�,
		//���"���ϸ�"��(ע:����ĳɼ����ܴ���100),��ʾ �ɼ�/60
		//˼·����
		//1. �����,����ʹ�� ��֧�����,����Ҫ��ʹ��switch
		//2. ����������Ҫһ��ת��,���˼·��
		//   ����ɼ���[60,100],(int)(�ɼ�/60) = 1
		//   ����ɼ���[0,60),(int)(�ɼ�/60) = 0
        
		//����ʵ��

		double score = 88.5;
		//ʹ��if-else ��֤����ĳɼ���Ч�� 0-100
        if( score >= 0 && score <= 100){
		switch((int)(score / 60)) {
		    case 0 :
		    	System.out.println("���ϸ�");
		    	break;
		    case 1 :
		    	System.out.println("�ϸ�");
		    	break;
		}

	        // default :
	    	 //   System.out.println("��������");
        } else {
        	System.out.println("����ĳɼ�Ҫ��0-100֮��");
        }
	}
}