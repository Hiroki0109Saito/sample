package Term_4;

import java.util.Scanner;

public class Ex4_22 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("�������p�̓񓙕ӎO�p�`��\�����܂��B");
		System.out.print("�i����:");

		int a=scanner.nextInt();

		for(int i=0;i<a;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();

	}

}