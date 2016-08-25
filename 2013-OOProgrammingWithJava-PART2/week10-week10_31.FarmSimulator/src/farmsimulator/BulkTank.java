/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author duonghaily
 */
public class BulkTank {
    private double volume = 0;
    private double capacity;
    
    public BulkTank(){
        this(2000);
    }
    
    public BulkTank(double capacity){
       this.capacity = capacity;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        return this.capacity-this.volume;
    }
    
    public void addToTank(double amount){
        double newVol = this.volume + amount;
        if(newVol > this.capacity){
            newVol = this.capacity;
        }
        this.volume = newVol;
        
    }
    
    public double getFromTank(double amount){
        double takenAmount = amount;
        if(takenAmount > this.volume){
            takenAmount = this.volume;
        }
        volume -= takenAmount;
        return takenAmount;
    }
    
    public String toString(){
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
}
