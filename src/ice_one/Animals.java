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
public class Animals {
    private int IDtag;
    private String species;

    public int getIDtag() {
        return IDtag;
    }

    public void setIDtag(int IDtag) {
        this.IDtag = IDtag;
        
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public void display(){
        System.out.println("==============");
        System.out.println("Animal display");
        System.out.println("ID: "+IDtag);
        System.out.println("Species: "+species);
    }
    
    public void details(){
        double code;
    birds brd=new birds();
    reptiles rept=new reptiles();
    Scanner kb=new Scanner(System.in);
       switch(species){
           case "bird":
                  System.out.println("Select color of bird:\n"
                        + "1 for grey\n2 for white\n3 for black");
                  code=kb.nextInt();
                  brd.setColor(code);
                  display();
                  brd.display();
           break;
           case "reptile":
               System.out.println("Enter blood temperature of reptile");
               code=kb.nextDouble();
               rept.setBloodTemp(code);
               display();
               rept.display();
           break;             
       }    
    }
}
