
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
public class Phonebook {
    private ArrayList<Person> list;
    
    public Phonebook(){
        list = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        list.add(new Person(name,number));
    }
    
    public void printAll(){
        for(Person per : list){
            System.out.println(per);
        }
    }
    
    // seraching 
    public String searchNumber(String name){
        for(Person per: list){
            if(per.getName().equals(name)){
                return per.getNumber();
            }
        }
        return "number not known";
    }
}
