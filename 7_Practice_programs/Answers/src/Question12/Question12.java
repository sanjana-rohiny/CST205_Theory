package Question12;

public class Question12 {
	public static int maxAbsoluteDifference(int[] arr) {
	    int maxDiff = 0;
	    int n = arr.length;
	    
	    for (int i = 0; i < n; i++) {
	        for (int j = i+1; j < n; j++) {
	            int diff = Math.abs(arr[i] - arr[j]);
	            if (diff > maxDiff) {
	                maxDiff = diff;
	            }
	        }
	    }
	    
	    return maxDiff;
	}

	
	public static void main(String[] args) {
		int arr[] = {2, 4, 1, 16, 7, 5};
		
		int val = maxAbsoluteDifference(arr);
		System.out.println("Abs diff = " + val);
	}
}
