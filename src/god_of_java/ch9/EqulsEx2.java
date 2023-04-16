package god_of_java.ch9;

public class EqulsEx2 {

	public static void main(String[] args) {
		Person p1=new Person(111L);
		Person p2=new Person(111L);
		
		if(p1==p2) {
			System.out.println("���� ��������Դϴ�.");
		}else {
			System.out.println("���� �ٸ�����Դϴ�.");
		}
		
		if(p1.equals(p2)) {
			System.out.println("���� ��������Դϴ�.");
		}else {
			System.out.println("���� �ٸ�����Դϴ�.");
		}
	}

}

class Person{
	long id;
	
	Person(long id){
		this.id=id;
	}
	
	public boolean equals(Object p1) {
		if(p1!=null && p1 instanceof Person) {
			return (id==((Person)p1).id);
		}else
			return false;
	}
}
