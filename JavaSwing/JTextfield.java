
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author fahim
 */
public class JTextfield extends JFrame{
    private Container c;
    private JTextField tf1, tf2;
    private Font f;
    
    JTextfield(){
        initComponents();
        
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setBackground(Color.red);
        c.setLayout(null);
        f = new Font("Arial", Font.BOLD + Font.ITALIC, 30);
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 50);
        tf1.setFont(f);
        tf1.setForeground(Color.green);
        tf1.setBackground(Color.black);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);
        
        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 50);
        c.add(tf2);
    }
    
    public static void main(String[] args) {
        JTextfield frame = new JTextfield();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 500, 500, 600);
        frame.setTitle("Escape Game");
    }
    
}
