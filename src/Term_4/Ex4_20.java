package Term_4;

import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);
		System.out.println("�G�߂����߂܂��B");
		int x=1;
		int a=0;

		do{
			do{
				System.out.print("�����ł���:");
				a=scanner.nextInt();
			}while(a<1||12<a);

			if(2<a&&a<6){
				System.out.println("����͏t�ł��B");
			}else if(5<a&&a<9){
				System.out.println("����͉Ăł��B");
			}else if(8<a&&a<12){
				System.out.println("����͏H�ł��B");
			}else{
				System.out.println("����͓~�ł��B");
			}

			System.out.print("������x? 1�cYes/0�cNo");
			x=scanner.nextInt();
		}while(x==1);
		scanner.close();
	}
}