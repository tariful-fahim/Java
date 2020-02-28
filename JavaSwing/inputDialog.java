import javax.swing.JOptionPane;
class inputdialog{
	public static void main(String[] args){
		String f_name = JOptionPane.showInputDialog(null, "Enter your first name: ", "Information", 3);
		String l_name = JOptionPane.showInputDialog(null, "Enter your last name: ", "Information", 3);
		String name = f_name +" "+ l_name;
		JOptionPane.showMessageDialog(null, "your full name: "+name, "Escape Game", 3);
	}
}
