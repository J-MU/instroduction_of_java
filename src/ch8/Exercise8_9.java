package ch8;

public class Exercise8_9 {

	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException("�������� �ʴ� ����Դϴ�.",100);
	}
}

class UnsupportedFuctionException extends RuntimeException{
	final private int ERR_CODE;
	
	public UnsupportedFuctionException(String msg,int ERR_CODE) {
		super(msg);
		this.ERR_CODE=ERR_CODE;
	}
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		String err_message="["+ERR_CODE+"]"+super.getMessage();
		return err_message;
	}
}

//DLTLDUD