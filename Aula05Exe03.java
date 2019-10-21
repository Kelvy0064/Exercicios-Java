import javax.swing.JOptionPane;

public class Aula05Exe03 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Segunda nota: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		double calculo = (nota1 + nota2 + nota3)/3;
		if(calculo >= 7) 
			JOptionPane.showMessageDialog(null, String.format("%s\nAprovado", nome));
		else if (calculo <= 5)
			JOptionPane.showMessageDialog(null, String.format("%s\nReprovado", nome));
		else
			JOptionPane.showMessageDialog(null, String.format("%s\nRecuperaçao", nome));
	}
}