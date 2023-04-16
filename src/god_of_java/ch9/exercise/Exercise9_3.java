package god_of_java.ch9.exercise;

class Exercise9_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		/*
		 * (1) . 알맞은 코드를 넣어 완성하시오
		 */
		int last_index=fullPath.lastIndexOf("\\");
		path=fullPath.substring(0, 14);
		fileName=fullPath.substring(15);

		
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}/*
	 * fullPath: c:\jdk1.8\work\PathSeparateTest.java 
	 * path: c:\jdk1.8\work
	 * fileName: PathSeparateTest.java
	 */