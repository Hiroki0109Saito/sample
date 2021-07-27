package Y;

public class Y_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count=0;

		for(int a=0;a<6;a++){
			for(int b=0;b<6;b++){
				if(a!=b){
					for(int c=0;c<6;c++){
						if(a!=c && b!=c){
							for(int d=0;d<6;d++){
								if(a!=d && b!=d && c!=d){
									for(int e=0;e<6;e++){
										if(a!=e && b!=e && c!=e && d!=e){
											for(int f=0;f<6;f++){
												if(a!=f && b!=f && c!=f && d!=f && e!=f){
													System.out.println(a+""+b+""+c+""+d+""+e+""+f);
//													System.out.printf("%d%d%d%d%d%d%n",a,b,c,d,e,f);
													count++;
												}}}}}}}}}}}

		System.out.println(count);
	}
}

		//		for(int i=0;i<=5;i++){
		//			System.out.print(i);
		//			for(int j=0;j<=5;j++){
		//				while(i==j){
		//					j++;
		//				}
		//				System.out.print(j);
		//				for(int k=0;k<=5;k++){
		//					while(i==k||j==k){
		//						k++;
		//					}
		//					System.out.print(k);
		//					for(int l=0;l<=5;l++){
		//						while(i==l||j==l||k==l){
		//							l++;
		//					}
		//						System.out.print(l);
		//						for(int m=0;m<=5;m++){
		//							while(i==m||j==m||k==m||l==m){
		//								m++;
		//							}
		//							System.out.print(m);
		//							for(int n=0;n<=5;n++){
		//								while(i==n||j==n||k==n||l==n||m==n){
		//									n++;
		//								}
		//								System.out.print(n);
		//							}
		//						}
		//					}
		//				}
		//			}
		//		}
