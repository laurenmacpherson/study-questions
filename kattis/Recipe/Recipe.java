import java.util.Scanner; 

public class Recipe {
    public static void main(String a[]){
        Scanner in = new Scanner (System.in); 
        String ingr; double bakerPerc, weight, mainWeight = 1; //initialzing to prevent errors
        int mainIngrIndex = 1; 
        boolean mainFound = false;   

        int numRecipes = Integer.valueOf(in.nextLine()); 

        for (int rec = 1; rec <= numRecipes; rec++){
            //note the portions MUST be in double format in case dividing one by the other results in something fractional 
            int numIngredients = in.nextInt(); double defaultPortion = in.nextDouble(); double desiredPortion = in.nextDouble();
            in.nextLine(); 

            System.out.println("# ingredients: " + numIngredients); 
            System.out.println("defaultPortion: " + defaultPortion); 
            System.out.println("desiredPortion: " + desiredPortion); 
            
            double scalingFactor = desiredPortion/defaultPortion; //double to get fractional # 
            Object[][] ingrList = new Object[numIngredients][2]; 

            System.out.println(desiredPortion/defaultPortion); 
            System.out.println("# ingredients: " + numIngredients); 
            System.out.println("defaultPortion: " + defaultPortion); 
            System.out.println("desiredPortion: " + desiredPortion); 
            System.out.println("Scaling factor: " + scalingFactor); 

            //grab ingredients
            for (int i = 0; i < numIngredients; i++){
                ingr = in.next(); 
                weight = in.nextDouble(); 
                bakerPerc = in.nextDouble();
                //clear line 
                in.nextLine(); 

                if (bakerPerc == 100.0){ //found main ingredient
                    //fill first # with main scaled weight 
                    ingrList[i][1] = weight * scalingFactor; 
                    ingrList[i][0] = ingr;

                    mainIngrIndex = i; 
                    mainFound = true; 
                    mainWeight = (double) ingrList[i][1];
                    System.out.println("MAIN WEIGHT: " + mainWeight); 
                    System.out.println(); 
                }
                else {
                    //assess time complexity here, 
                    //is it faster to set main weight = 1 default and do it every time?
                    if (!mainFound) 
                        ingrList[i][1] = bakerPerc; 
                    else 
                        ingrList[i][1] = (bakerPerc/100) * mainWeight;
                    ingrList[i][0] = ingr;
                }
            } //at the end of the loop, we have baker % for everything but main ingr, which has scaled weight 

            
            if (mainIngrIndex != 0){
                for (int j = 0; j < mainIngrIndex; j++){
                    ingrList[j][1] = (((double) ingrList[j][1])/100) * mainWeight; //cast ingrList to double 
                }
            }
            //now the weights are all correct for the scaling factor, now output
            IngredientList(ingrList, rec); 
            mainFound = false; //reset 
        }
        in.close(); 
    }

    public static void IngredientList(Object[][] array, int recNum){
        System.out.println("Recipe # " + recNum); 

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i][0] + " " + array[i][1]); 
        }

        System.out.println("----------------------------------------"); 
    }
}