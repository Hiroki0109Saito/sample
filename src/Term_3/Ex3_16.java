package Term_3;

import java.util.Scanner;

public class Ex3_16 {

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

		int max=ten[0];
		int min=ten[0];

		for(int j=0;j<3;j++){
			if(max<ten[j]){
				max=ten[j];
			}else if(min>ten[j]){
				min=ten[j];
			}else{
			}
		}

		//Arrays.sort(a);

		int x=0;

		if(ten[0]==min){
			if(ten[1]==max){
				x=ten[2];
			}else{
				x=ten[1];
			}
		}else if(ten[1]==min){
			if(ten[0]==max){
				x=ten[2];
			}else{
				x=ten[0];
			}
		}else{
			if(ten[0]==max){
				x=ten[1];
			}else{
				x=ten[0];
			}
		}



		System.out.println("�����l��"+x+"�ł��B");

		scanner.close();
			}
		}




