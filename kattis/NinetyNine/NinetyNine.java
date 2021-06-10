import java.util.Scanner; 

public class NinetyNine {
    public static void main(String a[]){
        //0-29 friend always increases by 1?
        //30-59 friend always increases by 2?
        //friend plays randomly unless at 98
        Scanner in = new Scanner(System.in); 
        int lastNumber = 0; //the last number that was played
        
        System.out.println("2"); 

        //objective, make your opponent's last value be 97
        while (lastNumber < 30) {
            lastNumber = lastNumber+ in.nextInt()+2; 
            //lastNumber = in.nextInt()+2; 
            in.nextLine(); 
            System.out.println("Program: " + lastNumber); 
        } //will result in 32
        while (lastNumber < 60){
            //lastNumber = lastNumber+in.nextInt()+1; 
            lastNumber = in.nextInt()+1; 
            in.nextLine();  
            System.out.println("Program: " + lastNumber);
        } //will result in 62 
        while (lastNumber < 93){
            //lastNumber = lastNumber+in.nextInt()+2; 
            lastNumber = in.nextInt()+1; 
            in.nextLine();  
            System.out.println("Program: " + lastNumber);
        }
        while (lastNumber < 99){
            //targetNum = 98-lastNumber; //we are trying to prevent the game from receiving 98 
            lastNumber = in.nextInt();
            in.nextLine();

            if (lastNumber == 93) {
                lastNumber += 2; 
                System.out.println("Program: " + lastNumber);
            }
            else if (lastNumber == 94) {
                lastNumber += 2; 
                System.out.println("Program: " + lastNumber);
            }
            else if (lastNumber == 95) {
                lastNumber += 2; 
                System.out.println("Program: " + lastNumber);
            }
            else if (lastNumber == 96) {
                lastNumber += 1; 
                System.out.println("Program: " + lastNumber);
            }
            else if (lastNumber == 97) { //probably going to lose
                lastNumber += 2; 
                System.out.println("Program: " + lastNumber);
            }
            //could use a switch case for the above. this also doesn't work, we need to maximize the chances of the other player ending with 97
        }
    }
}
