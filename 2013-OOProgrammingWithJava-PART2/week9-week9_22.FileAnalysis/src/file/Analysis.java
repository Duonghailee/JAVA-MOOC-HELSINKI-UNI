/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author duonghaily
 */
public class Analysis {
    private File file;
    private Scanner reader;
    
    public Analysis(File file) throws FileNotFoundException {
        this.file = file;
        reader = new Scanner(file);
       
    }
    
    public int lines() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        int lines = 0;
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            lines ++;
        }
        reader.close();
        return lines;
        
    }
    
    public int characters() throws FileNotFoundException{
        Scanner reader = new Scanner(file);
        int cha = 0;
        String line ="";
        while(reader.hasNextLine()){
             line = reader.nextLine();
             cha += line.length()+1;
        }
        
        reader.close();
        return cha;
    }
}
