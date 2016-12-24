/*
 * The purpose of this class is to create and maintain the Arraylist, 
 * to populate the array;ist with the contents of a data file,
 * and to call the helper classes to process the data.
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
public class engine 
    {
    public void doTheStuff()
        {
        try 
            {
            File fin = new File("data.txt");
            Scanner scan = new Scanner(fin);
            searchData n = new searchData();
            feeData f = new feeData();
            overpriced o = new overpriced();
            searchSpecialty s = new searchSpecialty();
            ArrayList<String> theData = new ArrayList<String>();
            // read the column headings from the flat text file
            String line = scan.nextLine();
            while(scan.hasNextLine())
                {
                line = scan.nextLine();
                String[] list = line.split(",");
                int key = Integer.parseInt(list[0]);
                String name = list[1];
                int fee = Integer.parseInt(list[2]);
                String specialty = list[3];
                theData.add(String.valueOf(key)); 
                theData.add(name);
                theData.add(String.valueOf(fee)); 
                theData.add(specialty);
                }
            int count = 1;
            for (int i = 0; i < theData.size(); i++) 
                {  
                System.out.print(theData.get(i) + "\t\t");
                if(count % 4 == 0 )
                System.out.println(" ");
                count++;
                }
            scan.close();
            o.overpriced(theData);
            n.searchName(theData);
            s.searchSpecialty(theData);
            f.feeData(theData);
            }
        catch (FileNotFoundException e) 
            {     
            e.printStackTrace();
            }
        }
} //end class
