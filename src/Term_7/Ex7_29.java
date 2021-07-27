package Term_7;
import java.util.Scanner;


public class Ex7_29 {
	public static int[][] aryClone2(int [][]a){

		int [][]w=new int [a.length][a[0].length];

		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				w[i][j]=a[i][j];
			}
		}
		return w;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner (System.in);

		System.out.print("行列の行数:");
		int a=scanner.nextInt();
		System.out.print("行列の列数:");
		int b=scanner.nextInt();

		int [][]c=new int[a][b];
		int [][]d=new int[a][b];

		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print("a["+i+"]["+j+"]:");
				c[i][j]=scanner.nextInt();
			}
		}

		System.out.println("行列a");
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


		d=aryClone2(c);

		System.out.println("行列aの複製");
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();

	}

}
