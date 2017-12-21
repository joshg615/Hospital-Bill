
package ass5_p2;
import java.util.Scanner;

public class Ass5_p2 
{

   
    public static void main(String[] args) 
    {   String input;
        double days,dailyRate,medicationCharges,serviceCharges,total;
        Scanner key = new Scanner(System.in);
        
        System.out.println("Are you an out patient? yes/no ");
        input = key.nextLine();
        
        switch (input)
        {
            case "Yes":
            case "yes":    
            System.out.println("What is hospital medication charges?");
            medicationCharges = key.nextDouble();
            System.out.println("What is hospital service charges?");
            serviceCharges = key.nextDouble();
            total = out_patient(medicationCharges,serviceCharges);
            System.out.println("The total charges is $"+ total);
            break;
           
            case "No":
            case "no":    
            System.out.println("What is the number of days spent in hospital?");
            days = key.nextDouble();
            System.out.println("What is the daily rate?");
            dailyRate = key.nextDouble();
            System.out.println("What is hospital medication charges?");
            medicationCharges = key.nextDouble();
            System.out.println("What is hospital service charges?");
            serviceCharges = key.nextDouble();
            total = in_patient(days,dailyRate,medicationCharges,serviceCharges);
            System.out.println("The total charges is $"+ total);
            break;
            default:
                System.out.println("You entered a invaild choice");
        }
    }
    
        public static double in_patient(double num1, double num2, double num3, double num4)
        {
            double sum;
            sum = (num1*num2)+(num3+num4);
            return sum;
            
        }
        public static double out_patient(double num1, double num2)
        {
            double sum;
            sum = num1+num2;
            return sum;
        }  
    
}
