package god_of_java.ch7.exercise;

import java.util.Random;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		/*
		 * (1) SutdaCard . 배열 를 적절히 초기화 하시오
		 * 1 1K 2 2 3 3K 4 4 5 5 6 6 7 7 8 8K 9 9 10 10 초기화를 해준다.
		 * 랜덤하게 썪어준다.(shuffle method를 만들어서 구현.
		 */
		int j=1;
		for(int i=0; i<20; i=i+2) {
			
			cards[i]=new SutdaCard(j,false);
			if(j==1 | j==3 | j==8) {
				cards[i+1]=new SutdaCard(j,true);
			}else{
				cards[i+1]=new SutdaCard(j,false);
			}
			
			j++;
		}
		shuffle();
	}

	public void shuffle() {
		// 0~19까지의 숫자를 무작위로 뽑아야함/
		int random1=0;int random2=0;
		SutdaCard tmp;
		
		Random rand=new Random();
		for(int i=0; i<100; i++) {
			random1=rand.nextInt(19);
			random2=rand.nextInt(19);
			tmp=cards[random1];
			cards[random1]=cards[random2];
			cards[random2]=tmp;
		}
	}
	
	public SutdaCard pick(int index) {
		return cards[index];
	}
	
	public SutdaCard pick() {
		Random rand=new Random();
		int random1=rand.nextInt(19);
		
		return cards[random1];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

// info() Object toString() . 대신 클래스의 을 오버라이딩했다
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ", ");
	}
}