
public class ConstructorDetail {

	//��дһ��main����
	public static void main(String[] args) {
		Person p1 = new Person("king", 40);
		Person p2 = new Person("tom");//��2��������

		Dog dog1 = new Dog();//ʹ�õ���Ĭ�ϵ��޲ι�����
	}
}
class Dog {
	//�������Աû�ж��幹����,ϵͳ���Զ���������һ��Ĭ���޲ι�����(Ҳ��Ĭ�Ϲ�����)
	/*
		Ĭ�Ϲ�����
		Dog() {
	
		}
	*/
	//һ���������Լ��Ĺ�����,Ĭ�ϵĹ������͸�����,�Ͳ�����ʹ��Ĭ�ϵ��޲ι�����
	//������ʾ�Ķ���һ��,��: Dog(){} д(������Ҫ)
	//
	public Dog(String dName) {
		//...
	}
	Dog() { //��ʽ�Ķ���һ�� �޲ι�����

	}
}

class Person {
	String name;
	int age;//Ĭ��0
	//��1��������
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	//��2��������,ָֻ������,����Ҫָ������
	public Person(String pName) {
		name = pName;
	}
}