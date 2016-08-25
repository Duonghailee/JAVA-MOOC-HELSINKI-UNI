/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author duonghaily
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> list;
    private int numOfDuplicate;
    
    public PersonalDuplicateRemover(){
        list = new HashSet<String>();
        this.numOfDuplicate = 0;
    }
    
    @Override
    public void add(String characterString) {
       if(!list.contains(characterString)){
           list.add(characterString);
       }
       else{
           this.numOfDuplicate++;
       }
       
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
       return this.numOfDuplicate;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        if(this.list.isEmpty()){
            return new HashSet<String>();
        }
        return this.list;
    }

    @Override
    public void empty() {
        this.list.removeAll(list);
        this.numOfDuplicate = 0;
    }
    
}
