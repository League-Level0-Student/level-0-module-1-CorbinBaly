package extra;

import javax.swing.JOptionPane;

public class SecretMessageBox {
public static void main(String[] args) {
	String Password= "IDK";
			String SecretMsg=JOptionPane.showInputDialog("What is your secret message?");
			JOptionPane.showMessageDialog(null, "You can only see the secret message if you can guess the passcode");
			JOptionPane.showInputDialog("What is the passcode?");
			if(Password.equalsIgnoreCase("IDK")) {
			JOptionPane.showMessageDialog(null, "The secret message is secret message...");	
			
			}
			else {
				
			}
}
}
