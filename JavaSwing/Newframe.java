
package Swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Newframe extends JFrame{
    private Container c;
    private JLabel lbl;
    Newframe(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.setBounds(50, 20, 450, 500);
        
        this.setTitle("NEW frame");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        lbl = new JLabel("Hello Everyone to the new Frame");
        lbl.setBounds(20, 20, 300, 50);
        c.add(lbl);
        
        
    }
    public static void main(String[] args) {
        Newframe fr = new Newframe();
        fr.setVisible(true);
        
    }
}
