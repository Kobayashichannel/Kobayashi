

public class Chapter07HomeWork08 {
	int count = 9;//����
	public void count1() { //Chapter07HomeWork08��ĳ�Ա����
		count = 10; //���count�������� �ĳ�10
		System.out.println("count1=" + count); //10
	}
	public void count2() { //Chapter07HomeWork08��ĳ�Ա����
		System.out.println("count1=" + count++);
	}

	//����Chapter07HomeWork08���main�������κ�һ���࣬������main
	public static void main(String args[]) {
		//�Ϻ����
		//1. new Test() ������������������ʹ�ú�,�Ͳ���ʹ��
		//2. new Test().count1() ���������������,�͵���count1() 
		new Chapter07HomeWork08().count1();

		Chapter07HomeWork08 t1 = new Chapter07HomeWork08();
		t1.count2();
		t1.count2();		
	}
}