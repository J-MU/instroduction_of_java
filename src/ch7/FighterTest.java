//package ch7;
//
//public class FighterTest {
//
//	public static void main(String[] args) {
//		Fighter oppenser=new Fighter("oppenser",10,100);
//		Unit depenser=new Unit("depenser",100);
//		
//		
//		if(oppenser instanceof Unit) {
//			System.out.println("f는 unit클래스의 자손입니다.");
//		}
//		if(oppenser instanceof Fightable) {
//			System.out.println("f는 Fightable인터페이스의 자손입니다.");
//		}
//		if(oppenser instanceof Movable) {
//			System.out.println("f는 Movable 인터페이스의 자손입니다.");
//		}
//		if(oppenser instanceof Attackable) {
//			System.out.println("f는 Attackable 인터페이스의 자손입니다.");
//		}
//		if(oppenser instanceof Object) {
//			System.out.println("f는 Object 클래스의 자손입니다.");
//		}
//		
//		oppenser.move(10, 10);
//		depenser.move(10,10);
//		oppenser.attack(depenser);
//	}
//
//}
//
//class Fighter extends Unit implements Fightable{
//	Fighter(String name,int hp,int oppense_power) {
//		super(name,hp);
//		this.offense_power=offense_power;
//		System.out.println("생성자에서 offense_power: "+offense_power);
//	}
//	
//	int offense_power;
//	
////	public void move(int x,int y) {
////		System.out.println(x+","+y+"로 이동했습니다.");
////	}
//	
//	public void attack(Unit u) {
//		u.hitPoint=u.hitPoint-offense_power;
//		System.out.println(u+"의 남은 체력은"+u.hitPoint+"입니다.");
//	}
//}
//
//class Unit implements Movable{
//	String name;
//	int hitPoint;
//	final int MAX_HP;
//	int x;
//	int y;
//	
//	Unit(int hp){
//		MAX_HP=hp;
//	}
//	
//	Unit(String name,int hp){
//		this.MAX_HP = hp;
//		this.name=name;
//	}
//	
//	public void move(int x,int y) {
//		System.out.println(x+","+y+"로 이동했습니다.");
//	}
//	
//	public String toString() {
//		return name;
//	}
//}
//
//interface Fightable extends Movable, Attackable{}
//interface Movable {
//	void move(int x,int y);
//}
//interface Attackable{
//	void attack(Unit u);
//}
//
