//whileѭ������ϰ
//
public class WhileExercise {

	//��дһ��main����
	public static void main(String[] args) {

		// ��ӡ1-100֮�������ܱ�3��������[ʹ��while]
        // ����Ϊ��,�������

		int i = 1;
		int endNum = 100;
		while( i <= endNum ){	
	        if( i % 3 == 0){
		      System.out.println("i=" + i);//ִ�����
		}
          i++;
	    }	

		// ��ӡ40-200֮�����е�ż��[ʹ��while]
		// ����Ϊ��,�������(����˼��)
		//
        System.out.println("========");
		int j = 40;
		int endNum2 = 200;
		while( j <= endNum2 ){
			if( j % 2 == 0){
				System.out.println("j=" + j);
			}
			j++;
		}
	}
}
