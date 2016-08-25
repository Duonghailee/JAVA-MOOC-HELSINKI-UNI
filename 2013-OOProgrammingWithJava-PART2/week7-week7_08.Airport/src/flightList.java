
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
public class flightList {
    private ArrayList<flight> flightList;
    
    public flightList(){
        flightList = new ArrayList<flight>();
    }
    
    public void addFlight(flight flight){
        flightList.add(flight);
    }
    
    public void printFlights(){
        for(flight f : flightList){
            System.out.println(f);
        }
    }
}
