/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Counter {
    private int value;
    private boolean check;
    public Counter(int startingValue, boolean check){
        this.value = startingValue;
        if(check){
            this.check = true;
        }
    }

    public Counter(int startingValue){
        this.value = startingValue;
        this.check = false;
    }
    
    public Counter(boolean check){
        this.value = 0;
        if(check){
            this.check = true;
        }
    }
        
    public Counter(){
        this.value = 0;
        this.check = false;
    }
    //METHODS
    public int value(){
        return this.value;
    }
    
    public void increase(){
        this.value++;
    }
    
    public void decrease(){
        if(check){
            if(this.value() > 0){
                this.value--;
            }
        }
        else{
            this.value--;
        }
        
    }
    
    public void increase(int increaseAmount){
        if(increaseAmount>=0){
            this.value += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount){
        if(decreaseAmount>=0){
            if(check){
                if(this.value()>=decreaseAmount){
                    this.value -= decreaseAmount;
                }
                else{
                    this.value = 0;
                }
            }
            else{
                this.value -= decreaseAmount;
            }
        }
    }  
}
// another solution for decrease,
//if(this.check && this.value()<0)
//this.value = 0;