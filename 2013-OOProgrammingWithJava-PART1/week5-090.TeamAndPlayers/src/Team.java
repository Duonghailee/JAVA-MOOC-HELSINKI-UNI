
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
public class Team {
    private String name;
    private ArrayList<Player> list;
    private int maxSize;
    // constructor
    public Team(String name){
        this.name = name;
        list = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    // method 
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        
        if(this.size()<this.maxSize){
            this.list.add(player);
        }
        
    }
    
    // printmethod
    public void printPlayers(){
        for(Player p : list){
            System.out.println(p);
        }
    }
    
    // setMaxSize mthod
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    // return size method
    public int size(){
        return list.size();
    }
    
    // goals method
    public int goals(){
        int goals = 0;
        for(Player p : list){
            goals += p.goals();
        }
        return goals;
    }
}

