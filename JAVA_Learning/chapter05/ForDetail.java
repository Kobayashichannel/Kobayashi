
//��ʾfor��ʹ��ϸ��

public class ForDetail {

	//��дһ��main����
	public static void main(String[] args) {

		//for(;ѭ���ж�����;)
		//�еĳ�ʼ���ͱ�����������д�������ط�,�������ߵķֺŲ���ʡ��

		//ʹ��forѭ������
		int i = 1; //ѭ�������ĳ�ʼ��
		for( ; i <= 10; ) {
			System.out.println("���,��˳ƽ����" + i);
			i++;
		}

		System.out.println("i=" + i );
        int j = 1;
		//����
		for(;;) { //��ʾһ������ѭ��,��ѭ��
			System.out.println("ok~ "+ (j++));
		}
	}
}