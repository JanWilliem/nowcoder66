package com.nowcoder;

/**
 * Created by Bauhaus on 2016/4/13.
 */
public class Fibonacci {
	public static void main(String[] args) {


	}
	public int fibonacci(int n)
	{
		if(n<=1){
			return n;
		}
		if ((n==1)||(n==2))
			return 1;
		else return fibonacci(n-2)+fibonacci(n-1);
	}

}
