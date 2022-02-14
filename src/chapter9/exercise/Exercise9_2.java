package chapter9.exercise;

class Exercise9_2 {
	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D(1, 2, 3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?" + (p1 == p2));
		System.out.println("p1.equals(p2)?" + (p1.equals(p2)));
	}
}

class Point3D {
	int x, y, z;

	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Point3D() {
		this(0, 0, 0);
	}

	public boolean equals(Object obj) {
		/*
		 * (1) x, y, z . 인스턴스변수 를 비교하도록 오버라이딩하시오
		 */
		if(obj==null || !(obj instanceof Point3D)) {
			System.out.println("obj를 다시 확인하세연");
			return false;
		}
		
		Point3D tmp=(Point3D)obj;
		
		if(this.x==tmp.x && this.y==tmp.y && this.z ==tmp.z)
		{	
			return true;
		}else {
			return false;
		}
		
	}

	public String toString() {
		/*
		 * (2) x, y, z . 인스턴스변수 의 내용을 출력하도록 오버라이딩하시오
		 */
		return " x :"+x+" y :"+y+" z :"+z;
	}
}
