/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duonghaily
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors ;
    private List<Integer> results ;
    
    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();    
         this.results= new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        
            sensors.add(additional);
        }
    
            
    @Override
    public boolean isOn() {
        if(sensors.isEmpty()){
            return false;
        }
        for(Sensor s : sensors){
            if(!s.isOn()){
                return false;
            }
            
        }
        return true;
    }

    @Override
    public void on() {
         for(Sensor s : sensors){
            if(!s.isOn()){ // dont need if, just on all
                s.on();
            }
        }
    }

    @Override
    public void off() {
       sensors.get(0).off();
    }

    @Override
    public int measure() {
        if(!this.isOn()){
            throw new IllegalStateException("sensor is off or not have any sensor");
        }
        int sum = 0;
        int avg = 0;
        for(Sensor s : sensors){
            sum += s.measure();
        }
        avg = sum / sensors.size();
        this.results.add(avg);
        return avg;
    }
    
    //list method
    public List<Integer> readings(){
       
        return results;
    }
    
    
}
