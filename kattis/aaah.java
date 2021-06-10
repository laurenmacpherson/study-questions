import java.util.Scanner; 

public class aaah {
    public static void main (String a[]){
        Scanner in = new Scanner(System.in); 
        String given = in.nextLine(); 
        String needed = in.nextLine(); 

        if (needed.length()<=given.length()){
            System.out.println("go"); 
        }
        else {
            System.out.println("no"); 
        }
    }
}
