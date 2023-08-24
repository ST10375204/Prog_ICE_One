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
public class birds extends Animals{
    private int color;

    public void setColor(double color) {
        this.color = (int) color;
    }    
    
    @Override
    public void display(){
        switch(color){
            case 1:System.out.println("Color: Grey"); break;
            case 2:System.out.println("Color: White");break;
            case 3:System.out.println("Color: black");break;
            default:System.out.println("invalid");break;
            
        }
    }
}
