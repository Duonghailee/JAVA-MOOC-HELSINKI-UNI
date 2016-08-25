package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure obj;
    private DrawingBoard board;
    
    public UserInterface(Figure obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        board= new DrawingBoard(obj);
        container.add(board);
        frame.addKeyListener(new KeyboardListener(board,obj));
    }

    private void addListeners() {
       
    }

    public JFrame getFrame() {
        return frame;
    }
}
