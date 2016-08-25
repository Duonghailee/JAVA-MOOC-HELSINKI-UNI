/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author duonghaily
 */
public class WordInspection {
    private File file;
    private Scanner reader;
    
    public WordInspection(File file) throws FileNotFoundException{
        this.file = file;
        reader = new Scanner(file);
    }
    
    // wordCount as one word each row
    public int wordCount() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file);
        int wordCount = 0;
        String line ="";
        while(reader.hasNextLine()){
            line = reader.nextLine();
            wordCount ++;
        }
        reader.close();
        return wordCount;
                
    }
    
    // List of z word
    public List<String> wordsContainingZ(){
        List<String> result = new ArrayList<String>();
        String line ="";
        while(reader.hasNextLine()){
            line = reader.nextLine();
            if(line.contains("z")){
                result.add(line);
            }
        }
        return result;
    }
    
    // word in ending l
     public List<String> wordsEndingInL() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file);
        List<String> result = new ArrayList<String>();
        String line ="";
        while(reader.hasNextLine()){
            line = reader.nextLine();
            if('l'== line.charAt(line.length()-1)){
                result.add(line);
            }
        }
        return result;
     }
     
     // check palindromes
     public List<String> palindromes() throws FileNotFoundException{
     Scanner reader = new Scanner(this.file);
        List<String> result = new ArrayList<String>();
        String line ="";
        while(reader.hasNextLine()){
            line = reader.nextLine();
            
            if(isPalindromes(line)){
                result.add(line);
            }
        }
        return result;
     }
     
     // method check palindromes using recurssion
     public boolean isPalindromes(String str){
         if(str.length()<2){
             return true;
         }
         
         else if(str.charAt(0) != str.charAt(str.length()-1)){
             return false;
         }
         else {
             return isPalindromes(str.substring(1,str.length()-1));
         }
         
     }
     
     // method add vowels
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file);
        List<String> result = new ArrayList<String>();
        String line ="";
        
        while(reader.hasNextLine()){
            line = reader.nextLine();
            if(containsAllVowels(line)){
                result.add(line);
            }
        }
        return result;
    }
    
    //support method check containsVowel
    public boolean containsAllVowels(String str){
        String test = "aeiouyäö";
        boolean result = true;
        if(str.contains("ä")&&str.contains("ö")&&str.contains("a")&&str.contains("o")&&str.contains("u")&&str.contains("e")&&str.contains("i")&&str.contains("y")){
            return result;
        }
        
        return false;
    }
     
    // another solution, can use reserve
    //for(char vowel: this.vowels.toCharArray(), if only one word does notcontain vowel; retur false
}
