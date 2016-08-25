
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class Dictionary {
    private HashMap<String, String> dic;
    
    public Dictionary(){
        dic = new HashMap<String, String>();
    }
    
    public void add (String word, String translation){
        this.dic.put(word, translation);
    }
    
    public String translate(String word){
        String result = null;
        if(this.dic.containsKey(word)){
            result = this.dic.get(word);
        }
        return result;
    }
    
    public int amountOfWords(){
        return this.dic.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> transList = new ArrayList<String>();
        for(String key : this.dic.keySet()){
            String result = key + " = " + this.dic.get(key);
            transList.add(result);
        }
        return transList;
    }
    
    
}
