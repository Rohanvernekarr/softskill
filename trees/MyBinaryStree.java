public class MyBinaryStree {
    static class Node {
        Node left , right;
        int data;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        Node root = buildTree(arr, 0);
        inorder(root);
        
        System.out.println();
        preorder(root);
        System.out.println();
    }
    //inorder
    static void inorder(Node root) {
        if(root == null) {
            return;
        } 
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    //preorder
    static void preorder(Node root) {
        if(root == null) {
            return;
        } 
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    //buildTree
    static Node buildTree(int arr[], int i) {
        if(i >= arr.length) {
            return null;
        }
        Node root = new Node(arr[i]);
        root.left = buildTree(arr, 2*i + 1);
        root.right = buildTree(arr, 2*i + 2);
        return root;
    }

    
}
