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
public class Not implements Criterion{
    private Criterion crieria;
    
    public Not(Criterion c){
        this.crieria = c;
    }

    @Override
    public boolean complies(String line) {
        return !this.crieria.complies(line);
    }
      
        
    
    
}
