public class TestSwitchCase {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade)
		{
		case 'A' :
			System.out.println("优秀");
			break;
		case 'B' :
		case 'C' :
			System.out.println("良好");
			break;
		default:
			System.out.println("位置等级");
		}
		System.out.println("等级是" + grade);
	}
}