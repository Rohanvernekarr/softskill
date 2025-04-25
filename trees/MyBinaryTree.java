public class MyBinaryTree {
    Static class Node{
        Node left , right;
        int data;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        Node root = buildTree(arr, 0);
        inorder(root);
    }

    static void inorder(Node root){
        if(root == null){
            return;
          } 
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static Node buildTree(int arr[], int i){
        if(i >= arr.length){
            return null;
        }
        Node root = new Node(arr[i]);
        root.left = buildTree(arr, 2*i + 1);
        root.right = buildTree(arr, 2*i + 2);
        return root;
    
}
