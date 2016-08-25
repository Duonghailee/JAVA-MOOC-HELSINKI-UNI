/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author duonghaily
 */
public class Thermometer implements Sensor {
    private boolean on;
    @Override
    public boolean isOn() {
        return on; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void on() {
       this.on = true;
    }

    @Override
    public void off() {
      this.on = false;
    }

    @Override
    public int measure() {
        
        if(!this.isOn()) {
            throw new IllegalStateException("thermometer is off ");
        }
        
        Random random = new Random();
        return random.nextInt(61)-30;
    }
}
