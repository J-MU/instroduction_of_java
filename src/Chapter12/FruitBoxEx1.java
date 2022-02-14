package Chapter12;

import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	ArrayList<T> getList() {
		return list;
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}

}

public class FruitBoxEx1 {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> AppleBox = new Box<Apple>();
		Box<Toy> ToyBox = new Box<Toy>();

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());

		AppleBox.add(new Apple());
		AppleBox.add(new Apple());

		ToyBox.add(new Toy());

		System.out.println(fruitBox);
		System.out.println(AppleBox);
		System.out.println(ToyBox);

	}

}
