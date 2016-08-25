
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Person {
    private String name;
    private String number;
    
    // constructor
    public Person(String name, String number){
        this.name = name;
        this.number = number;
    }
    
    // methods
    public String getName(){
        return this.name;
    }
    
    public String getNumber(){
            return this.number;
    }
    
    public void changeNumber(String newNumber){
        this.number = newNumber;
    }
    
    // toString method
    public String toString(){
        return this.name +" number: " + this.number;
    }
    
    
}
