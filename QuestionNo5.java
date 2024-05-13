package package5;

import java.util.Scanner;

public class QuestionNo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of the array: ");
		int length = scanner.nextInt();
		int[] numbers = new int[length];
		System.out.println("Enter " + length + " numbers:");
		for (int i = 0; i < length; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.print("Enter a number to be searched: ");
		int searchNumber = scanner.nextInt();

		int count = 0;
		for (int number : numbers) {
			if (number == searchNumber) {
				count++;
			}
		}

		if (count > 0) {
			System.out.println(searchNumber + " is present in the array " + count + " time(s).");
		} else {
			System.out.println(searchNumber + " is not present in the array.");
		}

		mergeSort(numbers, 0, numbers.length);
	}

	public static void mergeSort(int[] array, int init, int fin) {

		if (fin - init <= 1) {
			return;
		}

		int mid = (init + fin) / 2;
		int[] leftHalf = new int[mid - init];
		int[] rightHalf = new int[fin - mid];
		for (int i = init; i < mid; i++) {
			leftHalf[i - init] = array[i - init];
		}
		for (int j = mid; j < fin; j++) {
			rightHalf[j - mid] = array[j - init];
		}

		mergeSort(leftHalf, init, mid);
		mergeSort(rightHalf, mid, fin);
		merge(array, leftHalf, rightHalf, init, mid, fin);

	}

	private static void merge(int[] array, int[] leftHalf, int[] rightHalf, int init, int mid, int fin) {

		int i = init;
		int j = mid;
		int k = init;
		while (i < mid && j < fin) {
			if (leftHalf[i - init] <= rightHalf[j - mid]) {
				array[k++ - init] = leftHalf[i++ - init];
			} else {
				array[k++ - init] = rightHalf[j++ - mid];
			}
		}

		while (i < mid) {
			array[k++ - init] = leftHalf[i++ - init];
		}

		while (j < fin) {
			array[k++ - init] = rightHalf[j++ - mid];
		}
	}

}
