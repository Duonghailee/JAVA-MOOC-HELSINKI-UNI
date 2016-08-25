/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author duonghaily
 */
public class Dungeon {
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private player p;
    private List<vampires> v; // v is vampire
    private Scanner reader;
    
    public Dungeon(int l, int h, int vampires, int moves, boolean vampiresMove) throws ArrayIndexOutOfBoundsException {
        this.reader = new Scanner(System.in);
        this.length = l;
        this.height = h;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.p = new player("@", this.moves, l , h);
        v = new ArrayList<vampires>();
        boolean unique = false;
        // unique vampires generating and at first no 0,0 generating
        int i=0;
        while(i < vampires){
            unique = true;
            vampires newVampire = new vampires(l,h);
            for (dungeon.vampires v1 : v) {
                if (newVampire.equals(v1) || (newVampire.getX() == 0 && newVampire.getY()== 0)) {
                    unique = false;
                }
            }
            if(unique){
               i++;
               v.add(newVampire);
            }        
        }
    }
    
    public void run() throws ArrayIndexOutOfBoundsException{
        while(this.moves > 0){
            printBoard();
            printMap();
            System.out.println("");
            gameAction();
            
            //checkResult
            if(checkWinner()){
                System.out.println("YOU WIN");
                break;
            }
            else{
                this.moves--;
                if(this.moves == 0){
                    System.out.println("YOU LOSE");
                }
                
            }
            
            
        }
        // loop ends, moves lelf 0 0, player lose
        
        
    }
    
    // where player vs vampires
    private void gameAction() throws ArrayIndexOutOfBoundsException{
        List<vampires> deadVampires = new ArrayList<vampires>();
        this.p.execute(reader);
        if(!this.vampiresMove){
            for(vampires vampire : this.v){
                if(vampire.getX() == p.getX() && vampire.getY() == p.getY()){
                    deadVampires.add(vampire);
                }
            }
            this.v.removeAll(deadVampires);
        }
        else{
            executeVampires();
            for(vampires vampire : this.v){
                if(vampire.getX() == p.getX() && vampire.getY() == p.getY()){
                    deadVampires.add(vampire);
                }
            }
            this.v.removeAll(deadVampires);
        }
        
    }
    
    public boolean checkWinner(){
        return v.isEmpty();
        
    }
    
    private void executeVampires(){
         for(vampires vampire : this.v){
             vampire.execute(reader);
             
         }
    }
    
    public void printBoard() throws ArrayIndexOutOfBoundsException{
            System.out.println(this.moves);
            System.out.println("");
            System.out.println(p);
            for(vampires vampire : this.v){
                System.out.println(vampire);
            }
            System.out.println("");
    }
    
    private boolean foundVampire(int x, int y) throws ArrayIndexOutOfBoundsException{
        for(vampires v : this.v){
            if(x == v.getX() && y == v.getY()){
                return true;
             }
        }
        return false; 
    }
    
    public void printMap() throws ArrayIndexOutOfBoundsException{
        for(int y=0 ; y<height; y++){
            for(int x=0; x<length;x++){
                // case for vampire
                if(foundVampire(x,y)){
                    System.out.print("v");
                }
                // case for player
                else if(x == this.p.getX() && y == this.p.getY()){
                    System.out.print("@");   
                } 
                else{
                    System.out.print(".");
                }
            }
            System.out.print("\n");
                
            }
        }
    }

/* y tuong
de game chay thi can while(true) print board, roi map, roi nhan reader, sau do, random , print board, print map lai,i--, cho den khi so move duoi 0 hti break, test dieu kien, neu k con vampire, vi du 
toa do vampire giong nhau giua cac vampire tong list, remove , ss giua toa do vampire va p, neu trung nhau,del
cai nay nen dua ra tung method rieng vd , compare(vampire vp), compare(player), void del(vampire),


*/