import javax.swing.JOptionPane;

public class Aula06Exe06 {
	public static void main(String[] args) {
		String strNumTermos = new String();
		String strRazao = new String();
		String strPrimeiroTermo = new String();
		int numTermos = 0;
		int razao = 0;
		int primeiroTermo = 0;
		strRazao = JOptionPane.showInputDialog(null, "Digite a razão ");
		strNumTermos = JOptionPane.showInputDialog(null, "Digite o numero termo ");
		strPrimeiroTermo = JOptionPane.showInputDialog(null, "Digite o primeiro de termos ");
		numTermos = Integer.parseInt(strNumTermos);
		razao = Integer.parseInt(strRazao);
		primeiroTermo = Integer.parseInt(strPrimeiroTermo);
		for (int a = primeiroTermo; a <= numTermos; a += razao) {
			System.out.println(a);
		}
	}
}