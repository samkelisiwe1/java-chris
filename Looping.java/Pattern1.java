public class Pattern1{
    public static void main (String[]args){
        //declaring variable
        int rows = 5;

        //for loop
        for(int s = 1; s <= rows; s++){
            for(int m = 1; m <= s; m++ ){

                //printing the result 
                 System.out.print(m+" ");
            }
            //printing in the next line 
             System.out.println();
        }
    }
}