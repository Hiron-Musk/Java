package step4;

import java.util.Scanner;

public class Main4_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] number= new int[n];
		
		int count=0;
		
		for(int i=0;i<n;i++) {
			number[i]=sc.nextInt();
			}
		
		int target=sc.nextInt();
		for(int i=0;i<n;i++) {
		if(number[i]==target) {
				count++;
				}
		}
		
		System.out.println(count);
		
		
	}

}
