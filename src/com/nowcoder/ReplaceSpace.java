package com.nowcoder;

/**
 * Created by Bauhaus on 2016/4/4.
 */
public class ReplaceSpace {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("We are family");
		System.out.println(ReplaceSpace(sb));
	}

	static String ReplaceSpace(StringBuffer stringBuffer) {
		char[] s = " ".toCharArray();
		for (int i = 0; i < stringBuffer.length() ; i++) {
			if (s.equals(stringBuffer.charAt(i)))
			{
				stringBuffer.replace(i,i,"%20");
			}
		}
		return stringBuffer.toString();
	}
}
