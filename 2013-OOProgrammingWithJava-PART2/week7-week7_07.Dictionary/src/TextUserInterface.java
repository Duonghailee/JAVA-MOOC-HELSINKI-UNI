
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;
    
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dict = dictionary;
    }
    
    public void start(){
        System.out.println("Statement: \n\tadd - adds a word pair to the dictionary");
        System.out.println("\ttranslate - asks a word and prints its translation");
        System.out.println("\tquit - quits the text user interface");
        while(true){
            System.out.print("Statement: ");
            String input = reader.nextLine();
            if(input.equals("quit")){
                System.out.println("Cheers!");
                break;
             }   
            else if(input.equals("add")){
                this.add();
            }
            else if(input.equals("translate")){
                this.translate();
            }
            else{
            
                System.out.println("Unknown statement");
            }
        }
    }
       
    public void add(){
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String trans = reader.nextLine();
        this.dict.add(word, trans);
    }
    
    public void translate(){
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        
        String ans = this.dict.translate(word);
        System.out.println("Translation: " + ans);
    }

}
