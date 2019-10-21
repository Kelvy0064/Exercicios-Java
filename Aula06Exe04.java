import javax.swing.JOptionPane;

public class Aula06Exe04 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			String nome = new String();
			String sexo = new String();
			int idade = 0;
			String strIdade = new String();
			nome = JOptionPane.showInputDialog(null, "Digite o nome ");
			sexo = JOptionPane.showInputDialog(null, "Digite o sexo M para masculino ou F para feminino");
			strIdade = JOptionPane.showInputDialog(null, "Digite a idade");
			idade = Integer.parseInt(strIdade);
			if (sexo.equals("M") && idade >= 21) {
				System.out.println(nome);
			}
		}
	}
}