package test1;

public class Ex {

	public static void main(String[] args) {
		
		for(int i=0;i<3;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print("-");
			} //j 5
			for(int j=0;j<3;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
