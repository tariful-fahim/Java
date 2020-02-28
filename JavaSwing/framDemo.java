
package Swing;

import javax.swing.JFrame;


public class framDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 300, 400, 300);
        frame.setTitle("Escape Game");
                
        frame.setResizable(false);
        
    }
    
}
