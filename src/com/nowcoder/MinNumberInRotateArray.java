package com.nowcoder;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Bauhaus on 2016/4/12.
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个非递减序列的一个旋转，
 * 输出旋转数组的最小元素。例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 */
public class MinNumberInRotateArray {

	public static void main(String[] args) {
		int[] array = {3, 4, 5, 1, 2};

		int i = minNumberInRotateArray(array);
		System.out.println(i);
	}

	private static int minNumberInRotateArray(int[] array) {
		if (array.length == 0 || array == null)
		{
			return 0;
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
		}
		Collections.sort(arrayList);
		return arrayList.get(0);
	}

}
