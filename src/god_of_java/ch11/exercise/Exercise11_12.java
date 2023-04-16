package god_of_java.ch11.exercise;

import java.util.*;

class Exercise11_12 {
	public static void main(String args[]) throws Exception {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		
		Player p1 = new Player("Ÿ¥", deck.pick(), deck.pick());
		Player p2 = new Player("���", deck.pick(), deck.pick());
		Player victory;
		System.out.println(p1 + " " + deck.getPoint(p1));
		System.out.println(p2 + " " + deck.getPoint(p2));
		
		if(deck.getPoint(p1)>deck.getPoint(p2)) {
			victory=p1;
		}else {
			victory=p2;
		}
		
		System.out.println(victory.name+"���� �¸��Ͽ����ϴ�.!");
	}
}


class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];
	int pos = 0; // ������ ������ ī���� ��ġ
	
	
	HashMap jokbo = new HashMap(); // HashMap ������ ������

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard2(num, isKwang);
		}
		registerJokbo(); // . ������ ����Ѵ�
	}

	void registerJokbo() {
		/*
		 * (1) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 1. jokbo(HashMap) . �� ������ �����Ѵ� �� ī���� ���� ���ڿ��� �ٿ��� ��
		 * ������ �� �����Ѵ� key , value .
		 */
		jokbo.put("KK", Integer.valueOf(4000));jokbo.put("12", Integer.valueOf
				(2060));
		jokbo.put("1010", Integer.valueOf(3100));jokbo.put("21", Integer.valueOf(2060));
		jokbo.put("99", Integer.valueOf(3090));jokbo.put("14", Integer.valueOf(2050));
		jokbo.put("88", Integer.valueOf(3080));jokbo.put("41", Integer.valueOf(2050));
		jokbo.put("77", Integer.valueOf(3070));jokbo.put("19", Integer.valueOf(2040));
		jokbo.put("66", Integer.valueOf(3060));jokbo.put("91", Integer.valueOf(2040));
		jokbo.put("55", Integer.valueOf(3050));jokbo.put("110", Integer.valueOf(2030));
		jokbo.put("44", Integer.valueOf(3040));jokbo.put("101", Integer.valueOf(2030));
		jokbo.put("33", Integer.valueOf(3030));jokbo.put("410", Integer.valueOf(2020));
		jokbo.put("22", Integer.valueOf(3020));jokbo.put("104", Integer.valueOf(2020));
		jokbo.put("11", Integer.valueOf(3010));jokbo.put("46", Integer.valueOf(2010));
		jokbo.put("64", Integer.valueOf(2010));
	}

	int getPoint(Player p) {

		if (p == null)
			return 0;
		SutdaCard2 c1 = p.c1;
		SutdaCard2 c2 = p.c2;
		Integer result = 0;
		String key_str;
		/*
		 * (2) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 1. , jokbo "KK" . ī�� �� ���� ��� ���̸� ���� Ű�� �� �ؼ� ������
		 * ��ȸ�Ѵ� 2. (num) jokbo . �� ī���� ���� �� ���� ����� ��ȸ�Ѵ� 3. , . �ش��ϴ� ����� ������ �Ʒ��� �������� ������
		 * ����Ѵ� (c1.num + c2.num) % 10 + 1000 4. Player (point) . �� ���� �� ����� ���� �����Ѵ�
		 */
		
		if(c1.isKwang && c2.isKwang) {
			result.valueOf(4000);
		}else {
			key_str=""+c1.num+c2.num;
			result=(Integer)jokbo.get(key_str);
			if(result ==null) {
				result=(c1.num + c2.num) % 10 + 1000;
			}
		}
		return result.intValue();
	}

	SutdaCard2 pick() throws Exception {
		SutdaCard2 c = null;
		if (0 <= pos && pos < CARD_NUM) {
			c = cards[pos];
			cards[pos++] = null;
		} else {
			throw new Exception("�����ִ� ī�尡 �����ϴ� .");
		}
		return c;
	}

	void shuffle() {
		for (int x = 0; x < CARD_NUM * 2; x++) {
			int i = (int) (Math.random() * CARD_NUM);
			int j = (int) (Math.random() * CARD_NUM);
			SutdaCard2 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
} // SutdaDeck

class Player {
	String name;
	SutdaCard2 c1;
	SutdaCard2 c2;
	int point; // - ī���� ��޿� ���� ���� ���� �߰�

	Player(String name, SutdaCard2 c1, SutdaCard2 c2) {
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}

	public String toString() {
		return "[" + name + "]" + c1.toString() + "," + c2.toString();
	}
} // class Player

class SutdaCard2 {
	int num;
	boolean isKwang;

	SutdaCard2() {
		this(1, true);
	}

	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}