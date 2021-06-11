import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Babelfish {
    public static void main (String a[]){
        Scanner in = new Scanner(System.in); 
        String line; 
        String[] def = new String[2]; 
        HashMap<String, String> dict = new HashMap<String, String>(); 

        while (!(line = in.nextLine()).isEmpty()){
            def = line.split("\\s+"); 
            //System.out.println("def: " + def[0] + "&" + def[1]); 
            //for testing
            dict.put(def[1], def[0]); //put translated word first for easy search 
        }

        for( Map.Entry<String, String> entry : dict.entrySet() ){
            System.out.println( entry.getKey() + " => " + entry.getValue() );
        } //printing out map for testing 

        //in.nextLine(); 
        while (in.hasNextLine()){
            line = in.next(); 
            if (dict.containsKey(line)){
                System.out.println(dict.get(line)); 
            }
            else {
                System.out.println("eh"); 
            }
        }

        in.close(); 
    }
}
