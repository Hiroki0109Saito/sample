package Y;

import java.util.Scanner;

public class Y_7 {

	static int n = 0;

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.print("南無阿弥陀仏:");
		n = scanner.nextInt();
		move(n,'A','B','C');

		scanner.close();
	}
	public static void move(int n, char A, char B, char C) {
		if (n==1)
			System.out.println("Move disk "+n+" from "+A+" to "+C);
		else {
			move(n-1,A,C,B);
			System.out.println("Move disk "+n+" from "+A+" to "+C);
			move(n-1,B,A,C);
		}
	}
}

// // TODO 自動生成されたメソッド・スタブ
// Scanner scanner = new Scanner(System.in);
//
// System.out.print("南無阿弥陀仏:");
// int n = scanner.nextInt();
// int[] hanoi = new int[n];
// int[] b = new int[n];
// int[] c = new int[n];
//
// System.out.println("最初");
//
// for (int i = 0; i < n; i++) {
// hanoi[i] = i + 1;
// System.out.println("|" + hanoi[i] + "\t" + "|" + b[i] + "\t" + "|"
// + c[i] + "\t");
// }
// System.out.println("--------------------------");
//
// b[n - 1] = hanoi[0];
// hanoi[0] = 0;
//
// for (int i = 0; i < n; i++) {
// System.out.println("|" + hanoi[i] + "\t" + "|" + b[i] + "\t" + "|"
// + c[i] + "\t");
// }
// System.out.println("--------------------------");
//
// c[n - 1] = hanoi[1];
// hanoi[1] = 0;
//
// for (int i = 0; i < n; i++) {
// System.out.println("|" + hanoi[i] + "\t" + "|" + b[i] + "\t" + "|"
// + c[i] + "\t");
// }
// System.out.println("--------------------------");
//
// c[n - 2] = b[n - 1];
// b[n - 1] = 0;
//
// for (int i = 0; i < n; i++) {
// System.out.println("|" + hanoi[i] + "\t" + "|" + b[i] + "\t" + "|"
// + c[i] + "\t");
// }
// System.out.println("--------------------------");
//
// for (int i = 2; i < n; i++) {
// for (int j = 0; j < 1; j++) {
// if (i % 2 == 0) {
// b[n - 1] = hanoi[i];
// hanoi[i] = 0;
// } else {
// c[n - 1] = hanoi[i];
// hanoi[i] = 0;
// }
//
// for (int a = 0; a < n; a++) {
// System.out.println("|" + hanoi[a] + "\t" + "|" + b[a]
// + "\t" + "|" + c[a] + "\t");
// }
// System.out.println("--------------------------");
//
// }
// if (i % 2 == 0) {
// for (int k = 1; k <= i; k++) {
// b[n - k-1] = c[n - k ];
// c[n - k ] = 0;
// }
// } else {
// for (int k = 1; k <=i; k++) {
// c[n -1- k] = b[n - k ];
// b[n - k ] = 0;
// }
// }
//
// for (int aa = 0; aa < n; aa++) {
// System.out.println("|" + hanoi[aa] + "\t" + "|" + b[aa] + "\t"
// + "|" + c[aa] + "\t");
// }
// System.out.println("--------------------------");
//
// if (b[0] == 1 || c[0] == 1) {
// break;
// }
// }
// scanner.close();
// }
// }
