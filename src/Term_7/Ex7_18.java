package Term_7;

import java.util.Scanner;

public class Ex7_18 {
	public static void aryRmv(int[] a,int idx){
		for(int i=idx;i<a.length-1;i++){
			a[i]=a[i+1];
		}
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner =new Scanner(System.in);

		System.out.print("�v�f��:");
		int a=scanner.nextInt();

		int []b=new int[a];

		for(int i=0;i<a;i++){
			System.out.print("a["+i+"]:");
			b[i]=scanner.nextInt();
		}

		System.out.print("�폜����v�f�̃C���f�b�N�X:");
		int c=scanner.nextInt();

		aryRmv(b,c);

		for(int i=0;i<a;i++){
			System.out.println("a["+i+"]:"+b[i]);
		}
		scanner.close();
	}

}
