package Chapter12;

import java.util.*;

public class FruitBoxEx2_2 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox=new FruitBox<Fruit>();
		FruitBox<Apple> appleBox=new FruitBox<Apple>();
		FruitBox<Grape> grapeBox=new FruitBox<Grape>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		
		System.out.println("FruitBox-"+fruitBox);
		System.out.println("AppleBox-"+appleBox);
		System.out.println("GrapeBox-"+grapeBox);
	}
	

}
