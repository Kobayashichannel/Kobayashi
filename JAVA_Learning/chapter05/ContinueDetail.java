

public class ContinueDetail {

    //��дһ��main����
    public static void main(String[] args){

    	label1:
    	for(int j = 0; j < 2; j++){
    		label2:
    		for(int i = 0; i < 10; i++){
    			if(i == 2){
    				//�����ֱ����ʲôֵ,������
    				//continue;
    				//continue ; //�ȼ��� continue label2
    				continue label1;
    			}
    			System.out.println(" i = " + i);
    		}
    	}
    }
}