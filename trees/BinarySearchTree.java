import java.util.Arrays;

public class BinarySearchTree {
	
	static class TreeNode{
		TreeNode left,right;
		int data;
		TreeNode(int data){
			this.data=data;
		}
	}
	
	static TreeNode BST(int arr[]) {
		return buildBST(0, arr.length-1, arr);
	}
	
	static TreeNode buildBST(int start, int end, int arr[]) {
		if(start > end)
			return null;
		
		int mid = (start+end)/2;
		
		TreeNode node = new TreeNode(arr[mid]);
		
		node.left = buildBST(0, mid-1, arr);
		node.right = buildBST(mid+1, end, arr);
		
		return node;
	}

	public static void main(String[] args) {
		
		java.util.Scanner sob=new java.util.Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sob.nextInt();
		int arr[]=new int[10];
		
		
		System.out.println("enter the elements for array");
		
		for(int i=0;i<10;i++)
			arr[i]=sob.nextInt();
		
		Arrays.sort(arr);
		
		TreeNode root = BST(arr);

	}

}