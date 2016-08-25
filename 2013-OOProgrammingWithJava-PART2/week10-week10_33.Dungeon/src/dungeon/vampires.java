/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author duonghaily
 */
public class vampires extends move {
    private int moveLeft;
    private Random random;
    private int x;
    private int y;
    private int boundX;
    private int boundY;
    
    public vampires(int boundX, int boundY){
        super("v");
        this.moveLeft = 0;
        this.boundX = boundX;
        this.boundY = boundY;
        random = new Random();
        this.x = random.nextInt(boundX);
        this.y = random.nextInt(boundY);
    }
    
    public void setMoveLeft(int moves){
        this.moveLeft = moves;
    }
    
    public int getX(){
        return this.x;
    }
    
     public int getY(){
        return this.y;
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
    
    public boolean equals(vampires v){
        return this.getX() == v.getX() && this.getY() == v.getY();
    }

    @Override
    public void execute(Scanner reader) {
        int moveX = random.nextInt(boundX);
        int moveY = random.nextInt(boundY);
        
        move(moveX,moveY);
    }
    
    
    
    public String toString(){
        return "v " + this.getX() + " " + this.getY();
    }
        
    
}
