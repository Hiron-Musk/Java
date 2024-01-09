package step4;

import java.util.Scanner;

public class Main4_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] number=new int[n];
		
		for(int i=0;i<n;i++) {
			number[i]=sc.nextInt();
		}
		int max=number[0];
		int min=number[0];
		
		for(int i=1;i<number.length;i++) {
			if(number[i]<min) {
				min=number[i];
			}
			if(number[i]>max) {
				max=number[i];
			}
			
		}
		
		System.out.printf("%d %d",min,max);
		
	
		
	}
}
	

