/*
This class takes a capitalization-agnostic string input 
of a specialty and attempts to locate it 
within the main arraylist
 */
package lab14;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author colby
 */
public class searchSpecialty 
    {
    public void searchSpecialty(ArrayList<String> vals)
        {
        System.out.print("enter a specialization: ");
        Scanner sc = new Scanner(System.in);
        String strSpecial = sc.nextLine().trim(); 
        int found = 0;
        for (int i = 0; i < vals.size(); i++) 
            {
            /*
            error handling 
            - the following statement ignores capitalization
            - in case user doesn't bother to capitalize 
            the name of the specialty:
            */
            if(vals.get(i).equalsIgnoreCase(strSpecial.trim()))
                {
                found = found + 1;
                }
            }
        if(found > 1)
            System.out.println(found + " specialists found ");
        else
            System.out.println(" sprciaist not found ");
        ///sc.close();
        }
    }
