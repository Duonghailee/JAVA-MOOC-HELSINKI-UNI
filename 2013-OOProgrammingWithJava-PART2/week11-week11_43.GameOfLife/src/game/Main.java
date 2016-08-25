package game;

import gameoflife.Simulator;


public class Main {
    public static void main(String[] args) {
        PersonalBoard board = new PersonalBoard(20, 20);
        board.initiateRandomCells(0.2);

        GameOfLifeTester tester = new GameOfLifeTester(board);
        tester.play();   
    }
}
