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
    }
