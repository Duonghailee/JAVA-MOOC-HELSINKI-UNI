/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Scanner;

/**
 *
 * @author duonghaily
 */
public class player extends move {
    private int name;
    private int moveLeft;
    private int x;
    private int y;
    private int boundX;
    private int boundY;
    
    public player(String name, int moves, int boundX, int boundY){
        super(name);
        this.moveLeft = moves;
        this.x = 0;
        this.y = 0;
        this.boundX = boundX;
        this.boundY = boundY;
    }
    
    public void move(int dx, int dy){
        if(x+dx<0 || y+dy<0){
            return ;
        }
        else if(x+dx>=boundX){
            this.x = boundX-1;
        }
        else if(y+dy >= boundY){
            this.y = boundY-1;
        }
        else if (x+dx>=boundX && y+dy >= boundY ){
            this.x = boundX-1;
            this.y = boundY-1;
        }
        else{
            this.x += dx;
            this.y += dy;
        }
        
    }
    
    public int getMoveLeft(){
        return this.moveLeft;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    @Override
    public void execute(Scanner reader) {
        System.out.println("");
        String move = reader.nextLine();
        for(int i=0; i< move.length();i++){
            if(move.charAt(i)== 'w'){
                move(0,-1);
            }
            else if(move.charAt(i)== 's'){
                move(0,1);
            }
            else if(move.charAt(i)== 'd'){
                move(1,0);
            }
            else if(move.charAt(i)== 'a'){
                move(-1,0);
            }
            else{
                return;
            }
        }
    }
    
    public String toString(){
        return this.getName() + " " + this.getX() + " " + this.getY();
    }
    
}
