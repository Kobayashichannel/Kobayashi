

public class BreakDetail {

    //��дһ��main����
    public static void main(String[] args){

        label1:
        for(int j = 0; j < 4; j++){//���for
        lable2:
            for(int i = 0; i < 10; i++){//�ڲ�for
            	if(i == 2){
            		break label1 ;//�ȼ� break lable2
            	}
                System.out.println("i = " + i);
            }
        }
    }
}