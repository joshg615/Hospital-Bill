
package ass3_p2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ass3_p2 
{

    public static void main(String[] args) 
    {
        //Joshua Guzman
        
        //Declaring Variables
        double income, sales, commission;     

        //Creating new instances
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter  = new DecimalFormat ("#0.00");

        //Program Starts
        System.out.println("What is the monthly sales amount? ");
        
        sales = keyboard.nextDouble();
        
        if (sales >= 50000)
            income = (sales * .10) + 400;
        else if (sales >= 40000)
            income = (sales * .08) + 350;
        else if (sales >= 30000)
            income =(sales * .06) + 300;
        else if (sales >= 20000)
            income =(sales * .05) + 275;
        else if (sales >= 10000)
            income =(sales * .04)+ 250;
        else
            income =(sales * .03) + 225;
        
        System.out.println("Your monthly income is: $"
                            + formatter.format(income));
    }
    
}
