

public class ArrayExercise01 {

	//��дһ��main�ķ���
	public static void main(String[] args) {
        
        /*
        ����һ��char���͵�26��Ԫ�ص�����,�ֱ����'A'-'Z'.
        ʹ��forѭ����������Ԫ�ز���ӡ������
        ��ʾ:char������������'A'+ 2 -> 'C'

        ˼·����
        1. ����һ�� ���� char[] chars = new char[26]
        2. ��Ϊ 'A' + 1 = 'B' ����,������ʦʹ��for����ֵ
        3. ʹ��forѭ����������Ԫ�ز���ӡ����
        */
        char[] chars = new char[26];
        for( int i = 0; i < chars.length; i++){
        	//chars �� char[]
        	//chars[i] �� char
        	chars[i] = (char)('A' + i);//'A' + i ��int,��Ҫǿ��ת��
        }

        //ѭ�����
        System.out.println("===chars����===");
        for( int i = 0; i < chars.length; i++){
        	System.out.print(chars[i] + " ");
        }
	}
}