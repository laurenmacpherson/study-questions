import java.util.Scanner; 

public class Recipe {
    public static void main(String a[]){
        Scanner in = new Scanner (System.in); 
        String ingr, bakerPerc, weight; 

        int numRecipes = in.nextLine(); 
        int numIngredients = in.nextInt(); 
        int defaultPortion = in.nextInt(); int desiredPortion = in.nextLine(); 
        
        double scalingFactor = desiredPortion/defaultPortion; //double to get fractional # 
        Object[][] ingrList = new Object[numIngredients][2]; 

        //grab ingredients
        for (int i = 0; i < numIngredients; i++){
            ingr = in.next(); 
            weight = in.next(); 
            bakerPerc = in.nextLine(); 

            if (bakerPerc == 100.0){ //found main ingredient

            }
            
            //System.out.println(in.next());
        }

        in.close(); 
    }

    //public static int[][] ingredientList(int )
}