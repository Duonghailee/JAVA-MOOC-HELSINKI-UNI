/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author duonghaily
 */
public class ContainerHistory {
    private ArrayList<Double> history;
    
    public ContainerHistory(){
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.history.add(situation);
    }
    
    public void reset(){
        this.history.clear();
    }
    
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue(){
        return Collections.max(history);
    }
    
    public double minValue(){
       return Collections.min(history);
         
    }
    
    public double average(){
        if(this.history.isEmpty()){
            return 0;
        }
        else{
            double avg = 0;
            double sum = 0;
            for(double i : this.history){
                sum += i;
            }
        
            return sum / this.history.size();
        }
        
    }
    
    public double greatestFluctuation(){
        if(this.history.size()<2){
            return 0;
        }
        
        else{
            double max = 0;
            for(int i = 0; i< history.size()-1;i++){
                double fluct = Math.abs(history.get(i)-history.get(i+1));
                if(fluct > max){
                    max = fluct;
                }
            }
            return max;
        }
    }
    
    public double variance(){
        if(this.history.size()<2){
            return 0;
        }
         else{
             double avg = this.average();
             double result = 0;
             int size = this.history.size();
             for(double i : this.history){
                 double substraction = i - avg;
                 double substractionSquare = substraction * substraction;
                 result += substractionSquare;
             }
             return result/(size-1);
         }
    }
    
    
}
