
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Skier implements Comparable<Skier> {
    private String name;
    private int length;
    private List<Integer> votes;
    public int sumOfPoints;
    private ArrayList<Integer> lengthList;
    
    public Skier(String name){
        this.name = name;
        this.length = 0;
        this.votes = new ArrayList<Integer>();
        this.sumOfPoints = 0;
        this.lengthList = new ArrayList<Integer>();
        
    }
    
    public int length(){
        Random random  = new Random();
        int len = random.nextInt(61)+60;
        this.lengthList.add(len);
        return this.length = len;
        
    }
    
    public List<Integer> vote(){
        Random random  = new Random();
        List<Integer> newVote = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            int vote = random.nextInt(11)+10;
            newVote.add(vote);
        }
        
        this.votes = newVote;
        return this.votes;
    }
    
    // method calculate the point
    public int totalPoint(){
        
        if(this.length==0 && this.votes.isEmpty()){
            return 0;
        }
        else{
            Collections.sort(this.votes);
            int votesSelect = this.votes.get(1)+this.votes.get(2)+this.votes.get(3);
            int totalPoint = this.length + votesSelect;;
            //this.sumOfPoints += totalPoint;
            return totalPoint;
        }
    }
    
   
    
    public int compareTo(Skier skier){
        return this.totalPoint() - skier.totalPoint();
    }
    
    public String result(){
        return "  " + this.name + "\n    length: " + this.length +
                "\n    judge votes: " + this.votes;
    }
    
    //toStrin overide
    public String toString(){
        return this.name + " (" + this.totalPoint() + " points)";
    }
    
    // print tournament result
    public String printFinal(){
        
        String lens = "";
        for(int i=0;i<this.lengthList.size()-1;i++){
            lens += this.lengthList.get(i) +" m, ";
        }
        
        //this.sumOfPoints += this.totalPoint();
       
        lens += this.lengthList.get(lengthList.size()-1) + " m"; 
        return this.name + " (" + this.sumOfPoints +" points)\n" +
                "            " +"jump lengths: " + lens;
    }
    
}
