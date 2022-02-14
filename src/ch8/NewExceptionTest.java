package ch8;

public class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
			CopyFiles();
		}catch(SpaceException e) {
			System.out.println("Error Message: "+e.getMessage());
			e.printStackTrace();
			System.out.println("공간 확보후 다시 설치할것");
		}catch(MemoryException e) {
			System.out.println("Error Message: "+e.getMessage());
			e.printStackTrace();
			System.out.println("메모리 확보후 다시 설치할것");
		}finally {
			deleteTempFiles();
		}
	}

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace())
			throw new SpaceException("설치 공간이 부족합니다.");
		if (!enoughMemory())
			throw new MemoryException("메모리 공간이 부족합니다.");
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
