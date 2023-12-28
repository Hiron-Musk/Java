package sub1;

/*날짜 : 2023/12/28
* 이름 : 남가희
* 내용 : 배열 실습하기
*/

public class ArrayTest {

	public static void main(String[] args) {
		
		//배열
		int[] arr1= {1,2,3,4,5,6};
		char[] arr2= {'A','B','C'};
		String[] arr3= {"서울","대전","대구","부산","광주"};
		
		//원소 출력
		System.out.println("arr1[0]: "+arr1[0]);
		System.out.println("arr1[2]: "+arr1[2]);
		System.out.println("arr1[3]: "+arr1[3]);

		System.out.println("arr2[2]: "+arr2[2]);
		System.out.println("arr3[3]: "+arr3[3]);
		
		//배열 길이
		System.out.println("arr1의 원소 갯수: "+arr1.length);
		System.out.println("arr2의 원소 갯수: "+arr2.length);
		System.out.println("arr3의 원소 갯수: "+arr3.length);
		
		//배열 반복문
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		//배열 전용 반복문
		for(int n:arr1) {
			System.out.print(n+" ");
			
		}
		System.out.println();
		
		for(char i:arr2) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		for(String j:arr3) {
			System.out.print(j+" ");
			
		}
		System.out.println();
		
		//1차원
		int[] scores= {80, 60, 78, 62, 92};
		int total=0;
		
		for(int s:scores) {
			total+=s;
			
		}
		System.out.println("scores의 전체 합: "+total);
		
		
		//2차원
		int [][] arr2d= {{1,2,3,4},
						 {5,6,7,8},
						 {9,10,11,12}};
		
		System.out.println(arr2d[0][2]);
		System.out.println(arr2d[1][0]);
		System.out.println(arr2d[2][2]);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.println("arr2d["+i+"]["+j+"]: "+arr2d[i][j]);
			}
		}
		
		//3차원
		
		int[][][] arr3d= {{{1,2,3,},
						   {4,5,6},
						   {7,8,9}},
						  {{10,11,12},
						   {13,14,15},
						   {16,17,18}},
						  {{19,20,21},
						   {22,23,24},
						   {25,26,27}}};
		
		System.out.println(arr3d[0][1][1]);
		System.out.println(arr3d[1][2][1]);
		System.out.println(arr3d[2][2][0]);
		
		//3중반복문(잘 사용안함)
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n",i,j,k,arr3d[i][j][k]);
			}
		}
		
		
	
	
	}

}
}
