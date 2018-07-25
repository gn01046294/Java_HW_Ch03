package Ch03;

import java.util.Scanner;
//由鍵盤輸入兩個整數,印出他們的和差積商
public class ch03_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = 0, b = 0;

		if (scan.hasNextInt()) {
			n = scan.nextInt();
			b = scan.nextInt();
			System.out.println("和=" + (n + b));
			System.out.println("差=" + (n - b));
			System.out.println("積=" + (n * b));
			System.out.println("商=" + (n / b));
			System.out.println("餘=" + (n % b));

		}

	}

}
