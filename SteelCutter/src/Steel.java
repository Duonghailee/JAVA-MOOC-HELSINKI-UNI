/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Steel {
    private double length;
    
    private String type;
    
    public Steel(double length, String type){
        this.length = length;
       
        this.type = type;
    }
    
    public double getLen(){
        return this.length;
    }
    
    public String getType(){
        return this.type;
    }
    
    public String toString(){
        return "steel type: " +this.type + ", length:  " + this.length;
    }
    
}
