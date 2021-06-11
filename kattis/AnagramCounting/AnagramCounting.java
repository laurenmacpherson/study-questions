import java.util.Scanner;
import java.math.*; 

public class AnagramCounting {
    public static void main (String a[]){
        Scanner in = new Scanner(System.in); 
        String line; 
        int length; 
        BigInteger anagram = new BigInteger("1"); 

        while (in.hasNextLine()){
            line = in.nextLine(); 
            length = line.length(); 
            System.out.println("length: " + length); 

            anagram = factorial(length);
            System.out.println(anagram);
        }
        in.close(); 
    }

    //code does not work in the case of repeating letters, need to add a check for that

    public static BigInteger factorial(int length){
        BigInteger anagram = new BigInteger("1"); 
        for (int i = length; i > 1; i--){
            anagram = anagram.multiply(BigInteger.valueOf(i));
        }
        return anagram; 
    }
}
