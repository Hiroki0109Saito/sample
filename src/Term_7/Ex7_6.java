package Term_7;

import java.util.Scanner;

public class Ex7_6 {
	public static void printSeason(int m){
		switch(m){
		case 1:
		case 2:
		case 12:System.out.print("���̌��̋G�߂͓~�ł��B");
		break;

		case 3:
		case 4:
		case 5:System.out.print("���̌��̋G�߂͏t�ł��B");
		break;


		case 6:
		case 7:
		case 8:System.out.print("���̌��̋G�߂͉Ăł��B");
		break;

		case 9:
		case 10:
		case 11:System.out.print("���̌��̋G�߂͏H�ł��B");
		break;

		default:System.out.print("");


		}
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		Scanner scanner=new Scanner(System.in);

		System.out.print("�����ł���(1~12):");
		int a=scanner.nextInt();

		printSeason(a);

		scanner.close();
	}
}
