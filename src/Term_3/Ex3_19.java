package Term_3;

import java.util.Scanner;

public class Ex3_19 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		Scanner scanner=new Scanner(System.in);

		int []ten=new int[3];

		System.out.print("����a:");
		ten[0]=scanner.nextInt();
		System.out.print("����b:");
		ten[1]=scanner.nextInt();
		System.out.print("����c:");
		ten[2]=scanner.nextInt();

		int t=0;

		for(int i=0;i<3;i++){
			for(int j=i+1;j<3;j++){
				if(ten[i]>ten[j]){
					t=ten[i];
					ten[i]=ten[j];
					ten[j]=t;
				}
			}

		}

		System.out.println("\n"+"a��b��c�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("����a:"+ten[0]+"�ł��B");
		System.out.println("����b:"+ten[1]+"�ł��B");
		System.out.println("����c:"+ten[2]+"�ł��B");

		scanner.close();
	}

}
