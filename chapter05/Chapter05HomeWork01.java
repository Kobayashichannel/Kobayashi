//whileѭ������ϰ
//
public class Chapter05HomeWork01 {

	//��дһ��main����
	public static void main(String[] args) {
		/*
        ĳ����100000Ԫ,ÿ����һ��·��,��Ҫ����,�������£�
        (1) ���ֽ�>50000ʱ,ÿ�ν�5%
        (2) ���ֽ�<=50000ʱ,ÿ�ν�1000
        ��̼�����˿��Ծ������ٴ�·��,Ҫ��:ʹ��while break��ʽ���
        
        ˼·����
        1. ���� double money ����100000
        2. �������Ҫ��,���Ƿ����������������
           money > 50000
           money >= 1000 && money <= 50000
           money < 1000
        3. ʹ�ö��֧ if-elseif-else
        4. while+break[money < 10000],ͬʱʹ��һ������count������ͨ��·��
        ����ʵ��
        */

        double money = 100000;//���ж���Ǯ
        int count = 0;//�ۻ�����·��
        while(true) { //����ѭ��
        	if(money > 50000){
        		//money = money - money * 0.05;
        	    money *= 0.95;
        	    count++;
        	} else if(money >= 1000 && money <= 50000){
        		money -= 1000;
        		count++;
        	} else{ //Ǯ����
             break;
         }
      }
      System.out.println(money + "���Թ�" + count + "·��..");
 
	}
}