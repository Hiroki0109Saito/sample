package Term_2;

import java.util.Scanner;

public class Ex2_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("x�̒l:");
		String x=scanner.next();
		System.out.print("y�̒l:");
		String y=scanner.next();

		double sum=Double.parseDouble(x)+Double.parseDouble(y);
		double ave=sum/2;

		System.out.printf("���v��"+"%.2f"+"�ł��B"+"\n",sum);
		System.out.printf("���ς�"+"%.3f"+"�ł��B"+"\n",ave);

		// TODO �����������ꂽ���\�b�h�E�X�^�u

		scanner.close();
	}

}
