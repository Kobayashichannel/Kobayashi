

public class YangHui {

	//��дһ��main�ķ���
	public static void main(String[] args) {
		/*
		1
		1 1
		1 2 1
		1 3 3  1
		1 4 6  4  1
		1 5 10 10 5 1

		����
		1.��һ���� 1 ��Ԫ��,��n����n��Ԫ��
		2.ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض���1
		3.�ӵ����п�ʼ,���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ�ص�ֵ. arr[i][j]
		  arr[i][j] = arr[i-1][j] + arr[i-1][j-1];//�����ҵ��������

		  */
		int[][] yangHui = new int[10][];
		for(int i = 0; i < yangHui.length; i++) {

			//��ÿ��һά����(��)���ռ�
			yangHui[i] = new int[i+1];
			//��ÿһһά����(��) ��ֵ
			for(int j = 0; j < yangHui[i].length; j++) {
				//ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض���1
				if(j == 0 || j == yangHui[i].length - 1) {
					yangHui[i][j] = 1;
				} else {
					yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
				}
			}
		}
		//����������
		for(int i = 0; i < yangHui.length; i++) {
			for(int j = 0; j < yangHui[i].length; j++){
				System.out.println(yangHui[i][j] + "\t");
			}
			System.out.println();//����
		}
	}	
}