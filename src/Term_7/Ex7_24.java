package Term_7;

import java.util.Scanner;

public class Ex7_24 {

	public static int[] arrayRmvOf(int[] a,int idx){

		int []r=new int[a.length-1];

		for(int i=0;i<a.length-1;i++){
			if(i<idx){
				r[i]=a[i];
			}else{
				r[i]=a[i+1];
			}
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner =new Scanner(System.in);

		System.out.print("�v�f��:");
		int a=scanner.nextInt();

		int []b=new int[a];
		int []d=new int[a-1];

		for(int i=0;i<a;i++){
			System.out.print("a["+i+"]:");
			b[i]=scanner.nextInt();
		}

		System.out.print("�폜����v�f�̃C���f�b�N�X:");
		int c=scanner.nextInt();

		d=arrayRmvOf(b,c);

		for(int i=0;i<d.length;i++){
			System.out.println("a["+i+"]:"+d[i]);
		}
		scanner.close();

	}

}
