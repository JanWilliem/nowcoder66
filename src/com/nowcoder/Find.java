package com.nowcoder;

/**
 * Created by Bauhaus on 2016/4/4.
 */
public class Find {
	public static void main(String[] args) {
		int[] line1 = {2, 3, 4, 5, 6};
		int[] line2 = {7, 8, 9, 10, 11};
		int[][] me = new int[][]{line1, line2};

		if (Find(me, 10)) {
			System.out.println(1111);
		} else {
			System.out.println(22222);
		}
	}

	static boolean Find(int[][] array, int target) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == target)
					return true;
			}
		}
		return false;
	}
}
