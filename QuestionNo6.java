package package6;

import java.util.Arrays;

public class QuestionNo6 {

	public static int[] deleteElement(int[] array, int index) {
		if (index < 0 || index >= array.length) {
			System.out.println("Invalid index.");
			return array;
		}

		int[] modifiedArray = new int[array.length - 1];
		for (int i = 0, k = 0; i < array.length; i++) {
			if (i == index) {
				continue;
			}
			modifiedArray[k++] = array[i];
		}
		return modifiedArray;
	}

	public static void main(String[] args) {
		int[] array = { 3, 7, 1, 9, 4 };
		System.out.println("Original array: " + Arrays.toString(array));

		int indexToDelete = 2;
		array = deleteElement(array, indexToDelete);

		System.out.println("Modified array: " + Arrays.toString(array));
	}
}