package com.nowcoder;

/**
 * Created by Bauhaus on 2016/4/18.
 */
public class RectCover {

	public static void main(String[] args) {
		int i = RectCover(10);
		System.out.println(i);
	}

	public static int RectCover(int target)
	{
		if(target<=1){
			return 1;
		}
		else if(target==2){
			return 2;
		}else{
			return RectCover(target-1)+RectCover(target-2);
		}
	}
}
