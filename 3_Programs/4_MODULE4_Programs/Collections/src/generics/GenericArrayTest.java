package generics;

public class GenericArrayTest {

	public static void main(String[] args) {
		
		GenericArray<String> gArr = new GenericArray<String>();
		
		gArr.AddData("ASIET1");
		gArr.AddData("ASIET2");
		gArr.AddData("ASIET3");

		System.out.println(gArr.getObjectAt(0));
		System.out.println(gArr.getObjectAt(1));
		System.out.println(gArr.getObjectAt(2));

		GenericArray<Float> gFloat = new GenericArray<Float>();
		gFloat.AddData(new Float(3.14));
		gFloat.AddData(new Float(3.15));
		gFloat.AddData(new Float(3.16));
		
		System.out.println(gFloat.getObjectAt(0));
		System.out.println(gFloat.getObjectAt(1));
		System.out.println(gFloat.getObjectAt(2));

		
	}

}
