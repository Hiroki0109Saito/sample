package Term_6;
import java.util.Scanner;


public class Ex6_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("要素数:");
		int x=scanner.nextInt();
		
		int a[] =new int[x];
		
		for(int i=0;i<x;i++){
			System.out.print("a["+i+"]=");
			a[i]=scanner.nextInt();
		}
		
		System.out.print("探す値:");
		int q=scanner.nextInt();
		
		int []o=new int [x];
		int count=0;
		int r=0;
		int t=0;
		int s=x;
		
		
		for(int y=0;y<x;y++){
			if(q==a[y]){
				o[y]=a[y];
				r=y;
				count++;
			}
		}
		
		if(count==0){
			System.out.println("見つからなかったよ！！");
		}else if(count==1){
			System.out.println("それはa["+r+"]にあります。");
		}else{
			while(t<x){
				if(o[t]==q){
					System.out.println("先端はa["+t+"]にあるよ！！");
					break;
				}
				t++;
			}
			
			while(0<s){
				if(o[s-1]==q){
					System.out.println("末尾はa["+(s-1)+"]にあるよ！！");
					break;
				}
				s--;
			}
			
		}
		scanner.close();

	}

}
