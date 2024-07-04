package generics;

public class GenericType <T> {
	T obj;
	
	GenericType(T obj) {
		this.obj = obj; 
	}
	
	public T getObject () {
		return this.obj;
	}
}
