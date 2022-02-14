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
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product cart index 배열 에 사용될

	void buy(Product p) {
		/*
		 * (1) . 아래의 로직에 맞게 코드를 작성하시오 
		 * 1.1 . 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다 
		 * 1.2 ,가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고 
		 * 1.3 .(add )
		 */
		if(money<p.price) { 
			System.out.println("잔액이 부족하여 "+p.toString()+"을/를 살 수 없습니다.");
			return ;
		}
			
		
		money-=p.price;
		add(p);

	}

	void add(Product p) {
		int new_array_length;
		int old_array_length;
		
		/*
		 * (2) . 아래의 로직에 맞게 코드를 작성하시오 
		 * 1.1 i의 값이 장바구니의 크기보다 같거나 크면 1.1.
		 * 1 2 . 기존의 장바구니보다 배 큰 새로운 배열을 생성한다 
		 * 1.1.2 . 기존의 장바구니의 내용을 새로운 배열에 복사한다 
		 * 1.1.3 . 새로운 장바구니와 기존의 장바구니를
		 * 바꾼다 1.2 (cart) . i
		 *  1 . 물건을 장바구니 에 저장한다 그리고 의 값을 증가시킨다
		 */
		if(i>=cart.length) {
			//cart=new Product[]
			old_array_length=cart.length;
			new_array_length=cart.length*2;
			System.out.println("배열 공간이 부족해 새로만듭니다.");
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
		 * (3) . 아래의 로직에 맞게 코드를 작성하시오 
		 * 1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다 
		 * 1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다 
		 * 1.3 (money) . 물건을 사고 남은 금액 를 출력한다
		 */
		for(int i=0; i<cart.length; i++)
			sum_price+=cart[i].price;
		
		System.out.println("<<<<<<<<<<<<<<장바구니 물건 목록>>>>>>>>>>>>>>>");
		for(int i=0; i<cart.length; i++) {
			System.out.println(i+". "+cart[i]+" 가격 : "+cart[i].price);
		}
		System.out.println();
		System.out.println();
		
		System.out.println("<<<<<<<<<<<장바구니 물건 총액>>>>>>>>>>");
		System.out.println("총액: "+sum_price);
		System.out.println();
		System.out.println();
		
		System.out.println("<<<<<<<<<남는 돈>>>>>>>>>>>>>>>>>>");
		System.out.println("남는 돈 : "+ (money));
	} // summary()
}

class Product {
	int price; // 제품의 가격

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