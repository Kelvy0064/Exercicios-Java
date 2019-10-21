import javax.swing.JOptionPane;

public class Aula06Exe03 {
	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			String strNum = new String();
			float num = 0;
			strNum = JOptionPane.showInputDialog(null, "Digite um numero ");
			num = Float.parseFloat(strNum);
			System.out.println(num / 2);
		}
	}
}