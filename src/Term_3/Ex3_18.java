package Term_3;

import java.util.Scanner;

public class Ex3_18 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		Scanner scanner=new Scanner(System.in);

		System.out.print("����a:");
		int a=scanner.nextInt();
		System.out.print("����b:");
		int b=scanner.nextInt();

		int n=0;
		int m=0;

		if(a>b){
			n =a;
			m=b;
		}else{
			n=b;
			m=a;
		}
		System.out.println("\n"+"a��b�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("����a:"+n+"�ł��B");
		System.out.println("����b:"+m+"�ł��B");

		scanner.close();

	}
}
