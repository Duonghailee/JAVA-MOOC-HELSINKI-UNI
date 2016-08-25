
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
public class Obseration {
    private ArrayList<Bird> birdList;
    
    public Obseration(){
        birdList = new ArrayList<Bird>();
    }
    // start method
    public void start(Scanner reader){
        String ans="";
        do{
            System.out.println("?");
            ans = reader.nextLine();
            StringProcess(ans,reader);
        }
        while(!ans.equals("Quit"));
    }
    
    // process with the user input
    public void StringProcess(String str, Scanner reader){
        // add process
        if(str.equals("Add")){
            System.out.println("Name: ");
            String name = reader.nextLine();
            System.out.println("Latin Name:");
            String latinName = reader.nextLine();
            birdList.add(new Bird(name,latinName));
        }
        // observation 
        else if(str.equals("Observation")){
            System.out.println("What was observed:?");
            String nameObserved = reader.nextLine();
            for(Bird bird : birdList){
                if(nameObserved.equals(bird.getName())){
                    bird.timeObservedIncrease();
                }
                else if(!nameObserved.equals(bird.getName())){
                    System.out.println("Is not a bird!");
                }
                
            }
            
        }
        
        // Statistics process
        else if(str.equals("Statistics")){
            this.printBirdList();
        }
        
        // show bird
        else if(str.equals("Show")){
            System.out.println("What?");
            String birdName = reader.nextLine();
             for(Bird bird : birdList){
                if(birdName.equals(bird.getName())){
                    System.out.println(bird);
                }
            }
        }
    }
    
    // printLISToF BIRD method
    public void printBirdList(){
        for(Bird bird : birdList){
            System.out.println(bird);
        }
    }
   
    
    
}
