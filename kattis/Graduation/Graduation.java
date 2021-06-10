import java.util.Scanner; 
import java.util.ArrayList; 

public class Graduation {
    public static void main(String a[]){
        Scanner in = new Scanner(System.in); 
        //can easily store in a 1d array for ease of access 
        String line; 
        int rows = in.nextInt(); int cols = in.nextInt(); int classes = in.nextInt();
        //minimum colors 1, maximum colors is the #+# of classes  

        //ArrayList<Character> total = new ArrayList<Character>(); 
        char[][] total = new char[rows][cols]; 

        for (int i = 0 ; i < rows; i++){ 
            in.nextLine();
            line = in.next(); 
            for (int j = 0; j < cols; j++){
                //total.add(line.charAt(j));
                total[i][j] = line.charAt(j); 
            } 
        }

        /*
        for (char current:total){
            System.out.println(current); 
        }

        for (int i = 0 ; i < rows; i++){ 
            //in.nextLine();
            //line = in.next(); 
            for (int j = 0; j < cols; j++){
                System.out.print(total[i][j]); 
            } 
            System.out.println(); 
        } 
        */ //testing purposes
    }

    public static boolean r
}
