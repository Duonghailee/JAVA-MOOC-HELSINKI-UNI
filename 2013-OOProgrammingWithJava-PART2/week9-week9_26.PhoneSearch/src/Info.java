
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Info {
    private Map<String, Set<String>> nameAndPhone;
    private Map<String, Set<String>> nameAndAdd;
    
    
    public Info(){
       this.nameAndPhone = new HashMap<String, Set<String>>();
       this.nameAndAdd = new HashMap<String, Set<String>>();
    }
    
    public void addNum(String name, String number){
        if(!this.nameAndPhone.containsKey(name)){
            this.nameAndPhone.put(name, new HashSet<String>() );
            this.nameAndAdd.put(name, new HashSet<String>() );
            
        }
        this.nameAndPhone.get(name).add(number);
        
    }
    
    public void addAdd(String name, String address){
        if(!this.nameAndAdd.containsKey(name)){
            this.nameAndAdd.put(name, new HashSet<String>());
             this.nameAndPhone.put(name, new HashSet<String>() );
        }
        this.nameAndAdd.get(name).add(address);
    }
    
    //get Name
    public Set<String> getName(){
        
        
        return this.nameAndPhone.keySet();
        
    }
    
    //get add
    public TreeSet<String> getAllAdd(){
        TreeSet add = new TreeSet();
        add.addAll(this.nameAndAdd.values());
        return add;
    }
    
    public Set<String> getPhone(String name){
        if(this.nameAndPhone.containsKey(name)){
            return this.nameAndPhone.get(name);
        }
        return new HashSet<String>();
    }
    
    public List<String> getNameByAdd(String add){
        List<String> nameList = new ArrayList<String>();
        for(String name : this.nameAndAdd.keySet()){
            if(this.nameAndAdd.get(name).toString().contains(add)){
                nameList.add(name);
                
            }
        }
        Collections.sort(nameList);
        return nameList;
        
    }
    
    public String searchPerson(String number){
       for(String name: this.nameAndPhone.keySet()){
           if(this.nameAndPhone.get(name).contains(number)){
               return name;
           }
       }
        return "not found";
    
    }
    
    public Set<String> getAdd(String name){
        if(this.nameAndAdd.containsKey(name)){
            return this.nameAndAdd.get(name);
        }
        return new HashSet<String>();
    }
    
    public void delete(String name){
        if(this.nameAndPhone.containsKey(name)){
            this.nameAndPhone.remove(name);
            }
        if(this.nameAndAdd.containsKey(name)){
                this.nameAndAdd.remove(name);
        }
    }
    
    public boolean isEmpty(String name){
        if(!this.nameAndAdd.containsKey(name)&&!this.nameAndPhone.containsKey(name)){
            return true;
        }
        else{
            return false;
        }
    }
    
    //print all info

   
    
            
}
    
    
    
   

