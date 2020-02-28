/*
	JOptionPane class and showMessageDialog method

   1st parameter -> positioning my Dialog box
   2nd parameter -> my message
   3rd parameter -> Title of the dialog box
   4th parameter -> icon of the dialog box [-1,3]

*/

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class messagedialog1{
	public static void main(String[] args){
		ImageIcon img = new ImageIcon("monster.jpeg");
		JOptionPane.showMessageDialog(null, "you win!", "Escape game", -1, img);
	}
}
