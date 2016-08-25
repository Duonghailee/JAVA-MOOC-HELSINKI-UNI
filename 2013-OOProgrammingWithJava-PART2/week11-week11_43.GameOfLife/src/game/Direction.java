/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author duonghaily
 */
public enum Direction {
    NORTHWEST(-1,-1),
    NORTH(0,-1),
    NORTHEAST(1,-1),
    EAST(1,0),
    SOUTHEAST(1,1),
    SOUTH(0,1),
    SOUTHWEST(-1,1),
    WEST(-1,0),
    ;
    final int dx;
    final int dy;
    
    Direction(int dx, int dy){
        this.dx = dx;
        this.dy = dy;
    }
    
    
}
