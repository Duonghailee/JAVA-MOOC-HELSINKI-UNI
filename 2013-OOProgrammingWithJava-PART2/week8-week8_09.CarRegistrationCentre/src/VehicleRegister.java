
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister(){
        owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if(owners.containsKey(plate)){
            return false;
        }
        
        owners.put(plate, owner);
        return true;
    }
    
    public String get(RegistrationPlate plate){
        String ans = null;
        if(owners.containsKey(plate)){
            ans = owners.get(plate);
        }
        return ans;
    }
    
    public boolean delete(RegistrationPlate plate){
        if(owners.containsKey(plate)){
            owners.remove(plate);
            return true;
        }
        return false;
        
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate register: owners.keySet()){
            System.out.println(register);
        }
    }
    
    public void printOwners(){
        // avoid when one user own many cars
        ArrayList<String> ownersPrinted = new ArrayList<String>();
        for(String owner: owners.values()){
            if(!ownersPrinted.contains(owner)){
                System.out.println(owner);
                ownersPrinted.add(owner);
            }
             
        }
    }
}
