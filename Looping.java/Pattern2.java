public class Pattern2{
    public static void main (String[]args){
        //declaring variable
        int n = 5; //the condition 

        //for loop
        for(int row = 1; row < n; row++){//
            for(int col = n; col >= row; col-- ){//

                //printing the result 
                 System.out.print(col+" ");//
            }
            //printing in the next line 
             System.out.println();//
        }
    }
}