public class TestSwitchCase {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade)
		{
		case 'A' :
			System.out.println("����");
			break;
		case 'B' :
		case 'C' :
			System.out.println("����");
			break;
		default:
			System.out.println("λ�õȼ�");
		}
		System.out.println("�ȼ���" + grade);
	}
}