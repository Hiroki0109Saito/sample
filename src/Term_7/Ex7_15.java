package Term_7;

import java.util.Scanner;

public class Ex7_15 {

	public static int sumOf(int[] a){
		int sum=0;
		for(int n:a){
			sum+=n;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.print("�v�f��:");
		int a=scanner.nextInt();

		int []x=new int[a];

		for(int i=0;i<a;i++){
			System.out.print("x["+i+"]:");
			x[i]=scanner.nextInt();
		}

		int sum=sumOf(x);

		System.out.println("�S�v�f�̍��v��"+sum+"�ł��B");
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		scanner.close();
	}

}
