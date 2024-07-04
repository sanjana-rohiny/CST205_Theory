package istack;

public class MyStack implements IStack{
int stack[];
int pos;
public MyStack(int size) {
	super();
	stack = new int[size];
	pos = -1;
}
@Override
public void push(int data) {
	// TODO Auto-generated method stub
	
	if (pos == stack.length-1) {
		System.out.println("Stack overflow..!");
		return;
	}
	
	stack[++pos] = data;
}

@Override
public int pop() {
	// TODO Auto-generated method stub
	
	if (pos < 0 ) {
		System.out.println("Stack empty ..!");
		return -1;
	}
	return stack[pos--];
}

/*
public void clear() {
	pos = -1;
}*/





	
}
