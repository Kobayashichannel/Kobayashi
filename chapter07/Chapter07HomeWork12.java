
public class Chapter07HomeWork12 {

	//��дһ��main����
	public static void main(String[] args) {
	}
}

/*
����һ��Employee��
������(���֡��Ա����䡢ְλ��нˮ), �ṩ3�����췽��,���Գ�ʼ��
(1) (���֡��Ա����䡢ְλ��нˮ),
(2) (���֡��Ա�����) (3)(ְλ��нˮ),Ҫ���ָ��ù�����
*/
class Employee {
	//���֣��Ա����䣬ְλ��нˮ
	String name;
	char gender;
	int age;
	String job;
	double sal;
	//��ΪҪ����Ը��ù�����,����Ϻ���д�����ٵĹ�����
	//ְλ,нˮ
	public Employee(String job, double sal) {
		this.job = job;
		this.sal = sal;
	}
	//���֣��Ա�����
	public Employee(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	//����,�Ա�,����,ְλ,нˮ
	public Employee(String job, double sal, String name, char gender, int age) {
		this(name, gender, age);
		this.job = job;
		this.sal = sal;
	}

}