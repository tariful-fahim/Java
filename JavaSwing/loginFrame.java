
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class loginFrame extends JFrame{
    private Container c;
    private JTextField tf;
    private JPasswordField pf;
    private JLabel userlabel, passlabel;
    private JButton loginButton, clearButton;
    private Font f;
    
    loginFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(20, 20, 600, 600);
        this.setTitle("Login Frame");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);
        f = new Font("Arial",Font.BOLD,20);
        
        userlabel = new JLabel("Username");
        userlabel.setBounds(50, 50, 150, 50);
        userlabel.setFont(f);
        c.add(userlabel);
        
        tf = new JTextField();
        tf.setBounds(170, 50, 200, 50);
        tf.setFont(f);
        c.add(tf);
        
        passlabel = new JLabel("password");
        passlabel.setBounds(50, 120, 150, 50);
        passlabel.setFont(f);
        c.add(passlabel);
        
        pf = new JPasswordField();
        pf.setBounds(170, 120, 200, 50);
        pf.setFont(f);
        c.add(pf);
        
        
        loginButton = new JButton("Login");
        loginButton.setBounds(100, 200, 150, 50);
        c.add(loginButton);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(250, 200, 150, 50);
        c.add(clearButton);
        
        loginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1 = tf.getText();
                String s2 = pf.getText();
                if(s1.equals("Fahim") && s2.equals("123")){
                    JOptionPane.showMessageDialog(null, "you're successfully logged in!");
                    //dispose();
                    Newframe frame = new Newframe();
                    frame.setVisible(true);
                }
                else
                    JOptionPane.showMessageDialog(null, "Invalid username or password!");
            }
        });
        
        clearButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("");
                pf.setText("");
            }
        });
    }
    public static void main(String[] args) {
        loginFrame frame = new loginFrame();
        frame.setVisible(true);
    }
}
