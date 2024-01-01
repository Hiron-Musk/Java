package step3;

import java.util.Scanner;

public class Main3_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=n;i<=n;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}

	}

}
