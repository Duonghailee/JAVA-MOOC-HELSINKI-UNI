/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author duonghaily
 */
public class AtLeastOne implements Criterion{
    private List<Criterion> listOfCriteions;
    
    public AtLeastOne(Criterion... criteria) {
        this.listOfCriteions = new ArrayList<Criterion>();
        this.listOfCriteions.addAll(Arrays.asList(criteria));
    }

    @Override
    public boolean complies(String line) {
        if(this.listOfCriteions.size()==0){
            return false;
        }
        else if(this.listOfCriteions.size()==1){
            return this.listOfCriteions.get(0).complies(line);
        }
        else{
            for(Criterion c : this.listOfCriteions){
                if(c.complies(line)){
                    return true;
                }
        }
            return false;
        }
        
    }
        
    
}
