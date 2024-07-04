package Question11;

public class Question11 {

	static int findDistinctValues(int[] A) {
		int i = 0, j=0; int flag = 0, count = 0, index = 0;
		
		for(i=0; i<A.length; i++) {
			
			flag = 0;
			for (j=0; j<A.length; j++) {
				if(A[i] == A[j]) {
					flag ++;
				}
			}
			

			if(flag == 1) {
				count ++;
				System.out.println("output = " + A[i]);
			}
		}
		return count;
	}
	
	public static void main (String[] args) {
		int data[] = {2, 1, 1, 3, 9, 1};
		int output[] = new int[data.length];
		
		int count = findDistinctValues(data);
		System.out.println("count = " + count);
		

	}
}
