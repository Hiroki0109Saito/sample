package Term_7;

import java.util.Scanner;

public class Ex7_26 {

	public static int[] arrayInsOf(int []a,int idx,int n){

		int []b=new int[a.length+1];

		for(int i=0;i<a.length;i++){
			b[idx]=n;
			
			if(i<idx){
				b[i]=a[i];
			}else if(i>idx){
				b[i+1]=a[i];
			}
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner =new Scanner(System.in);

		System.out.print("�v�f��:");
		int a=scanner.nextInt();

		int []b=new int[a];

		for(int i=0;i<a;i++){
			System.out.print("a["+i+"]=");
			b[i]=scanner.nextInt();
		}

		System.out.print("�폜����v�f�̃C���f�b�N�X:");
		int c=scanner.nextInt();
		System.out.print("�폜����v�f�̌�:");
		int d=scanner.nextInt();

		int []e=new int[a+1];

		e=arrayInsOf(b,c,d);

		for(int i=0;i<e.length;i++){
			System.out.println("a["+i+"]="+e[i]);
		}
		scanner.close();

	}

}
