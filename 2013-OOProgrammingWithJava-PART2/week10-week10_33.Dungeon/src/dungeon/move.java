/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Scanner;

/**
 *
 * @author duonghaily
 */
public abstract class move {
    private String name;
    private Scanner reader;
    private int x;
    private int y;
    
    public move(String name){
        this.name = name;
        
       
    }
    
    public String getName(){
        return this.name;
    }
    
    public abstract void execute(Scanner reader);
         
}
