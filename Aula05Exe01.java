import javax.swing.JOptionPane;

public class Aula05Exe01 {

	public static void main(String[] args) {
		int number = Integer.parseInt(
				JOptionPane.showInputDialog("Digite um numero de 1 a 9: "));
		switch(number) {
		case 1:
			JOptionPane.showMessageDialog(null, "Um");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Dois" );
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "três");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quatro");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Cinco");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Seis");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Sete");
			break;
		case 8: 
			JOptionPane.showMessageDialog(null, "Oito");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Nove");
			break;
		}

	}

}
