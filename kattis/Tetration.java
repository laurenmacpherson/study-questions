import java.util.*; 

public class Tetration{
    public static void main(String a[]){
        Scanner in = new Scanner(System.in); 
        double n = in.nextDouble(); 

        //definition of inverse of infinite tetration
        System.out.println(Math.pow(n, (1/n)));
    }
}