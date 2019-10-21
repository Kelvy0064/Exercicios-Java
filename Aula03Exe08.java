import javax.swing.JOptionPane;

public class Aula03Exe08 {

	public static void main(String[] args) {
		double fah = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura em ºF: "));
		double celsius = (5*(fah -32))/9;
		JOptionPane.showMessageDialog(null, "O valor da tempreratura em ºC é: "+ celsius);

	}

}
