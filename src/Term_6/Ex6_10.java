package Term_6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_10 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		System.out.print("�v�f��:");
		int a=scanner.nextInt();

		int []num=new int[a];

		for(int i=0;i<a;i++){
		num[i]=rand.nextInt(10)+1;
		}

		for(int i=0;i<a;i++){
			System.out.println("a["+i+"]="+num[i]);
			}

		scanner.close();

	}

}
