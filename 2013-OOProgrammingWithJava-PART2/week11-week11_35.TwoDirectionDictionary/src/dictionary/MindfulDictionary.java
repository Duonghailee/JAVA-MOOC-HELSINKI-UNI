/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author duonghaily
 */
public class MindfulDictionary {
    private Map<String, String> dict;
    private String file ;

    public MindfulDictionary() {
        dict = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file){
        this();
        this.file = file;
    }
    
    
    public void add(String word, String translation){
        if(!dict.containsKey(word)){
            dict.put(word, translation);
            dict.put(translation, word);
        }
    }
    
    public String translate(String word){
        
       return dict.get(word);
        
    }
    
    public void remove(String word){
        if(dict.containsKey(word)){
            if(dict.containsKey(dict.get(word))){
                dict.remove(dict.get(word));
             }
            dict.remove(word);
        }
        //String translation = translate(word);
        // dict.remove(translation), dict.remove(word);
        
    }
    
    public boolean load() {  
        try{
            Scanner reader = new Scanner(new File(file));
            readFileIntoDict(reader);
            reader.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    private void readFileIntoDict(Scanner reader){
            while (reader.hasNextLine() ){
                String line = reader.nextLine();
                String[] parts = line.split(":");   // the line is split at :
                this.add(parts[0], parts[1]);
            }
    }
    
    public boolean save(){
        try{
            FileWriter writer = new FileWriter(new File(file));
            saveDictToFile(writer);
            writer.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    private void saveDictToFile(FileWriter writer) throws IOException{
       List<String> newDict = new ArrayList<String>();
       for(String word : dict.keySet() ){
            String translation = dict.get(word);
            if(!newDict.contains(word)){
                String toAdd = word + ":" + translation;
                writer.write(toAdd + "\n");
                newDict.add(translation);
                
            }
        }
    }
}
        

