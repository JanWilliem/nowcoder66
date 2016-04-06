package com.nowcoder;

/**
 * Created by Bauhaus on 2016/4/4.
 */
public class ReplaceSpace {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(ReplaceSpace(sb));
	}

	static String ReplaceSpace(StringBuffer str) {
		 String s = str.toString().replaceAll(" ", "%20");

		return s;
	}
}
