package Term_7;

import java.util.Random;
import java.util.Scanner;

public class Ex7_8 {

	public static int random(int a,int b){
		Random rand=new Random();
		int r=0;

		if(a<b){
			r=rand.nextInt(b-a+1)+a;
		}else{
			r=a;
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		Scanner scanner=new Scanner(System.in);

		System.out.println("�����𐶐����܂��B");
		System.out.print("�����l:");
		int x=scanner.nextInt();
		System.out.print("����l:");
		int y=scanner.nextInt();

		if(y>x){
			System.out.println("��������������"+random(x,y)+"�ł��B");
		}else{
			System.out.println(random(x,y)+"���ԋp����܂����B");
		}

		scanner.close();

	}

}
