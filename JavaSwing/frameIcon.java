
package Swing;


import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class frameIcon extends JFrame{
    private Container c;
    frameIcon(){
        
       initComponents();
    }
    public void initComponents(){
        
        c = this.getContentPane();
        c.setBackground(Color.red);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("monster.jpeg"));
        this.setIconImage(icon.getImage());
    }
    public static void main(String[] args) {
        frameIcon frame = new frameIcon();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 200, 200);
        frame.setTitle("Escape Game");
                
        //frame.setResizable(false);
    }
}
