package Term_7;

import java.util.Random;
import java.util.Scanner;

public class Ex7_10 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		Random rand=new Random();
		Scanner scanner=new Scanner(System.in);

		System.out.println("�ÎZ�̓g���[�j���O");

		int a=rand.nextInt(4);
		int x=rand.nextInt(1000);
		int y=rand.nextInt(1000);
		int z=rand.nextInt(1000);

		int p=1;
		int num=0;
		int n=0;

		while(p==1){
			while(true){
				switch(a){
				case 0:
					num=x+y+z;
					System.out.print(x+"+"+y+"+"+z+"=");
					n=scanner.nextInt();
					break;
				case 1:
					num=x+y-z;
					System.out.print(x+"+"+y+"-"+z+"=");
					n=scanner.nextInt();
					break;
				case 2:
					num=x-y+z;
					System.out.print(x+"-"+y+"+"+z+"=");
					n=scanner.nextInt();
					break;
				case 3:
					num=x-y-z;
					System.out.print(x+"-"+y+"-"+z+"=");
					n=scanner.nextInt();
					break;
				}
				if(num==n){
					break;
				}
				System.out.println("�Ⴂ�܂���!!!!!!!");
			}

			System.out.print("������x?(Yes�c1/No�c0):");
			p=scanner.nextInt();

		}
		scanner.close();
	}
}
