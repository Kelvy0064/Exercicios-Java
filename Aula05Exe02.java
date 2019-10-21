import javax.swing.JOptionPane;

public class Aula05Exe02 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		if (number >= 25) {
			if(number == 40)
				JOptionPane.showMessageDialog(null, "Igual a 40");
			else if(number > 80)
				JOptionPane.showMessageDialog(null, "Maior que 80");		
		}else
			JOptionPane.showMessageDialog(null, "Menor que 25");		
	}
}
