import javax.swing.JOptionPane;

public class Aula04Exe01 {

	public static void main(String[] args) {
		double number = Double.parseDouble(JOptionPane.showInputDialog("Type a number: "));
		if(number % 3 == 0) {
			JOptionPane.showMessageDialog(null, "Divisivel por 3");
		}else
			JOptionPane.showMessageDialog(null, "Não divisivel por 3");
	}
}
