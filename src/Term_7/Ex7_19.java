package Term_7;

import java.util.Scanner;

public class Ex7_19 {
	public static void aryRmvN(int []a,int idx,int n){
		//		for(int i=a.length-1;i>a.length-idx;i--){
		//			a[i-n]=a[i];
		//		}

		for(int i=idx;i+n<a.length;i++){//��ԍŌ�̔z��ɓ͂�����I��
			a[i]=a[i+n];
		}
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

		aryRmvN(b,c,d);

		for(int i=0;i<a;i++){
			System.out.println("a["+i+"]="+b[i]);
		}
		scanner.close();
	}

}
