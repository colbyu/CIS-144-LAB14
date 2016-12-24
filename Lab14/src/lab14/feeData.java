/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    }
