package linearsearch;

public class linear {

    public static void main(String[] args){
        int[] arr = { 1 ,3,4,5,6,7,8,};
        int target = 5;
        int index = linearSearch(arr, target);

        if(index == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
    
}
