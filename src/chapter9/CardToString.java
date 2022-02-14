package chapter9;

class CardToString {

	public static void main(String[] args) {
		Card card1=new Card();
		Card card2=new Card();
		
		System.out.println(card1.toString());
		System.out.println(card2.toString());
	}

}

class Card{
	int number;
	String kind;
	
	Card(String kind,int number){
		this.kind=kind;
		this.number=number;
	}
	Card(){
		this("SPADE",1);
	}
	
	
	public String toString() {
		String Class_name=getClass().getName();
		String return_str="����� "+kind+"�̰� ���ڴ�"+number+"�̰� Class_name�� "+Class_name+"�Դϴ�.!";
		return return_str;
	}
}
