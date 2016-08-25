/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author duonghaily
 */
public class Person {
    private String name;
    private String add;
    
    public Person(String name, String add){
        this.name = name;
        this.add = add;
    }
    
    
    public String toString(){
        return this.name + "\n  " + this.add;
    }
}
