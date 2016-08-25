
import java.util.ArrayList;
import java.util.Collections;
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
public class ui {
    private Scanner reader;
    private ArrayList<Skier> skierList; // UI should not contains any more list, or method for cetain class
    private int totalPoint;
    
    public ui(Scanner reader){
        this.reader = reader;
        skierList = new ArrayList<Skier>();
        this.totalPoint = 0;
    }
    
    public void start(){
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        while(true){
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            skierList.add(new Skier(name));
            
        }
        System.out.println("");
        
        // now begin jump
        System.out.println("The tournament begins!");
        System.out.println("");
        int i=1;
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: \n");
            
            String ans = reader.nextLine();
            if(!ans.equals("jump")){
                System.out.println("\nThanks!\n");
                break;
                
            }
            else{
                jumping(i);
                i++;
            }
        
        }
        
        // print tournament results:
        printTournamentResult();
        
        
    }
    public void jumping(int round){
        
        System.out.println("Round " + round);
        System.out.println("");
        
        //print order 
        //printJumpingOrder();
        System.out.println("Jumping order: ");
        for(int i=0;i<skierList.size();i++){
            //Collections.reverse(skierList);
            System.out.println("  " +(i+1)+". " + skierList.get(i));
            //skierList.get(i).sumOfPoints += this.totalPoint;
        }
               
        
        // get Jumping random
        for(Skier skier : skierList){
            skier.length(); // length random
            skier.vote(); // get 5 votes
            
            //skier.totalPoint();
        }
        
        // print result
        System.out.println("");
        System.out.println("Results of round " + round);
        Collections.sort(skierList);
        for(Skier skier : skierList){
            System.out.println(skier.result());
            skier.sumOfPoints += skier.totalPoint();
            
        }
    }
    
    // printTournament result
    public void printTournamentResult(){
        System.out.println("Tournament results: ");
        System.out.println("Position    " + "Name");
        Collections.reverse(skierList);
        for(int i=0; i<this.skierList.size();i++){
            System.out.println((i+1) + "           " + skierList.get(i).printFinal());
        }
    }
  
    
   
}

