package com.nowcoder;

/**
 * Created by Bauhaus on 2016/4/13.
 */
public class JumpFloor {
	public static void main(String[] args) {
		int i = JumpFloor(4);
		System.out.println(i);
	}
	public static int JumpFloor(int target)
	{
		if(target <= 0)
			return 0;
		else if(target == 1)
			return 1;
		else if(target == 2)
			return 2;
		else
			return JumpFloor(target-1) + JumpFloor(target-2);

	}
}
