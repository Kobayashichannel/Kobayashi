
public class DoWhileExercise01 {

	//��дһ��main����
	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		do {
			//ѭ��ִ�����
			System.out.println("i=" + i);
            //ѭ����������
            i++;
            sum += i;
            

		}while(i <= 100);
		System.out.println("sum" + sum);

		System.out.println("�˳� do..while ����ִ��" + i);
	}
}