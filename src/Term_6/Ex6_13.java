package Term_6;

//import java.util.Random;
import java.util.Scanner;

public class Ex6_13 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);
		//		Random rand=new Random();

		System.out.print("�v�f��:");
		int a=scanner.nextInt();
		int []num=new int[a];
		int i=0;
		//		int []h=new int[a];

		while(i<a){
			System.out.print("a["+i+"]=");
			num[i]=scanner.nextInt();
			i++;
		}

		for(i=0;i<num.length;i++){
			int r=(int)(Math.random()*(i+1));
			int temp=num[i];
			num[i]=num[r];
			num[r]=temp;
		}

		System.out.println("�v�f���V���b�t�����܂����B");
		for(i=0;i<a;i++){
			System.out.println("a["+i+"]="+num[i]);
		}

		scanner.close();
	}
}

//		i=0;
//		int b=0;
//
//		while(i<a){
//			b=rand.nextInt(a);
//			System.out.println(a);
//			h[i]=num[b];
//
//			System.out.println("h["+i+"]="+h[i]);
//
//			for(int j=0;j<a;j++){
//				if(i>=0){
//					if(h[i]==num[b]){
//						i--;
//					}
//				}else{
//					break;
//				}
//
//			}
//			i++;
//		}