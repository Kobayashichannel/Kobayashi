//while循环的练习
//
public class WhileExercise {

	//编写一个main方法
	public static void main(String[] args) {

		// 打印1-100之间所有能被3整除的数[使用while]
        // 化繁为简,先死后活

		int i = 1;
		int endNum = 100;
		while( i <= endNum ){	
	        if( i % 3 == 0){
		      System.out.println("i=" + i);//执行语块
		}
          i++;
	    }	

		// 打印40-200之间所有的偶数[使用while]
		// 化繁为简,先死后活(利于思考)
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
