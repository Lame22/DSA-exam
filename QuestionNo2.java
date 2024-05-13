package package2;

import java.util.EmptyStackException;

public class QuestionNo2 {

	private int[] stack;
	private int top;

	public QuestionNo2(int capacity) {
		stack = new int[capacity];
	}

	public void push(int value) {
		if (top == stack.length) {
			int[] newArray = new int[2 * stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}

		stack[top++] = value;
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		int value = stack[--top];
		stack[top] = 0;
		return value;
	}

	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return stack[top - 1];
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public void printStack() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}


