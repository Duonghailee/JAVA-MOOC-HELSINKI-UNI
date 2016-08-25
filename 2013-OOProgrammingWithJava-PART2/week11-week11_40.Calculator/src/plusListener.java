
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.out;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class plusListener implements ActionListener{
    private JTextField input;
    private JTextField output;
    private JButton reset;
    
    
    public plusListener(JTextField in, JTextField out, JButton resetBt ){
        this.input = in;
        this.output = out;
        this.reset = resetBt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            int inputNum = Integer.parseInt(this.input.getText());
            int outputNum = Integer.parseInt(this.output.getText()) + inputNum;
            this.input.setText("");   
            this.output.setText("" + outputNum);
            outputNum = Integer.parseInt(this.output.getText());
            if(outputNum == 0){
                this.reset.setEnabled(false);
            }
            else{
                this.reset.setEnabled(true);
            }
        }
        catch(Exception ex){
            this.input.setText("");
        }
        
    }
    
    
}
