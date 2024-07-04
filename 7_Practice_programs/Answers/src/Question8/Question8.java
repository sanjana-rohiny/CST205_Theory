package Question8;

public class Question8 {
static int getSecondlargest_method1(int arr[]) {
		
		int temp = 0, length = arr.length;
		for (int i=0; i<2; i++) {
			for (int j = i+1; j<length; j++) {
				if (arr[i] <arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	    System.out.println("Second element  = " + arr[1]);
	    return arr[1];
	}

	static int getSecondlargest_method2(int arr[]) {
	    int first = 0, second = 0;
	    
	    for (int i=0; i< arr.length; i++) {
	    	if (first < arr[i]) {
	    		second = first;
	    		first = arr[i];
	    	} else  {
	    		if (second < arr[i] && first != arr[i]) {
	    			second = arr[i];
	    		}
	    	}
	    }
	    System.out.println("Second element  = " + second);
		return second;
	}
	
	public static void main(String args[]) {	
		
		int arr[] = {1,6,2,4,3,6,7,9};
		getSecondlargest_method1(arr);
		getSecondlargest_method2(arr);

	}
}
