import javax.swing.JOptionPane;

public class Aula04Exe04 {

	public static void main(String[] args) {
		String valorRecebido = JOptionPane.showInputDialog("M ou F");
		String sexo = (valorRecebido.equals("M")) ? "o Senhor" : "a Senhora";
		JOptionPane.showMessageDialog(null, String.format("Seja bem vind%s!", sexo));	
	}
}
