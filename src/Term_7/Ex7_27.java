package Term_7;

public class Ex7_27 {
	public static boolean addMatrix(int [][]x,int [][]y,int [][]z){
		boolean d=false;
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		d=true;
		return d;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [][]a={{1,2,3},{4,5,6}};
		int [][]b={{6,3,4},{5,1,2}};
		int [][]c=new int[2][3];

		System.out.println("行列a");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("行列b");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		addMatrix(a,b,c);

		System.out.println("行列c");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
