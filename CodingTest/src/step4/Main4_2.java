package step4;

import java.util.Scanner;

public class Main4_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] number=new int[n];
		int x=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			number[i]=sc.nextInt();
			if(number[i]<x) {
				System.out.print(number[i]+" ");
			}
		}
		
		
	}

}
