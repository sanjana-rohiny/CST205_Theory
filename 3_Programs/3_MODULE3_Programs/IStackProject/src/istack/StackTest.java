package istack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack st = new MyStack(10);
		
		for (int i=0; i<10; i++) {
			st.push(i+100);
		}
		
		for (int i=0; i<10; i++) {
			int data = st.pop();
			System.out.println(data);
		}
		
		for (int i=0; i<10; i++) {
			st.push(i+2000);
		}
		st.clear();
		
		/* uncomment clear() form MyStack */
		int data = st.pop();
		System.out.println(data);
	}

}
