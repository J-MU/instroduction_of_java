package ch8;

public class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
			CopyFiles();
		}catch(SpaceException e) {
			System.out.println("Error Message: "+e.getMessage());
			e.printStackTrace();
			System.out.println("���� Ȯ���� �ٽ� ��ġ�Ұ�");
		}catch(MemoryException e) {
			System.out.println("Error Message: "+e.getMessage());
			e.printStackTrace();
			System.out.println("�޸� Ȯ���� �ٽ� ��ġ�Ұ�");
		}finally {
			deleteTempFiles();
		}
	}

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace())
			throw new SpaceException("��ġ ������ �����մϴ�.");
		if (!enoughMemory())
			throw new MemoryException("�޸� ������ �����մϴ�.");
	}

	static void CopyFiles() {

	}

	static void deleteTempFiles() {

	}

	static boolean enoughSpace() {
		return false;
	}

	static boolean enoughMemory() {
		return false;
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}
