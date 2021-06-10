import java.io.*;
import java.util.*; 

public class Kornislav {
    public static void main(String a[]){
        Scanner in = new Scanner (System.in); 
        //int current; 
        int[] arr = new int[4]; 

        //current = in.nextInt(); 
        //arr[0] = current; //initialize first 

        for (int i = 0; i < 4; i++){
            arr[i] = in.nextInt(); //fill array 
        }
        in.close(); //close scanner 

        arr = insertionSort(arr);

        int area = arr[0]*arr[2]; 
        
        System.out.println(area); 
    }

    public static int[] insertionSort(int a[]){ //insertion sort is suited because it's a very small list size
    //to make this more efficient perhaps we could combine the array creation phase with the sorting, so it is sorted as the array is created 
        int n = a.length;
        int temp, j;  
        for (int k = 1; k < n; k++){
            temp = a[k]; 
            j = k-1; 
            while (j >= 0 && temp <= a[j]){
                a[j+1] = a[j];
                j = j-1; 
            }
            a[j+1] = temp; 
        }
        return a; 
    }
}