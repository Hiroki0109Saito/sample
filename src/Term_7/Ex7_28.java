package Term_7;
import java.util.Scanner;


public class Ex7_28 {
	public static int[][] addMatrix(int[][] x,int[][] y){
		int [][]e=new int [x.length][y[0].length];
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<y[0].length;j++){
				e[i][j]=x[i][j]+y[i][j];
			}
		}
		return e;
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner (System.in);

		System.out.print("�s��̍s��:");
		int a=scanner.nextInt();
		System.out.print("�s��̗�:");
		int b=scanner.nextInt();

		int [][]c=new int[a][b];
		int [][]d=new int[a][b];
		int [][]f=new int[a][b];


		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print("a["+i+"]["+j+"]:");
				c[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print("b["+i+"]["+j+"]:");
				d[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("\n"+"�s��a");
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n"+"�s��b");
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
		f=addMatrix(c,d);
		
		System.out.println("\n"+"�s��c");
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(f[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
