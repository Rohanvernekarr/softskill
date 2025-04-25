package trees;

class TNode{
    int data;
    TNode left , right ;
    TNode(int d){
        data = d;
        left = right = null;
    }
}

public class Binarytree 
{
    
    TNode buildTree(int arr[], int i)
    {
        if(i >= arr.length)
        {
            return null;
        }
        TNode root = new TNode(arr[i]);
        root.left = buildTree(arr, 2*i+1);
        root.right = buildTree(arr, 2*i+2);
        return root;


    }

    public static void main(String[] args) 
    {
        MyBinarytree m = new MyBinarytree();
        int arr[] = {10, 20, 30, 40, 50};
        m.buildTree(arr, 0);
    }
    
}
