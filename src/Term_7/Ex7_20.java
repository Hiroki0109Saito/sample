package Term_7;

import java.util.Scanner;

public class Ex7_20 {
	public static void aryIns(int []a,int idx,int x){
		int count=0;
		for(int i=a.length-1;i>idx;i--){
			a[i]=a[i-1];
			count++;
		}
		a[count-1]=x;
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("�v�f��:");
		int a=scanner.nextInt();

		int []b=new int [a];

		for(int i=0;i<a;i++){
			System.out.print("a["+i+"]:");
			b[i]=scanner.nextInt();
		}
		System.out.print("�}������v�f�̃C���f�b�N�X:");
		int c=scanner.nextInt();
		System.out.print("�}������l:");
		int d=scanner.nextInt();

		aryIns(b,c,d);

		for(int i=0;i<a;i++){
			System.out.println("a["+i+"]:"+b[i]);
		}
		scanner.close();
	}

}
