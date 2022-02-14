package exercise.ch7;

class Exercise7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product cart index �迭 �� ����

	void buy(Product p) {
		/*
		 * (1) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 
		 * 1.1 . ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ� 
		 * 1.2 ,���� ���� ����ϸ� ��ǰ�� ������ ���� ������ ���� 
		 * 1.3 .(add )
		 */
		if(money<p.price) { 
			System.out.println("�ܾ��� �����Ͽ� "+p.toString()+"��/�� �� �� �����ϴ�.");
			return ;
		}
			
		
		money-=p.price;
		add(p);

	}

	void add(Product p) {
		int new_array_length;
		int old_array_length;
		
		/*
		 * (2) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 
		 * 1.1 i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ�� 1.1.
		 * 1 2 . ������ ��ٱ��Ϻ��� �� ū ���ο� �迭�� �����Ѵ� 
		 * 1.1.2 . ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ� 
		 * 1.1.3 . ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ�
		 * �ٲ۴� 1.2 (cart) . i
		 *  1 . ������ ��ٱ��� �� �����Ѵ� �׸��� �� ���� ������Ų��
		 */
		if(i>=cart.length) {
			//cart=new Product[]
			old_array_length=cart.length;
			new_array_length=cart.length*2;
			System.out.println("�迭 ������ ������ ���θ���ϴ�.");
			Product[] tmp_cart=new Product[new_array_length];

			for(int i=0; i<cart.length; i++) {
				tmp_cart[i]=cart[i];
			}
			cart=tmp_cart;
		}
		cart[i]=p;
		i++;
	} // add(Product p)

	void summary() {
		int sum_price=0;
		/*
		 * (3) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 
		 * 1.1 . ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ� 
		 * 1.2 . ��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ� 
		 * 1.3 (money) . ������ ��� ���� �ݾ� �� ����Ѵ�
		 */
		for(int i=0; i<cart.length; i++)
			sum_price+=cart[i].price;
		
		System.out.println("<<<<<<<<<<<<<<��ٱ��� ���� ���>>>>>>>>>>>>>>>");
		for(int i=0; i<cart.length; i++) {
			System.out.println(i+". "+cart[i]+" ���� : "+cart[i].price);
		}
		System.out.println();
		System.out.println();
		
		System.out.println("<<<<<<<<<<<��ٱ��� ���� �Ѿ�>>>>>>>>>>");
		System.out.println("�Ѿ�: "+sum_price);
		System.out.println();
		System.out.println();
		
		System.out.println("<<<<<<<<<���� ��>>>>>>>>>>>>>>>>>>");
		System.out.println("���� �� : "+ (money));
	} // summary()
}

class Product {
	int price; // ��ǰ�� ����

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}