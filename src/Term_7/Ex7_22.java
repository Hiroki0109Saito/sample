package Term_7;

import java.util.Scanner;

public class Ex7_22 {
//	private int []w=new int[0];

	public static int[] arrayClone(int[] a){
		int []b=new int[a.length];

		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("�v�f��:");
		int a=scanner.nextInt();

		int []c=new int[a];

		for(int i=0;i<a;i++){
			System.out.print("x["+i+"]:");
			c[i]=scanner.nextInt();
		}

		System.out.println("�z��x�̕���y�����܂����B");

		int []d=new int[0];
		d=arrayClone(c);

		for(int i=0;i<a;i++){
			System.out.println("y["+i+"]:"+d[i]);
		}
		scanner.close();
	}

}
