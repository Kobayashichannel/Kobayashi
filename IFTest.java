import java.util.Scanner;//����

public class IFTest {

  public static void main(String[] args) {
    System.out.println("====��Ʊϵͳ=====");
    System.out.println("�������·������䣺" );
    
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    int age = sc.nextInt();
    
    
    if(month >= 1 && month <= 6){
      System.out.println("====��ǰΪ����====");
      if(age >= 18 && age <= 60){
        System.out.println("����Ʊ��Ϊ��" + 60);
      }
      if(age >= 0 && age < 18){
        System.out.println("��ͯƱ��Ϊ��ۣ�" + 60/2);
      }
      if(age > 60 && age <= 150){
        System.out.println("����Ʊ��Ϊ1/3�ۣ�" + 60/3);
      }
      }
    
    if(month > 6 && month <= 12){
      System.out.println("====��ǰΪ����====");
      if(age >= 18 && age <= 60){
        System.out.println("����Ʊ��Ϊ��" + 40);
      }
      if((age >= 0 && age < 18) || (age > 60 && age <= 150) ){
        System.out.println("��ͯ������Ʊ��Ϊ��" + 20);
      }
    }
    
    sc.close();   
}
}

    

      

