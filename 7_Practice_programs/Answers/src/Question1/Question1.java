package Question1;

public class Question1 {
public static int findOriginalAndSum(int input1[], int input2) {
		
		int output[] = new int [input2];
		int input3 = input1.length;
		input2 = input3;
		System.out.println("input2: size = " + input2);
		System.out.println("input1.length = " + input1.length);

		output[input2-1] = input1[input2-1];
		int sum = output[input2-1];
		for (int i=input1.length-1; i>0; i--) {
			output[i-1] =  input1[i-1] - output[i];
			System.out.println("output[" + (i-1) +"] = " + output[i-1]);
			sum = sum+output[i-1];
		}
		
		System.out.println("output.length = " + output.length);
		System.out.println("Sum = " + sum);

		for (int i=0; i<output.length; i++) {
			System.out.print(" " + output[i]);
		}
		return sum;
	}
	public static void main(String[] args) {

		int ip [] = {7,6,8,16,12,3};
		findOriginalAndSum(ip, ip.length);
	}
}
