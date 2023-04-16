package god_of_java.ch9;

public class ShallowDeepCopy {

	public static void main(String[] args) {
		Circle c1=new Circle(new Point(1,1),2.0);
		Circle c2=c1.ShallowCopy();
		Circle c3=c1.DeepCopy();
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		
		c1.p.x=9;
		c1.p.y=9;
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
	}

}

class Circle implements Cloneable {
	Point p;
	double r;

	Circle(Point p, double d) {
		this.p=p;
		this.r = d;
	}

	public Circle ShallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return (Circle)obj;
	}

	public Circle DeepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		Circle c=(Circle)obj;
		
		c.p=new Point(p.x,p.y);
		
		return c;
	}
	
	public String toString() {
		return "p :"+p+"r :"+r;
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}