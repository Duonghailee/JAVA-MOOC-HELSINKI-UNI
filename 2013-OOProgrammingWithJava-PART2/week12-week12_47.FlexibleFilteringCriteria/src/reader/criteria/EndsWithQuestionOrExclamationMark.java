/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author duonghaily
 */
public class EndsWithQuestionOrExclamationMark implements Criterion {

    @Override
    public boolean complies(String line) {
        int len = line.length();
        if(len==0){
            return false;
        }
        else if(len==1){
            return (line.charAt(0) == '?' || line.charAt(0) == '!');
        }
        else{
            return (line.charAt(line.length()-1) == '?' || line.charAt(line.length()-1) == '!');
        }
        
    }
        
    
}
