package Term_6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_4 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		//		int a=rand.nextInt(9)+1;

		System.out.print("�v�f��:");
		int a=scanner.nextInt();

		int []b=new int [a];

		for(int i=0;i<a;i++){
			b[i]=rand.nextInt(9)+1;
		}

		for(int i=0;i<10;i++){
			for(int j=0;j<a;j++){
				int count=i;
				if(b[j]>9-count){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				count++;
			}
			System.out.println();
		}
		for(int k=0;k<a;k++){
			System.out.print(k%10);
		}
		scanner.close();
	}
}

//		for(int j=0;j<a;j++){
//			for(int i=a;i>0;i--){
//				int d=0;
//				if(b[d]==i){
//					System.out.print("*");
//					d++;
//				}else{
//					System.out.print(" ");
//					d++;
//				}
//			}
//			System.out.println();
//		}