package Term_7;

import java.util.Scanner;

public class Ex7_16 {

	public static int minOf(int[] a){
		int min=a[0];

		for(int i=1;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		return  min;
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		Scanner scanner =new Scanner(System.in);

		System.out.print("�l����:");
		int a=scanner.nextInt();
		System.out.println(a+"�l�̐g���Ƒ̏d����͂���B");

		int []b=new int[a];
		int []c=new int[a];

		for(int i=0;i<a;i++){
			System.out.print((i+1)+"�Ԗڂ̐g��:");
			b[i]=scanner.nextInt();
			System.out.print((i+1)+"�Ԗڂ̑̏d:");
			c[i]=scanner.nextInt();
		}

		System.out.println("�ł��w���Ⴂ�l�̐g��:"+minOf(b)+"cm");
		System.out.println("�ł������Ă���l�̑̏d:"+minOf(c)+"kg");

		scanner.close();
	}

}
