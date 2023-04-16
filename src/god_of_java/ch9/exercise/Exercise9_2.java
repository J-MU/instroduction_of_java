package god_of_java.ch9.exercise;

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
		 * (1) x, y, z . �ν��Ͻ����� �� ���ϵ��� �������̵��Ͻÿ�
		 */
		if(obj==null || !(obj instanceof Point3D)) {
			System.out.println("obj�� �ٽ� Ȯ���ϼ���");
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
		 * (2) x, y, z . �ν��Ͻ����� �� ������ ����ϵ��� �������̵��Ͻÿ�
		 */
		return " x :"+x+" y :"+y+" z :"+z;
	}
}
