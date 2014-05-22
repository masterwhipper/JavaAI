package gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Master
 */
public class Gui  {
    public JFrame frame;
    
    public JPanel panel;
    public JPanel input;
    
    public JButton inputSubmit;
    
    public JLabel label;
    
    public BorderLayout border;
    
    public JTextField inputArea;
    
    private ImageIcon iconURL;
    
    public void guiSet(){
        frame = new JFrame("Java AI Assistant");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/javaAI.png")));
        
        //Panels
        panel = new JPanel();
            panel.setSize(Window.WIDTH, Window.HEIGHT - 100);
            panel.setBackground(Color.WHITE);

        //Input - Properties
        input = new JPanel();
            input.setSize(Window.WIDTH, 100);
            input.setBackground(Color.BLACK);
        //Input - Additions
        inputArea = new JTextField("Enter your query");
            input.add(inputArea, BorderLayout.EAST);
        inputSubmit = new JButton("Sumbit");
            input.add(inputSubmit, BorderLayout.WEST);
            
        
        //Addtions
        frame.add(panel, BorderLayout.PAGE_START);
        frame.add(input, BorderLayout.PAGE_END);
        
        
        //End stoof
        frame.setVisible(true);
        //test
    }
}