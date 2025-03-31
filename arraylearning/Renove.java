import java.util.Scanner;


public class Renove{
    static void removeEle(int arr[], int newArr[], int pos, int size){
        for(int i=0,j=0; i<size; i++){
            if(i!=pos){
                newArr[j++]=arr[i];
           
        
            }
            for(int num: newArr){
                System.out.println(num+"");
            }
        }
    }



    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size =sc.nextInt();
            int arr[] = new int[size];
            for(int i=0; i<size; i++){
                arr[i]=sc.nextInt();
            }
        }
    }
}