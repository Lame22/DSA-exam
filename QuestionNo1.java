package package1;

import java.util.Scanner;

public class QuestionNo1 {
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
	}
}
