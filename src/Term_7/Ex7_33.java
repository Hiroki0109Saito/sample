package Term_7;

import java.util.Scanner;

public class Ex7_33 {
	public static void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void printArray(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]!=0){
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("1�����z��x�̗v�f��:");
		int a=scanner.nextInt();

		int []b=new int[a];

		for(int i=0;i<a;i++){
			System.out.print("x["+i+"]:");
			b[i]=scanner.nextInt();
		}

		System.out.print("2�����z��y�̗v�f��:");
		int c=scanner.nextInt();

		int [][]d=new int [c][100];
		int []e=new int [c];

		for(int i=0;i<c;i++){
			System.out.print(i+"�s�ڂ̗�:");
			e[i]=scanner.nextInt();
		}
		
		System.out.println("�e�v�f�̒l����͂���B");

		for(int i=0;i<c;i++){
			for(int j=0;j<e[i];j++){
				System.out.print("y["+i+"]["+j+"]:");
				d[i][j]=scanner.nextInt();
			}
		}

		System.out.println("\n"+"1�����z��x");
		printArray(b);
		System.out.println("\n"+"2�����z��y");
		printArray(d);

		scanner.close();

	}

}
