package istack;

public interface IStack {
	void push(int data);
	int pop();
	
	default void clear() {
		System.out.println("Not implemented in implemented function");
	}
	
}
