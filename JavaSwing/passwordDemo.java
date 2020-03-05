package Swing;


import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;


public class passwordDemo extends JFrame{
    private Container c;
    private JPasswordField pf;
    passwordDemo(){
        initComponents();
    }
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        
        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setBounds(20, 30, 150, 50);
        c.add(pf);
        
    }
    public static void main(String[] args) {
         passwordDemo frame = new passwordDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 500, 500, 600);
        frame.setTitle("Escape Game");
    }
    
}
