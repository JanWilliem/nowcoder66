package com.nowcoder;

/**
 * Created by Bauhaus on 2016/4/18.
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 */
public class NumberOf1 {
	public static void main(String[] args) {
		int x = NumberOf1(10);
		System.out.println(x);
	}

	private static int NumberOf1(int n) {
		String s = Integer.toBinaryString(n);
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			String s1 = String.valueOf(s.charAt(i));
			int i1 = Integer.parseInt(s1);

			if (i1 == 1) {
				j++;
			}
		}
		return j;
	}
}
