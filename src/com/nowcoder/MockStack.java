package com.nowcoder;

import java.util.Stack;

/**
 * Created by Bauhaus on 2016/4/10.
 */
public class MockStack {
	public static void main(String[] args) {

	}

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {

		stack1.push(node);

	}

	public int pop() {

		while (!stack2.isEmpty())
		{
			return stack2.pop();
		}
		while (!stack1.isEmpty())
		{
			stack2.push(stack1.pop());
		}
		return stack2.pop();

	}
}
