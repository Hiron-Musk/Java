package test1;

public class Test09 {

	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=0;i<=9;i++) {
			if(i<5) {
				count++;
				
			}else {//count가 6

				count-=1;
				
			}
			
			for(int j=1;j<=5-count;j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=2*count-1;k++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	

	}

}
