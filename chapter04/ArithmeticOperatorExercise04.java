//������ϰ��
public class ArithmeticOperatorExercise04 {

    //��дһ��main����
    public static void main(String[] args) {

        //1.����
        //����һ���������滪���¶�,�����¶�ת�������¶ȵĹ�ʽΪ
        //:5/9*(�����¶�-100),����������¶ȶ�Ӧ�������¶�
        //
        //2.˼·����
        //(1) �ȶ���һ��double huashi(�����¶�) �������� �����¶�
        //(2) ���ݸ����Ĺ�ʽ,���м��㼴��5/9*(�����¶�-100)
        //    ������ѧ��ʽjava���Ե�����
        //(3) ���õ��Ľ�����浽 double sheshi
        //3.�ߴ���

        double huaShi = 234.6;
        double sheShi = 5.0 / 9 * (huaShi - 100);
        System.out.println("�����¶�" + huaShi 
            + "��Ӧ�����϶�=" + sheShi);

    }
}
