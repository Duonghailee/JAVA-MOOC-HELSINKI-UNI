/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class flight {
    private airplane airplane;
    private String from;
    private String to;
    private String ID;
    
    public flight(airplane airplane, String from, String to){
        this.airplane = airplane;
        this.from = from;
        this.to = to;
    }
    
    public String toString(){
        return airplane.toString() + " (" + this.from + "-" + this.to +")";
    }
}
