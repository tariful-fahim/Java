
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class labelDemo extends JFrame{
    private Container c;
    private JLabel userlabel, passlabel, imglabel;
    private Font f;
    private ImageIcon icon;
    labelDemo(){
        
        initComponents();
    }
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        f = new Font("Arial", Font.BOLD, 14);
        
        userlabel = new JLabel();
        
        userlabel.setText("Enter your name: ");
        userlabel.setBounds(20, 50, 150, 50);
        userlabel.setFont(f);
        userlabel.setForeground(Color.yellow);
        userlabel.setOpaque(true);
        userlabel.setBackground(Color.BLACK);
        userlabel.setToolTipText("input unique username");
        c.add(userlabel);
        
        //String s = userlabel.getToolTipText();
        //System.out.println(s);
        
        passlabel = new JLabel("Enter your password: ");
        passlabel.setBounds(20, 100, 200, 50);
        c.add(passlabel);
        passlabel.setFont(f);
        
        icon = new ImageIcon(getClass().getResource("worldwide.png"));
        imglabel = new JLabel(icon);
        imglabel.setBounds(20, 200, icon.getIconWidth(), icon.getIconHeight());
        c.add(imglabel);
    }
    public static void main(String[] args) {
        labelDemo frame = new labelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 500, 500, 600);
        frame.setTitle("Escape Game");
    }
}
