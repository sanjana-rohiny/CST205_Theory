package Question10;

public class Question10 {

	public static void getMaxSlice_method1(int[] A) {
		int gSum = 0;
		int tSum = 0;
		int startIndex = 0, endIndex = 0;
		int i,j;
		for (i=0; i<A.length; i++) {
			tSum = A[i];
			for (j=i+1; j<A.length; j++) {
				tSum += A[j];
				System.out.println("i = " + i + "j = " + j + " :: Sum = " + tSum);
				if(gSum < tSum) {
					endIndex = j;
					startIndex = i;
					gSum = tSum;
				}
			}
			
		}
		System.out.println();
		System.out.println("startIndex = " + startIndex);
		System.out.println("endIndex = " + endIndex);
		System.out.println("Sum = " + gSum);
		
	}

	public static void main(String[] args) {
		
		int arr[] = {2, 3, -6, 4, 0};
		getMaxSlice_method1(arr);
		
	}
}



