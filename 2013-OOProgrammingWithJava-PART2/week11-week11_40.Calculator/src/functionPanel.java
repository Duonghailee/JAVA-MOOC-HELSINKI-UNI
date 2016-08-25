
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
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
public class functionPanel extends JPanel {
    private JTextField in;
    private JTextField out;
    
    public functionPanel(JTextField in, JTextField out){
        super(new GridLayout(1,3));
        this.in = in;
        this.out = out;
        createComponents();
    }
    
    

    private void createComponents() {
        JButton plusBt = new JButton("+");
        JButton minusBt = new JButton("-");
        JButton resetBt = new JButton("Z");
        
        plusListener plus = new plusListener(in, out, resetBt);

        minusListener minus = new minusListener(in, out, resetBt);

        resetListener reset = new resetListener(in, out, resetBt);
        
        plusBt.addActionListener(plus);
        minusBt.addActionListener(minus);
        resetBt.addActionListener(reset);
        
        resetBt.setEnabled(false);
        
        add(plusBt);
        add(minusBt);
        add(resetBt);
       
    }
}
