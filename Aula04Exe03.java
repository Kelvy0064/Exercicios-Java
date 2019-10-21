import javax.swing.JOptionPane;

public class Aula04Exe03 {

	public static void main(String[] args) {
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço produto"));
		if (preco >= 100) {
			if (preco > 300)
				JOptionPane.showMessageDialog(null, preco * 0.18 + preco);
			else
				JOptionPane.showMessageDialog(null, preco * 0.12 + preco);
		}else
			JOptionPane.showMessageDialog(null, preco);
	}
}
