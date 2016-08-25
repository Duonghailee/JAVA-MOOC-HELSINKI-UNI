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
public class LengthAtLeast implements Criterion {
    private int lengthAtLeast;
    
    public LengthAtLeast(int len){
        this.lengthAtLeast = len;
    }

    @Override
    public boolean complies(String line) {
        int lenOfLine = line.length();
        return lenOfLine>=this.lengthAtLeast;
    }
        
        
    
    
}
