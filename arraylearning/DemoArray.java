// dataType varName[] =new dataType[size];

// dataType[] varName =new dataType[]{1,2,3};

// dataType[] varName ={1,2,3};

import java.util.Scanner;



public class DemoArray{
    static void insertEle(int arr[], int newArr[], int pos, int ele, int size){
        for(int i=0,j=0; i<size; i++){
            if(i==pos){
                newArr[i]=ele;
           
            }else{
                newArr[i]=arr[j++];
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