package Term_7;

import java.util.Scanner;

public class Ex7_21 {
	public static void aryExChng(int[] a,int[] b){
		int num=0;
		if(a.length>b.length){
			for(int i=0;i<b.length;i++){
				num=a[i];
				a[i]=b[i];
				b[i]=num;
			}
		}else{
			for(int i=0;i<a.length;i++){
				num=a[i];
				a[i]=b[i];
				b[i]=num;
			}
		}
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner =new Scanner(System.in);

		System.out.print("�z��a�̗v�f��:");
		int a=scanner.nextInt();

		int[]b=new int [a];

		for(int i=0;i<a;i++){
			System.out.print("a["+i+"]:");
			b[i]=scanner.nextInt();
		}

		System.out.print("�z��b�̗v�f��:");
		int c=scanner.nextInt();

		int[]d=new int [c];

		for(int i=0;i<c;i++){
			System.out.print("b["+i+"]:");
			d[i]=scanner.nextInt();
		}

		aryExChng(b,d);

		System.out.println("�z��a�Ɣz��b�̑S�v�f���������܂����B");

		for(int i=0;i<a;i++){
			System.out.println("a["+i+"]:"+b[i]);
		}

		for(int i=0;i<c;i++){
			System.out.println("b["+i+"]:"+d[i]);
		}

		scanner.close();
	}

}
