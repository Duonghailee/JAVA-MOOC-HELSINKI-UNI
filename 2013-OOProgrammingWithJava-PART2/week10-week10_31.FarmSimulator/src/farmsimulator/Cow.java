/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author duonghaily
 */
public class Cow implements Milkable, Alive{
    private double volume = 0;
    private String name;
    private int capacity = 15 + new Random().nextInt(26);
    
    public Cow(){
        int index = new Random().nextInt(NAMES.length);
        this.name = NAMES[index];
    }
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getAmount(){
        return this.volume;
    }

    @Override
    public double milk() {
        double milkAmount = this.volume;
        this.volume = 0;
        return milkAmount;
    }

    @Override
    public void liveHour() {
        double addMilk =  25 + new Random().nextInt(6);
        addMilk /= 24;
        if((volume + addMilk) > capacity){
            volume = capacity;
        }
        else{
            this.volume += addMilk;
        }
       
    }
    
    public String toString(){
        return this.name + " " + Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
    
}
