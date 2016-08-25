
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    // constructor
    public NightSky(double density){
        this.density = density;
        starsInLastPrint = 0;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height){
        this.width = width;
        this.height = height;
        starsInLastPrint = 0;
        this.density = 0.1;
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.height = height;
        this.width = width;
        starsInLastPrint = 0;
    }
    
    // printline method
    
     public void printLine() {
        Random random = new Random();
 
        for (int i = 0; i < this.width; i++) {
            double randomValue = random.nextDouble();
 
            if (randomValue > this.density) {
                System.out.print(" ");
            } else {
                System.out.print("*");
                this.starsInLastPrint = this.starsInLastPrint + 1;
            }
        }
 
        System.out.println("");
    }
    
    // print method
    public void print(){
        starsInLastPrint = 0;

        for(int i=0;i<this.height;i++){
            printLine();
        }
    }
    
    // return numberOfStar print
    public int starsInLastPrint(){
        return starsInLastPrint;
    }
    
}
