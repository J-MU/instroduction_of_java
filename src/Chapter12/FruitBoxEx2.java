package Chapter12;

public class FruitBoxEx2 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox=new FruitBox<Fruit> ();
		FruitBox<Apple> appleBox=new FruitBox<Apple> ();
		FruitBox<Grape> grapeBox=new FruitBox<Grape> ();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
		//appleBox.add(new Grape());
		//The method add(Apple) in the type Box<Apple> is not applicable for the arguments (Grape)
		
		
		
		grapeBox.add(new Grape());
		
		System.out.println("FruitBox-"+fruitBox);
		System.out.println("AppleBox-"+appleBox);
		System.out.println("GrapeBox-"+grapeBox);
	}

}


interface Eatable{}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

