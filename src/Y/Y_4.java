package Y;

import java.util.Random;
import java.util.Scanner;

public class Y_4 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		int same=0;
		int win=0;
		int lose=0;

		while(true){
			System.out.print("����[�񂯁[��ۂ���!!!!!!(G or T or P)");
			String str=scanner.next();

			int a=rand.nextInt(3);

			switch(a){
			case 0:	//G
				if(str.equals("G")){
					System.out.println("�������I");
					same++;
				}else if(str.equals("T")){
					System.out.println("�����I");
					win++;
				}else{
					System.out.println("�܂��ł�");
					lose++;
				}
				break;
			case 1: //T
				if(str.equals("G")){
					System.out.println("�܂��ł�");
					lose++;
				}else if(str.equals("T")){
					System.out.println("�������I");
					same++;
				}else{
					System.out.println("�����I");
					win++;
				}
				break;
			case 2: //P
				if(str.equals("G")){
					System.out.println("�����I");
					win++;
				}else if(str.equals("T")){
					System.out.println("�܂��ł�");
					lose++;
				}else{
					System.out.println("�������I");
					same++;
				}
				break;
			}

			System.out.print("������x���񂲁H(��邨�c0/���Ȃ��c1)");
			int b=scanner.nextInt();

			if(b==1){
			break;
			}
		}

		System.out.println("��:"+win);
		System.out.println("��:"+lose);
		System.out.println("������:"+same);

		scanner.close();
	}

}
