import javax.swing.JOptionPane;

public class Aula05Exe05 {
	public static void main(String[] args) {
		String[] meses = new String[12];
		meses[0] = "Janeiro";
		meses[1] = "Fervereiro";
		meses[2] = "Março";
		meses[3] = "Abril";
		meses[4] = "Maio";
		meses[5] = "Junho";
		meses[6] = "Julho";
		meses[7] = "Agosto";
		meses[8] = "Setembro";
		meses[9] = "Outubro";
		meses[10] = "Novembro";
		meses[11] = "Dezembro";
		int valorRecebido = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de um mes: "));
		JOptionPane.showMessageDialog(null, String.format("%s", meses[valorRecebido - 1]));
		
	}
}
