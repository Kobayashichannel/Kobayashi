
public class StringToBasic {

    //编写一个main方法
    public static void main(String[] args) {

    	//基本数据类型 ->String

    	int n1 = 100;
    	float f1 = 1.1F;
    	double d1 = 4.5;
    	boolean b1 = true;
    	String S1 = n1 + "";
    	String S2 = f1 + "";
    	String S3 = d1 + "";
    	String S4 = b1 + "";
    	System.out.println(S1 + " " + S2 + " " + S3 + " " + S4);

        //String->对应的基本数据类型
        String S5 = "123";
        //会在OOP 讲对象和方法
        //解读 使用 基本数据类型对应的包装类,的相应方法，得到基本数据类型
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