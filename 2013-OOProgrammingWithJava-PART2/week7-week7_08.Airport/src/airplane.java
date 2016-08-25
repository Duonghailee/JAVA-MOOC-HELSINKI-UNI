/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class airplane {
    private String ID;
    private int capacity;
   
    
    public airplane(String ID, int capacity){
        this.ID = ID;
        this.capacity = capacity;
    }
    public airplane(String ID){
        this.ID = ID;

    }
    
    public String getID(){
        return this.ID;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public airplane getPlaneByID(String ID){
        if(this.ID.equals(ID)){
            return new airplane(ID,this.getCapacity());
        }
        return null;
    }
    
    public String toString(){
        return this.ID + " (" + this.capacity + " ppl)";
    }
}
