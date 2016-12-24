package lab14;
/**
 *
 * @author colby
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataApplication 
    {
    public static void main(String[] args) 
    {  
    try 
        {
	File fin = new File("data.txt");
	Scanner scan = new Scanner(fin);
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
        overpriced(theData);
        searchData(theData);
        searchSpecialty(theData);
        feeData(theData);
        }
    catch (FileNotFoundException e) 
        {     
        e.printStackTrace();
        }
    }//end main
    public static void searchData(ArrayList<String> vals)
        {
        System.out.print("enter a name: ");
        Scanner sc = new Scanner(System.in);
        String strName = sc.nextLine().trim(); 
        boolean found = false;
        for (int i = 0; i < vals.size(); i++) 
            {
            if(vals.get(i).equals(strName.trim()))
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
    public static void feeData(ArrayList<String> vals)
        {
        System.out.print("enter a dollar fee amount: ");
        Scanner sc = new Scanner(System.in);
        String strFee = sc.nextLine();
        boolean found = false;
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
    sc.close();
    }
    public static void overpriced(ArrayList<String> vals)
            /*
            This section should determine if a value greater than 2000 exists in the
            input file. The problem is that, as it stands, it appears to be
            taking the numeric values of the strings as well, which also are greater
            than 2000. Not sure how to get this class to only examine the numeric 
            values when we created a String arraylist...
            
            I'm  not sure if that's the case, but testing with an incrementing variable 
            results in returning 20 cases of exceeding 2000. 
            There are 20 items in the arraylisgt, so is it finding tat they all exceed 2000... ?
            */
        {
        System.out.println("looking for overpriced services... ");
        int limit = 2000;
        boolean expensive = false;
        for (int i = 0; i < vals.size(); i++) 
            {
            double val = Double.parseDouble(vals.get(2));
            if(val > limit) 
                {        
                expensive = true;
                break;
                }
            }
    if(expensive == true)
        System.out.println(" WARNING: overpriced serveces found ");
    else
        System.out.println(" no overpriced serveces found ");
		   
    
    }
    public static void searchSpecialty(ArrayList<String> vals)
        {
        System.out.print("enter a specialization: ");
        Scanner sc = new Scanner(System.in);
        String strSpecial = sc.nextLine().trim(); 
        int found = 0;
        for (int i = 0; i < vals.size(); i++) 
            {
            if(vals.get(i).equals(strSpecial.trim()))
                {
                found = found + 1;
                }
            }
        if(found > 1)
            System.out.println(found + " specialists found ");
        else
            System.out.println(" sprciaist not found ");
        }
} //end class

