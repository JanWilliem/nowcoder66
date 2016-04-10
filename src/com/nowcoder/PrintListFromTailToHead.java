package com.nowcoder;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Bauhaus on 2016/4/6.
 */
public class PrintListFromTailToHead {

	public static void main(String[] args) {

		ListNode listNode = new ListNode(2);


		ArrayList<Integer> a = printListFromTailToHead(listNode);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

	}

	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<>();
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> list = new ArrayList<>();
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}

	public static class ListNode {
		int val;

		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}
