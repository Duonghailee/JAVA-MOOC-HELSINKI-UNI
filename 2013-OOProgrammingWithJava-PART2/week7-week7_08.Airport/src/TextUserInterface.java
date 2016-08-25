


import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class TextUserInterface {
    private Scanner reader;
    private flightList flightList;
    private airPlanes airPlanes;
 
    public TextUserInterface(Scanner reader, flightList flightList, airPlanes airPlanes){
        this.reader = reader;
        this.airPlanes = airPlanes;
        this.flightList = flightList;
    }
    
    public void start(){
        airPortPanel();
        flightService();

    }
    
    //airport panel
    public void airPortPanel(){
        System.out.println("Airport panel");
        System.out.println("--------------------\n");
        while(true){
            System.out.println("Choose operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String input = reader.nextLine();
            if(input.equals("x")){
                break;  
             }   
            else if(input.equals("1")){
                this.addPlane();
            }
            else if(input.equals("2")){
                this.addFlight();
            }
            else{
            
                continue;
            }
        }
    }
    
    public void addPlane(){
        System.out.print("Give plane ID: ");
        String ID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        airplane plane = new airplane(ID,capacity);
        this.airPlanes.addPlane(plane);
    }
    
    public void addFlight(){
        System.out.print("Give plane ID: ");
        String ID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String from = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String to = reader.nextLine();
        flight flight = new flight(this.airPlanes.getAirPlane(ID),from,to);
        this.flightList.addFlight(flight);
    }
    
    
    
    
    public void flightService(){
        System.out.println("\nFlight service");
        System.out.println("------------\n");
         while(true){
            System.out.println("Choose operation: ");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String input = reader.nextLine();
            if(input.equals("x")){
                break;  
             }
            else if(input.equals("1")){
                this.airPlanes.printPlanes();
            }
            else if(input.equals("2")){
                this.flightList.printFlights();
            }
            else if(input.equals("3")){
                System.out.println("Give plane ID: ");
                String id = reader.nextLine();
                this.airPlanes.printPlane(id);
            }
            else{
                continue;
            }
        
        }

    }
}



