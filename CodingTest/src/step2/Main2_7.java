package step2;

import java.util.Scanner;

public class Main2_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		int coin=0;
		
		//같은눈 3개
		if((n1==n2)&&(n1==n3)&&(n2==n3)) {
			coin=10000+(n1*1000);
		}else if((n1!=n2)&&(n1!=n3)&&(n2!=n3)) {
			if((n1>n2)&&(n1>n3)) {
				coin=n1*100;
			}else if((n2>n1)&&(n2>n3)) {
				coin=n2*100;
			}else {
				coin=n3*100;
			}
		} else if(n1==n2) {
			 coin=1000+n1*100;
		 } else if(n1==n3) {
			 coin=1000+n1*100;
		 } else{
			 coin=1000+n2*100;
		 }
		
		System.out.println(coin);
		 
		 
		 
	}

}
