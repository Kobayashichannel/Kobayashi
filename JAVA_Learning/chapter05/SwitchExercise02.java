import java.util.Scanner;
public class SwitchExercise02 {

	//��дһ��main����
	public static void main(String[] args) {

        //����Scanner�Ķ���
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������1-12");
		int month = myScanner.nextInt();
		switch(month) {
		    case 3:
		    case 4:
		    case 5:
		    	System.out.println("���Ǵ���");
		    	break;
		    case 6:
		    case 7:
		    case 8:
		    	System.out.println("�����ļ�");
		    	break;
		    case 9:
		    case 10:
		    case 11:
		    	System.out.println("�����＾");
		    	break;
		    case 12:
		    case 1:
		    case 2:
		    	System.out.println("���Ƕ���");
		    	break;
		    default:
		    	System.out.println("�����������");
		}
	}
}