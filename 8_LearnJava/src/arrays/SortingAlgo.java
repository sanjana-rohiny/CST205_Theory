package arrays;

public class SortingAlgo {

	public static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}

			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}

	}
	
	public static void optimizedBubbleSort(int[] arr) {

		int temp = 0;
		int len = arr.length;
		for (int i = 0; i < len-1; i++) {

			for (int j = 0; j < len-1; j++) {

				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void bubbleSort(int[] arr) {

		int temp = 0;
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {

			for (int j = i + 1; j < len; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void insertionSort(int[] arr) {
		int len = arr.length;

		for (int i = 1; i < len; i++) {
			int key = arr[i];
			int j = i - 1;

			// Move elements of arr[0..i-1], that are greater than key, 
			// to one position ahead of their current position
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {

		int[] num = { 6, 3, 7, 2, 8, 1, 4, 5, 9 };
		optimizedBubbleSort(num);
		System.out.println();

		int[] num1 = { 6, 3, 7, 2, 8, 1, 4, 5, 9 };
		selectionSort(num1);
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();

		int[] num2 = { 6, 3, 7, 2, 8, 1, 4, 5, 9 };
		insertionSort(num2);
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
	}

}
