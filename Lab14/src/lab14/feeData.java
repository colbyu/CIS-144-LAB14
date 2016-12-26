/*
 * This class searches the arrayiist for a specified fee range.
 */
package lab14;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author colby
 */
public class feeData 
    {
        public void feeData(ArrayList<String> vals)
        {
        System.out.print("enter a dollar fee amount: ");
        Scanner sc = new Scanner(System.in);
        String strFee = sc.nextLine();
        boolean found = false;
        try
            {
            Double newFee = Double.parseDouble(strFee);
            for (int i = 0; i < vals.size(); i++) 
                {
                double val = Double.parseDouble(vals.get(2));
                if(val >= newFee) 
                    {        
                    found = true;
                    break;
                    }
                }
            if(found == true)
                System.out.println(" data found ");
            else
                System.out.println(" data not found ");
            }
        catch (NumberFormatException ex)
            {
            System.out.println("Numbers only, please. Try again...");
            try
               {
               System.out.print("enter a dollar fee amount: ");
                       //Scanner sc2 = new Scanner(System.in);
                       String strFee2 = sc.nextLine();
                       Double newFee = Double.parseDouble(strFee2);
                       for (int i = 0; i < vals.size(); i++) 
                           {
                           double val2 = Double.parseDouble(vals.get(2));
                           if (val2 >= newFee) 
                               {                               
                               found = true;
                               break;
                               }
                           }
                }
            catch(NumberFormatException exc)
                {
                System.out.println("I give up :-(");
                }
            if(found == true)
                System.out.println(" data found ");
            else
                System.out.println(" data not found ");
            }
        }
    }
