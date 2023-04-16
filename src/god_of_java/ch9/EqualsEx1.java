package god_of_java.ch9;

public class EqualsEx1 {

	public static void main(String[] args) throws CloneNotSupportedException{
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3;
		if (v1.equals(v2)) {
			System.out.println("�� ��ü�� �����ϴ�.");
		} else {
			System.out.println("�� ��ü�� �ٸ��ϴ�.");
		}
		System.out.println("v1: "+v1);
		v1 = v2;
		if (v1.equals(v2)) {
			System.out.println("�� ��ü�� �����ϴ�.");
		} else {
			System.out.println("�� ��ü�� �ٸ��ϴ�.");
		}

		v3 = v1.clone();
		if(v3 instanceof Value) {
			System.out.println("value�Դϴ�.");
		}
		System.out.println("V3 : "+v3.value);
		if (v1.equals(v3)) {
			System.out.println("�� ��ü�� �����ϴ�.");
		} else {
			System.out.println("�� ��ü�� �ٸ��ϴ�.");
		}
		
		System.out.println("v1: "+v1);
		System.out.println("v2: "+v2);
		System.out.println("v3: "+v3);
	}
}

class Value implements Cloneable {
	int value;

	Value(int value) {
		this.value = value;
	}

	public Value clone() throws CloneNotSupportedException {

		Object ov=super.clone();
		if(ov instanceof Value)
			System.out.println("�� value");
		
		return (Value)ov;
	}
}
