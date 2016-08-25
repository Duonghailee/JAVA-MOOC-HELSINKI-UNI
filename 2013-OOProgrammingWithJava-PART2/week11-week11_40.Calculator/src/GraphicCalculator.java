
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ComponentListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    public GraphicCalculator(){
        
    }
    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300,150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
       
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        JTextField input = new JTextField("");
        
        // add functional panel, +, -, Z
        functionPanel func = new functionPanel(input, output);
        
        container.add(output);
        container.add(input);
        container.add(func);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}