import javax.swing.JOptionPane;

public class Aula05Exe08 {
	public static void main(String[] args) {
		int nivel = Integer.parseInt(JOptionPane.showInputDialog("Nivel"));
		double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Horas trabalhadas"));
		if(nivel == 1) 
			JOptionPane.showMessageDialog(null, horasTrabalhadas * 12);
		if(nivel == 2)
			JOptionPane.showMessageDialog(null, horasTrabalhadas * 17);
		if(nivel == 3)
			JOptionPane.showMessageDialog(null, horasTrabalhadas * 25);
	}
}
