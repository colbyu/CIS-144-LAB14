/*
 * Ihis class creates an arraylist that consists of just
 * the fees and then checks for those that are > 2000.
*/
package lab14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author colby
 */
public class overpriced 
    {
    public void overpriced(ArrayList<String> vals)
        {
        ArrayList<String> feeList = null;
        try 
            {
            File fin = new File("data.txt");
            Scanner scan = new Scanner(fin);
            String line = scan.nextLine();
            feeList = new ArrayList<>();
            while (scan.hasNextLine()) 
                {
                line = scan.nextLine();
                String[] list = line.split(",");
                int fee = Integer.parseInt(list[2]);                 
                feeList.add(String.valueOf(fee));
                }
            } 
        catch (FileNotFoundException ex) 
            {
            System.out.println("file not found");
            }
        System.out.println("looking for overpriced services... ");
        int limit = 2000;
        int expensive = 0;
        for (int i = 0; i < feeList.size(); i++) 
            {
            double val = Double.parseDouble(feeList.get(i));
            if(val > limit) 
                {        
                expensive += 1;
                }
            }
    if(expensive > 0)
        System.out.println(" WARNING: "+expensive+ " overpriced serveces found ");
    else
        System.out.println(" no overpriced serveces found ");
    }
}
