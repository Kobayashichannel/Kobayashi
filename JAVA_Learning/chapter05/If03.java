import java.util.Scanner;//����

public class If03 {

	//��дһ��main����
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		int x = myScanner.nextInt();
		int y = myScanner.nextInt();
		if(x > 5){
	    if(y > 5){
			System.out.println(x + y);
		}System.out.println("��˳ƽ����~");
		}else{
			System.out.println("x is" + x);
		}

	}
}