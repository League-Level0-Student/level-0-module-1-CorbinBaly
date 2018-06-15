package extra;

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String Name=JOptionPane.showInputDialog("What is your name?");
	if(Name.equalsIgnoreCase("Jack")) {
		JOptionPane.showMessageDialog(null, "Jack more like Pack, AmIRite?");
	}if(Name.equalsIgnoreCase("Pack")) {
			JOptionPane.showMessageDialog(null, "Pack more like Jack, AmIRite?");
		}
	}
}

