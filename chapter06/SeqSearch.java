import java.util.Scanner;

public class SeqSearch {

	//��дһ��main�ķ���
	public static void main(String[] args) {
		/*
		��һ������:��üӥ������ëʨ������ɼ��������������������Ϸ
		�Ӽ�������������һ�����ƣ��ж��������Ƿ����������[˳�����]
		Ҫ��:����ҵ��ˣ�����ʾ�ҵ��ˣ��������±�ֵ

		˼·����
		1. ����һ���ַ�������
		2�� �����û����룬�������飬��һ�Ƚϣ�����У�����ʾ��Ϣ�����˳�
		*/

		//����һ���ַ�������
		String[] names = {"��üӥ��", "��ëʨ��", "��ɼ����", "��������"};
		Scanner myScanner = new Scanner(System.in);

		System.out.println("����������");
		String findName = myScanner.next();

		//�������飬��һ�Ƚϣ�����У�����ʾ��Ϣ�����˳�
		//������ʦ�����һ�����˼��
		int index = -1;
		for(int i = 0; i < names.length; i++){
			//�Ƚ� �ַ��� equals,���Ҫ�ҵ������־��ǵ�ǰԪ��
			if(findName.equals(names[i])) {
				System.out.println("��ϲ���ҵ�" + findName);
				System.out.println("�±�Ϊ=" + i);
				//��i ���浽 index
				index = i;
				break;//�˳�
			}
		}

		if(index == -1) { //û���ҵ�
			System.out.println("sorry,û���ҵ�" + findName);
		}
	}
}