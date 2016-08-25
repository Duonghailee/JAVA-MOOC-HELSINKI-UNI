
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class resetListener implements ActionListener {
    private JTextField input;
    private JTextField output;
    private JButton reset;
    
    public resetListener(JTextField in, JTextField out, JButton resetBt ){
        this.input = in;
        this.output = out;
        this.reset = resetBt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //int inputNum = Integer.parseInt(this.input.getText());
        //int outputNum = Integer.parseInt(this.output.getText()) - inputNum;
        this.output.setText("0");
        this.input.setText("");
        this.reset.setEnabled(false);

    }
}
