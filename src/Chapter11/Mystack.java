package Chapter11;

import java.util.Vector;

public class Mystack extends Vector {

	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	public Object pop() {
		Object item=peek();
		//삭제 하는 코드 들어가야함./
		removeElementAt(size()-1);
		return item;
	}
	
	public Object peek() {
		return lastElement();
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public int search(Object o) {
		int i=lastIndexOf(o);
		
		if(i>=0)
			return size()-i;
		else
			return -1;
	}
}
