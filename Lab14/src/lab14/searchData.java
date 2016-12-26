package lab14;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * This class takes a string input and searches the arraylist for that string
 * 
 * 
 */

/**
 *
 * @author colby
 */
public class searchData 
    {
    public void searchName(ArrayList<String> vals)
        {
        System.out.print("enter a name: ");
        Scanner sc = new Scanner(System.in);
        String strName = sc.nextLine().trim(); 
        boolean found = false;
        for (int i = 0; i < vals.size(); i++) 
            {
            // error handling 
            // - the following statement ignores capitalization
            // - in case user doesn't bother to capitalize the name:
            if(vals.get(i).equalsIgnoreCase(strName.trim()))
                {
                found = true;
                break;
                }
            }
        if(found == true)
            System.out.println(" data found ");
        else
            System.out.println(" data not found ");
        //sc.close();
        }
    }
