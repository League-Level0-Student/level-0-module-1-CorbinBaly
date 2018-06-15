package extra;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String BDay=JOptionPane.showInputDialog("What is your birthday? (mm/dd)");
	if(BDay.equals("06/16")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy UNbirthday!");
	}
}
}
