package survey;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(400,200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }


    public JFrame getFrame() {
        return frame;
    }
    
    public void createComponents(Container container){
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        JLabel text = new JLabel("Are you?");
        container.add(text);
        
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        
        container.add(yes);
        container.add(no);
        
        container.add(new JLabel("Why?"));
        
        JRadioButton NoReason = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(NoReason);
        buttonGroup.add(fun);
        
        container.add(NoReason);
        container.add(fun);
        
        container.add(new JButton("Done!"));
        
        
    }
}
