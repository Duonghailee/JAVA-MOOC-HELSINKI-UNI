/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Start your program here
        Scanner reader = new Scanner(System.in);
        SteelCollection steels = new SteelCollection();
        Steel steel1 = new Steel(2500, "1");
        Steel steel2 = new Steel(2700, "2");
        Steel steel3 = new Steel(2900, "3");
        Steel steel4 = new Steel(5000, "4");
        Steel steel5 = new Steel(6000, "5");
        Steel steel6 = new Steel(7000, "6");
        Steel steel7 = new Steel(7800, "7");
        
        steels.addSteel(steel1,24);
        steels.addSteel(steel2,12);
        steels.addSteel(steel3,16);
        steels.addSteel(steel4,12);
        steels.addSteel(steel5,17);
        steels.addSteel(steel6, 10);
        steels.addSteel(steel7,10);
        
        steels.printAllSteels();
        
    }
}
