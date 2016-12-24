/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

import java.util.ArrayList;

/**
 *
 * @author colby
 */
public class overpriced 
    {
    public void overpriced(ArrayList<String> vals)
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
    }
