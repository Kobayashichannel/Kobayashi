import java.util.Scanner;//����

public class Nestedlf {
 
//��дһ��main����
	public static void main(String[] args) {
		/*
		�μӸ��ֱ�������������ɼ�����8.0�������
		������ʾ��̭�����Ҹ����Ա���ʾ�����������Ů����
		*/

		//˼·����
		//1. ����Scanner����,�����û�����
		//2. ���� �ɼ����浽 double score
		//3. ʹ�� if-else �ж� ��������ɼ�����8.0�������,������ʾ��̭
		//4. ������뵽����,�ٽ��� char gender,ʹ�� if-else �����Ϣ
		//����ʵ��

		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ø��ֵĳɼ�");
		double score = myScanner.nextDouble();
		if ( score > 8.0 ){
			System.out.println("�������Ա�");
			char gender = myScanner.next().charAt(0);
			if( gender == '��'){
				System.out.println("����������");
			} else if( gender == 'Ů'){
				System.out.println("����Ů����");
		    } else {
		    	System.out.println("����Ա�����,���ܲμӾ���");
		    }    
		} else {
			System.out.println("sorry,�㱻��̭��~");
		}
	}
}