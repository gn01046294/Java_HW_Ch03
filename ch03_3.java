package Ch03;

import java.util.Scanner;
//����L��J��Ӿ��,�L�X�L�̪��M�t�n��
public class ch03_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = 0, b = 0;

		if (scan.hasNextInt()) {
			n = scan.nextInt();
			b = scan.nextInt();
			System.out.println("�M=" + (n + b));
			System.out.println("�t=" + (n - b));
			System.out.println("�n=" + (n * b));
			System.out.println("��=" + (n / b));
			System.out.println("�l=" + (n % b));

		}

	}

}
