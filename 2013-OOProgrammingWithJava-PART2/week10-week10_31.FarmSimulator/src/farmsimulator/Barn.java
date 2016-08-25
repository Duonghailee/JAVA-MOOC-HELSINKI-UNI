/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author duonghaily
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot milkRobot ;
    
    public Barn(BulkTank tank){
        this.tank = tank;
        this.milkRobot = null;
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkRobot = milkingRobot;
        this.milkRobot.setBulkTank(tank);
    }
    
    public void takeCareOf(Cow cow){
        if(this.milkRobot == null){
            throw new IllegalStateException("milking robot has not been installed");
        }
        else{
            
            this.milkRobot.milk(cow);
        }
        
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(this.milkRobot == null){
            throw new IllegalStateException("milking robot has not been installed");
        }
        else{
            for(Cow cow : cows){
                
                this.milkRobot.milk(cow);
             }
        }
    }
    
    public String toString(){
        return this.tank.toString();
    }
}
