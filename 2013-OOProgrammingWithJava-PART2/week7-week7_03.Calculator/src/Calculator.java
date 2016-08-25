/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Calculator {
    private Reader reader;
    private int calDone ;

    public Calculator(){
        reader = new Reader();
        calDone = 0;
    }
     public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
     
     // sum method
     private void sum(){
         calDone++;
         int[] input = readInput();
         System.out.println("sum of the values " + (input[0] + input[1]));
         
     }
     
     // difference method
     private void difference(){
         calDone++;
         int[] input = readInput();
         System.out.println("difference of the values " + (input[0] - input[1]));
        
     }
     
     //product method
     private void product(){
         calDone++;
         int[] input = readInput();
         System.out.println("product of the values " + (input[0] * input[1]));
         
     }
     
     // statistics method
     private void statistics(){
         System.out.println("Calculation done " +calDone);
     }
     
     // to avoid repetition in reading input
     private int[] readInput(){
         int[] input = new int[2];
         System.out.print("value1: ");
         int num1 = reader.readInteger();
         System.out.print("value2: ");
         int num2 = reader.readInteger();
         input[0] = num1;
         input[1] = num2;
         return input;
     }
}
