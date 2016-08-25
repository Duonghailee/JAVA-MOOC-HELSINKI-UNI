/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author duonghaily
 */
public class UserInterface {
    private player p;
    private Collection<vampires> v; // v is vampire
    private Dungeon boardgame;
    private Scanner reader;
    
    public UserInterface(Scanner reader){
        this.reader = reader;
    }
    
    public void setting(){
        System.out.println("Welcome to the dungeon game"
                + "enter the board game size, first length, and then height, please");
        int length = reader.nextInt();
        int height = reader.nextInt();
        System.out.println("How many moves do you prefer ?");
        int moves = reader.nextInt();
        System.out.println("How many vampires then ?");
        int vampires = reader.nextInt();
        
        boardgame = new Dungeon(length,height,vampires,moves,true);
    }
            
    
}
