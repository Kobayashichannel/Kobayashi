import java.util.Scanner;//导入

public class IFTest {

  public static void main(String[] args) {
    System.out.println("====出票系统=====");
    System.out.println("请输入月份与年龄：" );
    
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    int age = sc.nextInt();
    
    
    if(month >= 1 && month <= 6){
      System.out.println("====当前为旺季====");
      if(age >= 18 && age <= 60){
        System.out.println("成人票价为：" + 60);
      }
      if(age >= 0 && age < 18){
        System.out.println("儿童票价为半价：" + 60/2);
      }
      if(age > 60 && age <= 150){
        System.out.println("老人票价为1/3价：" + 60/3);
      }
      }
    
    if(month > 6 && month <= 12){
      System.out.println("====当前为淡季====");
      if(age >= 18 && age <= 60){
        System.out.println("成人票价为：" + 40);
      }
      if((age >= 0 && age < 18) || (age > 60 && age <= 150) ){
        System.out.println("儿童与老人票价为：" + 20);
      }
    }
    
    sc.close();   
}
}

    

      

