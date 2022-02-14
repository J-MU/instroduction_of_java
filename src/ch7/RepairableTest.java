package ch7;

import java.util.concurrent.TimeUnit;

public class RepairableTest {

	public static void main(String[] args) throws InterruptedException  {
		Tank tank=new Tank();
		Dropship dropship=new Dropship();
		Marine marine = new Marine();
		SCV scv=new SCV();
		
		marine.attack(dropship);
		marine.attack(dropship);
		marine.attack(dropship);
		tank.attack(marine);
		marine.attack(tank);
		marine.attack(tank);
		marine.attack(tank);
		marine.attack(tank);
		
		System.out.println(dropship);
		System.out.println(marine);
		System.out.println(tank);
		
		scv.repair(dropship);
		scv.repair(tank);
//		scv.repair(marine);
		

		System.out.println(dropship);
		System.out.println(marine);
		System.out.println(tank);
		
		
		
		
	}

}

interface Repairable{}
interface Fightable extends Movable, Attackable{}
interface Movable {
	void move(int x,int y);
}
interface Attackable{
	void attack(Unit u);
}


class Fighter extends Unit implements Fightable{
	int offense_power;
	
	Fighter(String name,int hp,int offense_power) {
		super(name,hp);
		this.offense_power=offense_power;
	}
	
	
	
//	public void move(int x,int y) {
//		System.out.println(x+","+y+"�� �̵��߽��ϴ�.");
//	}
	
	public void attack(Unit u) {
		u.hitPoint=u.hitPoint-offense_power;
	}
}

class Unit implements Movable{
	String name;
	int hitPoint;
	final int MAX_HP;
	int x;
	int y;
	
	Unit(int hp){
		MAX_HP=hp;
	}
	
	Unit(String name,int hp){
		this.MAX_HP = hp;
		this.name=name;
	}
	
	public void move(int x,int y) {
		System.out.println(x+","+y+"�� �̵��߽��ϴ�.");
	}
	
	public String toString() {
		return name;
	}
}

//class GroundUnit extends Unit{
//	GroundUnit(int hp){
//		super(hp);
//	}
//}
//
//class AirUnit extends Unit{
//	public AirUnit(int hp) {
//		super(hp);
//	}
//}

class Tank extends Fighter implements Repairable{
	Tank() {
		super("tank",150,30);
		hitPoint=MAX_HP;
	}
	
	public String toString() {
		return "Tank"+", ���� ü����"+hitPoint+"�Դϴ�.";
	}
	
}

class Dropship extends Unit implements Repairable{

	public Dropship() {
		super("dropship",125);
		hitPoint=MAX_HP;
	}
	
	public String toString() {
		return "DropShip"+", ���� ü����"+hitPoint+"�Դϴ�.";
	}
	
}

class Marine extends Fighter{
	Marine() {
		super("marine",40,5);
		hitPoint=MAX_HP;
	}
	
	public String toString() {
		return "Marine"+", ���� ü����"+hitPoint+"�Դϴ�.";
	}
}

class SCV extends Fighter implements Repairable{
	SCV() {
		super("scv",60,3);
		hitPoint=MAX_HP;
	}
	
	public String toString() {
		return "SCV"+", ���� ü����"+hitPoint+"�Դϴ�.";
	}
	
	void repair(Repairable patient) throws InterruptedException {
		if(patient instanceof Unit) {
			Unit upatient=(Unit)patient;
			while(upatient.hitPoint!=upatient.MAX_HP) {
				upatient.hitPoint++;
				System.out.println("ġ����");
				TimeUnit.SECONDS.sleep(1);
			}
			
			System.out.println("ġ�ᰡ �������ϴ�.");
		}else {
			System.out.println("ġ�� ����� �ƴմϴ�.");
		}
		
	}
}


