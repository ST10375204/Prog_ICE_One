/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice_one;

import java.util.Scanner;

/**
 *
 * @author deves
 */
public class ICE_ONE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        Animals an= new Animals();
        
        System.out.println("Enter the species of the animal");
        an.setSpecies(kb.next());
        System.out.println("Enter the ID of the animal");
        an.setIDtag(kb.nextInt());
                
        switch(an.getSpecies()){
            case "bird":
                  an.details();
                break;
            case "reptile":
                an.details();
                break;
            default: System.out.println("invalid"); break;
        }
    }
    
}
