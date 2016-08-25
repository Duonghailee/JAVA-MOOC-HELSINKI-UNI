
import java.io.File;
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
public class Printer {
    
    private Scanner reader;        
    private File f;
    public Printer(String fileName) throws Exception{
      
        f = new File(fileName);
        
    }
    
    public void printLinesWhichContain(String word) throws Exception{
            reader = new Scanner(f);
            String line = "";
            while(reader.hasNextLine()){
                line = reader.nextLine();
                if(line.contains(word)){
                    System.out.println(line);
                }
            }
            reader.close();
        }    
}

