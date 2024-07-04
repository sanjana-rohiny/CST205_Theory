package Question5;

public class Question5 {
	public static int solution(int[] A) {
		int i = 0, j=0;
		int count = 0;
		for (i =0; i<A.length-1; i++) {
			count = 0;
			for (j=0; j<A.length-1; j++) {
				
				if (A[i] == A[j]) {
					count+=1;
				}
			}
			
			if (count == 1) {
				break;
			}
		}
		System.out.println("Value = " + A[i]);
		return A[i];
	}
	
	public static void main(String[] args) {
		
		//int ip [] = {1,4,3,3,1,2};
		int ip [] = {1,2,3,4,1,2,3,4,5,6};

		solution(ip);

	}
}
