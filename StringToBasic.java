
public class StringToBasic {

    //��дһ��main����
    public static void main(String[] args) {

    	//������������ ->String

    	int n1 = 100;
    	float f1 = 1.1F;
    	double d1 = 4.5;
    	boolean b1 = true;
    	String S1 = n1 + "";
    	String S2 = f1 + "";
    	String S3 = d1 + "";
    	String S4 = b1 + "";
    	System.out.println(S1 + " " + S2 + " " + S3 + " " + S4);

        //String->��Ӧ�Ļ�����������
        String S5 = "123";
        //����OOP ������ͷ���
        //��� ʹ�� �����������Ͷ�Ӧ�İ�װ��,����Ӧ�������õ�������������
        int num1 = Integer.parseInt(S5); 
        double num2 = Double.parseDouble(S5);
        float num3 = Float.parseFloat(S5); 
        long num4 = Long.parseLong(S5);
        byte num5 = Byte.parseByte(S5);
        boolean b = Boolean.parseBoolean("true");
        short num6 = Short.parseShort(S5);

        System.out.println("================");
        System.out.println(num1);//123
        System.out.println(num2);//123.0
        System.out.println(num3);//123.0
        System.out.println(num4);//123
        System.out.println(num5);//123
        System.out.println(num6);//123
        System.out.println(b);//true


        System.out.println(S5.charAt(0));


 

    }
}