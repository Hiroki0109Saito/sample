package Term_7;

import java.util.Scanner;

public class Ex7_23 {
	public static int[] arraySrchidx(int[] a,int x){
		int j=0;
		int u=0;
		
		for(int i=0;i<a.length;i++){
			if(a[i]==x){
				j++;
			}
		}
		
		int []b=new int [j];
		
		for(int i=0;i<a.length;i++){
			if(a[i]==x){
				b[u]=i;
				u++;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("�v�f��:");
		int c=scanner.nextInt();
		
		int []d=new int [c];
		
		for(int i=0;i<c;i++){
			System.out.print("x["+i+"]:");
			d[i]=scanner.nextInt();
		}
		
		System.out.print("�T������l:");
		int e=scanner.nextInt();
		
		int []f=new int[0];
		
		f=arraySrchidx(d,e);
		
		System.out.println("��v����v�f�̃C���f�b�N�X");
		
		for(int i=0;i<f.length;i++){
			System.out.println(f[i]);
		}
		scanner.close();
	}

}
