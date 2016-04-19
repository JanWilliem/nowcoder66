package com.nowcoder;

/**
 * Created by Bauhaus on 2016/4/18.
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Power {

	public static void main(String[] args) {
		double x = 2D;
		int y = 3;
		Double r = Power(x, y);
		System.out.println(r.toString());
	}

	public static double Power(double base, int exponent) {
		double result = base;
		if (exponent == 0) {
			return 1;
		}
		if (exponent > 0) {
			for (int i = 0; i < exponent - 1; i++) {
				result = result * base;
			}
			return result;

		} else {
			int flag = -exponent;
			for (int i = 0; i < flag; i++) {
				result = result * base;
			}
			return 1 / result;
		}

	}
}

