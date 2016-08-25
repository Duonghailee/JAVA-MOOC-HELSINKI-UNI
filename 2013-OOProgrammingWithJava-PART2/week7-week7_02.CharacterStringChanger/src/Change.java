/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Change {
    private char fromCha;
    private char toCha;
    public Change(char fromCharacter, char toCharacter ){
       this.fromCha = fromCharacter;
       this.toCha = toCharacter;
    }
    
    public String change(String characterString){

        return characterString.replace(fromCha, toCha);
    }    
}
