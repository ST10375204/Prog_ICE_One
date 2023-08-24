/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice_one;

/**
 *
 * @author deves
 */
public class reptiles extends Animals {
    private double bloodTemp;

    public void setBloodTemp(double bloodTemp) {
        this.bloodTemp = bloodTemp;
    }
    
    public void display(){
        super.display();
        System.out.println("Blood Temp: "+bloodTemp+"C");
    }
    
}
