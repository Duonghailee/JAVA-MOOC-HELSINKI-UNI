package dungeon;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        //Scanner reader = new Scanner(System.in);
        Dungeon newgame = new Dungeon(9,9,3,100,true);
        newgame.run();
    }
}
