package Term_6;

import java.util.Scanner;

public class Ex6_7 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.print("�l��:");
		int a=scanner.nextInt();

		System.out.println("�_������͂���B");

		int[] ten=new int[a];
		int sum=0;

		for(int i=0;i<a;i++){
			System.out.print((i+1)+"�Ԗڂ̓_��:");
			ten[i]=scanner.nextInt();
			sum+=ten[i];
		}

		double ave=(double)sum/a;

		int max=ten[0];
		int min=ten[0];

		for(int j=0;j<a;j++){
			if(max<ten[j]){
				max=ten[j];
			}else if(min>ten[j]){
				min=ten[j];
			}else{
			}
		}

		System.out.println("���v�_��"+sum+"�_�ł��B");
		System.out.println("���ϓ_��"+ave+"�_�ł��B");
		System.out.println("�ō��_��"+max+"�_�ł��B");
		System.out.println("�Œ�_��"+min+"�_�ł��B");
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		scanner.close();

	}

}
