package Term_6;

import java.util.Scanner;

public class Ex6_19 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		int [][]a=new int [6][2];

		System.out.println("6�l�̍���E���w�̓_������͂���B");

		for(int i=0;i<6;i++){
			System.out.print((i+1)+"�� ���� ");
			a[i][0]=scanner.nextInt();
			System.out.print("    ���w ");
			a[i][1]=scanner.nextInt();
		}

		int suma=0;
		int sumb=0;

		for(int i=0;i<6;i++){
			suma+=a[i][0];
			sumb+=a[i][1];
		}

		System.out.println("No.  ����  ���w  ����");
		for(int i=0;i<6;i++){
		System.out.println((i+1)+"��   "+a[i][0]+"    "+a[i][1]+"   "+((double)(a[i][0]+a[i][1]))/2);
		}
		System.out.println("���� "+((double)suma)/6+"  "+((double)sumb)/6);

		scanner.close();
	}

}
