import javax.swing.JOptionPane;

public class Aula05Exe10 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		int rgm = Integer.parseInt(JOptionPane.showInputDialog("Digite o RGM"));
		double nota1 = Double.parseDouble(
				JOptionPane.showInputDialog("Nota do laboratorio 0 a 2:"));
		double nota2 = Double.parseDouble(
				JOptionPane.showInputDialog("Nota da avaliaçao semestral 0 a 3:"));
		double nota3 = Double.parseDouble(
				JOptionPane.showInputDialog("Nota do exame final 0 a 5:"));
		double calculoMedia = nota1 + nota2 + nota3;
		if (calculoMedia >= 8.10) {
			String media = String.valueOf(calculoMedia);
			JOptionPane.showMessageDialog(null, String.format(
					"%s\n%d\n%s\nclassificaçao: A", nome, rgm, media));
		}else if (calculoMedia >= 7.8) {
			String media = String.valueOf(calculoMedia);
			JOptionPane.showMessageDialog(null, String.format(
					"%s\n%d\n%s\nclassificaçao: B", nome, rgm, media));
		}else if (calculoMedia >= 6.7) {
			String media = String.valueOf(calculoMedia);
			JOptionPane.showMessageDialog(null, String.format(
					"%s\n%d\n%s\nclassificaçao: C", nome, rgm, media));
		}else if (calculoMedia >= 5.6) {
			String media = String.valueOf(calculoMedia);
			JOptionPane.showMessageDialog(null, String.format(
					"%s\n%d\n%s\nclassificaçao: D", nome, rgm, media));
		}else if (calculoMedia >= 5) {
			String media = String.valueOf(calculoMedia);
			JOptionPane.showMessageDialog(null, String.format(
					"%s\n%d\n%s\nclassificaçao: R", nome, rgm, media));
		}

	}

}
