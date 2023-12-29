package test1;

public class Test08 {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=0;i<n;i++) {//i=0
			
			for(int j=n-1;j>i;j--) {//4번 반복
				System.out.print(" ");
			}
			for(int j=0;j<=i*2;j++) {//1번반복
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
