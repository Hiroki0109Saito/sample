package Term_6;

import java.util.Scanner;

public class Ex6_20 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.println("�ʉ��ȂQ�����z������܂��B");
		System.out.print("�s��:");
		int a=scanner.nextInt();

		int []retu=new int[a];

		for(int i=0;i<a;i++){
			System.out.print((i+1)+"�s�ڂ̗�:");
			retu[i]=scanner.nextInt();
		}

		int [][]c=new int [a][100];

		System.out.println("�e�v�f�̒l����͂���B");

		for(int i=0;i<a;i++){
			for(int j=0;j<retu[i];j++){
				System.out.print("c["+i+"]["+j+"]:");
				c[i][j]=scanner.nextInt();
			}
		}

		System.out.println("�z��c�̊e�v�f�̒l�͎��̂悤�ɂȂ��Ă��܂��B");

		for(int i=0;i<a;i++){
			for(int j=0;j<retu[i];j++){
				System.out.print(c[i][j]);
			}
			System.out.println();
		}

		scanner.close();
	}
}
