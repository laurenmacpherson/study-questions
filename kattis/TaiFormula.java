//Tai's formula 
//https://open.kattis.com/problems/taisformula

import java.util.*;
import java.io.*; 

static class TaiFormula {
    public static void main(String a[]){
        Scanner io = new Scanner(System.in);
        int upper; 
        int lower; 
        int x; 
        double[][] arr; 
        //LinkedHashMap<Integer,String> map = new LinkedHashMap<>(); 
        //using simpson's rule for calculating integrals

        int length = io.nextInt(); //how many values 
        arr = new double[length][2]; //2d array

        for (int i = 0; i < length; i++){
            arr[i][0] = io.nextInt();
            arr[i][1] = io.nextDouble(); 
        }
    }
}