import java.util.Scanner;

public class AlmostPerfect {
    public static void main (String a[]){
        //perfect: all proper divisors add up to the number
        //almost perfect: all proper divisors add up *close* to the number, no more of a difference than 2 
        //not perfect: does not apply to the above
        Scanner in = new Scanner(System.in); 
        int value = 0; int sum = 0; 
        int remainder;

        while (in.hasNextLine()){ //until end of file
            value = in.nextInt(); 
            
            if (in.hasNextLine()){ in.nextLine(); }

            for (int i = 1 ; i < value ; i++){ //proper doesn't include the value itself
                if (value%i == 0){ //divisible
                    remainder = value%i;
                    System.out.println(value + "%" + i +"="+remainder);
                    sum += i; 
                    System.out.println("Sum: " + sum);
                }
            }

            System.out.println("Sum: " + sum); 

            if (sum == value){
                System.out.println(value + " perfect"); 
            }
            else if(sum >= (value-2) && sum <= (value+2)){
                System.out.println(value + " almost perfect"); 
            }
            else {
                System.out.println(value + " not perfect"); 
            }
        }

        in.close(); 
    }
}
