package X;

import java.util.Scanner;

public class X_4 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner =new Scanner(System.in);

		System.out.print("�j��:");
		int a=scanner.nextInt();
		System.out.print("����:");
		int b=scanner.nextInt();

		int c=0;

		if(a==0){//���j����c=0
		}else if(a==1){//���j����c=1
			c=1;
		}else if(a==2||a==5){//�Ηj�A���j�͓���
			if(b==0){
			}else{
				c=1;
			}
		}else if(a==3){//���j��
			if(b==2){
			}else{
				c=1;
			}
		}else if(a==4){//�ؗj��
			c=1;
		}else{//�y�j��
			if(b==0){
				c=1;
			}else{
			}
		}

		if(c==0){
			System.out.println("�x�f�ł��B");
		}else{
			System.out.println("�f�@���Ă��܂��B");
		}
		scanner.close();
	}
}

