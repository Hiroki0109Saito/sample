package Term_4;

import java.util.Scanner;

public class Ex4_16 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("��cm����:");
		int a=scanner.nextInt();
		System.out.print("��cm�܂�:");
		int b=scanner.nextInt();
		System.out.print("��cm����:");
		int c=scanner.nextInt();
		System.out.println("�g�� �W���̏d");
		System.out.println("--------------");

		int n=1+(b-a)/c;

		while(n!=0){
			System.out.println(a+" "+(a-100)*0.9);
			a=a+c;
			n--;
		}
		scanner.close();
	}
}
