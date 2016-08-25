/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author duonghaily
 */
public class PersonalBoard extends GameOfLifeBoard{
    
    public PersonalBoard(int width, int height){
        super(width, height);
    }
    
    @Override
    public void initiateRandomCells(double d) {
        boolean[][] board = getBoard();
        Random random = new Random();
        for(int y=0; y<this.getHeight();y++){
            for(int x=0; x<this.getWidth();x++){
                if(random.nextDouble() < d){
                    turnToLiving(x,y);
                }
            }
        }
        
    }
       
        

    @Override
    public boolean isAlive(int x, int y) {
        boolean[][] board = getBoard();
        if(x>=this.getWidth()||y>=this.getHeight()||x<0||y<0){
           return false;
        }
        else{
            return board[x][y] == true;
        }
    }
        
        

    @Override
    public void turnToLiving(int x, int y) {
        boolean[][] board = getBoard();
        if(x>=this.getWidth()||y>=this.getHeight()||x<0||y<0){
           return;
        }
        board[x][y] = true;
    }
        

    @Override
    public void turnToDead(int x, int y) {
        boolean[][] board = getBoard();
        if(x>=this.getWidth()||y>=this.getHeight()||x<0||y<0){
           return;
        }
        board[x][y] = false;
    }
        

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        boolean[][] board = getBoard();
        int num = 0;
        for(Direction direction : Direction.values()){
            if(isAlive(x + direction.dx, y + direction.dy)){
                num++;
            }
        }
        return num;
    }

        

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        boolean[][] board = getBoard();
        if (livingNeighbours < 2) {
            turnToDead(x, y);
        } 
        else if ((livingNeighbours == 2 || livingNeighbours == 3) && isAlive(x, y)) {
 
        } 
        else if (livingNeighbours > 3) {
            turnToDead(x, y);
        }
        else if (livingNeighbours == 3) {
            turnToLiving(x, y);
        }
    }
        
}
