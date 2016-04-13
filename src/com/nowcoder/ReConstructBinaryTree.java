package com.nowcoder;

import java.util.HashMap;

/**
 * Created by Bauhaus on 2016/4/10.
 */
public class ReConstructBinaryTree {
	public static void main(String[] args) {

		int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
		int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
		TreeNode node = reConstructBinaryTree(pre, in);

	}

	private static TreeNode root;

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
		return root;
	}

	//前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
	private static TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {

		if(startPre>endPre||startIn>endIn)
			return null;
		TreeNode root=new TreeNode(pre[startPre]);

		for(int i=startIn;i<=endIn;i++)
			if(in[i]==pre[startPre]){
				root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
				root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
			}

		return root;
	}

	/*public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre == null || in == null) {
			return null;
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < in.length; i++) {
			map.put(in[i], i);
		}
		return preIn(pre, 0, pre.length - 1, in, 0, in.length - 1, map);

	}

	private static TreeNode preIn(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn, HashMap<Integer, Integer> map) {
		if (startPre > endPre) {
			return null;
		}

		TreeNode head = new TreeNode(pre[startPre]);
		int index = map.get(pre[startPre]);
		head.left = preIn(pre, startPre + 1, startPre + index - startIn, in, startIn, index - 1, map);
		head.right = preIn(pre, startPre + index - startIn + 1, endPre, in, index + 1, endIn, map);
		return head;
	}

	public static void buildTree(TreeNode node, int data) {
		if (root == null) {
			root = new TreeNode(data);
		} else {
			if (data < node.val) {
				if (node.left == null) {
					node.left = new TreeNode(data);
				} else {
					buildTree(node.left, data);
				}
			} else {
				if (node.right == null) {
					node.right = new TreeNode(data);
				} else {
					buildTree(node.right, data);
				}
			}

		}
	}*/
}
