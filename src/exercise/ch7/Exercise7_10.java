package exercise.ch7;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prev_channel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	/*
	 * (1) . 알맞은 코드를 넣어 완성하시오
	 */
	
	void setChannel(int channel) {
		prev_channel=this.channel;
		this.channel=channel;
	}
	
	void setVolume(int volume) {
		this.volume=volume;
	}
	
	int getChannel() {
		return channel;
	}
	
	int getVolume() {
		return volume;
	}
	
	void  gotoPrevChannel() {
		int tmp=0;
		tmp=channel;
		channel=prev_channel;
		prev_channel=tmp;
	}
}

class Exercise7_10 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
		t.setChannel(23);
		t.setChannel(34);
		t.setChannel(45);
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());

		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());

		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());

		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}
	
}