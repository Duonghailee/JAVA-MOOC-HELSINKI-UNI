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
public class Both implements Criterion{
    private Criterion criteria1;
    private Criterion criteria2;
            
    public Both(Criterion c1, Criterion c2){
        this.criteria1 = c1;
        this.criteria2 = c2;
    }        
    @Override
    public boolean complies(String line) {
        return this.criteria1.complies(line)&&this.criteria2.complies(line);
    }
       
        
    
    
}
