import java.util.Scanner;

public class Aula06Exe09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		int num = scan.nextInt();
		int temp = num;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 > 0) {
				temp = temp - i;
				count++;
			}
			if (temp <= 0) {
				break;
			}
		}
		System.out.println("A raiz quadrada é: " + count);
		scan.close();
	}
}