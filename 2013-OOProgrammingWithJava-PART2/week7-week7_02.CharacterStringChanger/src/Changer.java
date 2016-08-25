
import java.util.ArrayList;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Changer {
    private ArrayList<Change> changerList;
    
    public Changer(){
        changerList  = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        changerList.add(change);
    }
    
    public String change(String str){
        for(Change change : changerList){
            str = change.change(str);
        }
        return str;
    }
    
}
