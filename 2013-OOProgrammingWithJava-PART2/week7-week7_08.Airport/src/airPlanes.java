
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
public class airPlanes {
    private ArrayList<airplane> airPlanes ;
    
    public airPlanes(){
        airPlanes = new ArrayList<airplane>();
    }
    
    public void addPlane(airplane plane){
        airPlanes.add(plane);
    }
    
    // printPlanes
    public void printPlanes(){
        for(airplane p : airPlanes){
            System.out.println(p);
        }
    }
    
    public void printPlane(String ID){
        for(airplane p : airPlanes){
            if(p.getID().equals(ID)){   
                System.out.println(p);
            }
        }
    }
    
    public airplane getAirPlane(String ID){
         for(airplane p : airPlanes){
            if(p.getID().equals(ID)){   
                return p;
            }
        }
         return null;
    }
}
