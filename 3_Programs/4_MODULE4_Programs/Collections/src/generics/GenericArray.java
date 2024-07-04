package generics;

public class GenericArray <T> {
	Object[] objArr;
	int count;
	GenericArray() {
		objArr = new Object[200]; 
		count = 0;
	}
	
	public void AddData(T obj) {
		objArr[count++] = (Object) obj;
	}
	
	public T getObjectAt(int index) {
		return (T) objArr[index];
	}

	

}
