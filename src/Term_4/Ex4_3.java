package Term_4;

import java.util.Random;
import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();
		
		System.out.println("�����ăQ�[���J�n!!"+"\n"+"10~99�̐��𓖂ĂĂ��������B");
		int a=rand.nextInt(90)+10;
		int b=0;

		while(a!=b){
			System.out.print("��������:");
			b=scanner.nextInt();
			if(a>b){
				System.out.println("�����Ƒ傫�Ȑ�����B");
			}else if(a<b){
				System.out.println("�����Ə����Ȑ�����B");
			}
		}
		System.out.println("�����ł��B");
		scanner.close();
	
	}

}
