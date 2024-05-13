package package3;

import package2.QuestionNo2;

public class QuestionNo3 {

	private QuestionNo2 stack1;
	private QuestionNo2 stack2;

	public QuestionNo3(int capacity) {
		stack1 = new QuestionNo2(capacity);
		stack2 = new QuestionNo2(capacity);
	}

	public void enqueue(int item) {
		stack1.push(item);
	}

	public int dequeue() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		if (!stack2.isEmpty()) {
			return stack2.pop();
		}

		throw new IllegalStateException("Queue is empty");
	}

	public int peek() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		if (!stack2.isEmpty()) {
			return stack2.peek();
		}

		throw new IllegalStateException("Queue is empty");
	}

	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}

}
