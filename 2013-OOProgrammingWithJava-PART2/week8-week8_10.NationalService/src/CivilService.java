/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class CivilService implements NationalService{
    private int dayLeft;
    public CivilService(){
        this.dayLeft = 362;
    }
    
    public int getDaysLeft(){
        return this.dayLeft;
    }
    
    public void work(){
        this.dayLeft--;
        if(this.dayLeft<=0){
            this.dayLeft = 0;
        }
    }
    
}
