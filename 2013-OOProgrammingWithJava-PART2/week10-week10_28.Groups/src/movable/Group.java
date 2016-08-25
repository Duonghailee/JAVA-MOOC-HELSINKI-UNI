/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duonghaily
 */
public class Group implements Movable {
    private List<Organism> group = new ArrayList<Organism>();
    
    public String toString(){
        String result = "";
        for(Organism org : this.group){
            result += (org.toString() + "\n");
        }
        return result;
    }
    
    public void addToGroup(Movable movable){
        Organism org = (Organism) movable;
        this.group.add(org);
    }
    
    public void move(int dx, int dy){
        for(Organism org : this.group){
            org.move(dx, dy);
        }
    }
    
}
