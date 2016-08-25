/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author duonghaily
 */
public class Farm implements Alive {
    private String name;
    private Barn barn;
    private Set<Cow> cows = new HashSet<Cow>();
   
    
    public Farm(String name, Barn barn){
        this.name = name;
        this.barn = barn;
        
        
    }
    
    public String getOwner(){
        return this.name;
    }

    @Override
    public void liveHour() {
        for(Cow cow : cows){
           cow.liveHour();
        }
                
    }
    
    public void manageCows(){
        this.barn.takeCareOf(cows);
    }
    
    public void addCow(Cow cow){
        this.cows.add(cow);
        
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        
        this.barn.installMilkingRobot(robot);
    }
    
    public String toString(){
        
        String cowList = "";
        
        if(cows.isEmpty()){
            cowList = "No cows.";
        }
        else{
            cowList += "Animals: \n" ;
            for(Cow cowNow : cows){
                cowList +=  ("        " + cowNow.toString() + "\n");
            }
        }
        return "Farm owner: " + this.getOwner() +
                "\nBarn bulk tank: " + this.barn.toString() + "\n" +
                cowList; 
    }
  
}
