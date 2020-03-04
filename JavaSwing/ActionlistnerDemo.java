
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionlistnerDemo extends JFrame{
    private Container c;
    private JTextField tf1, tf2;
    
    ActionlistnerDemo(){
        initComponents();
    }
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 50);
        c.add(tf1);
        
        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 40);
        c.add(tf2);
        
        tf1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                String s = tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "You didnt write anything");
                }
                else{
                JOptionPane.showMessageDialog(null, "tf1 = "+s);
                }
            }
        });
    }
    public static void main(String[] args) {
        ActionlistnerDemo frame = new ActionlistnerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 500, 500, 600);
        frame.setTitle("Escape Game");
    }
    
}
