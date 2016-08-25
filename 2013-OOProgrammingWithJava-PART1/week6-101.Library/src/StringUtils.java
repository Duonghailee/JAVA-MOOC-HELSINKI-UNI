/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class StringUtils {
    public static boolean included(String word, String searched){
        if(word.contains(searched)){
            return true;
        }
        
        String newSearched = searched.toUpperCase();
        newSearched =newSearched.trim();
        
        if(word.contains(newSearched)){
            return true;
        }
        return false;
    }
}
