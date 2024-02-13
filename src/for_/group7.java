package for_;

public class group7 {
public static void main(String[] args) {
//	1번 문제
//
//	1부터 100까지의 짝수 합을 구하시오 [변수명 Psum]
//	1부터 100까지의 홀수 합을 구하시오 [변수명 Hsum]

//	int Psum=0,Hsum=0;
//	for(int i=0;i<=100;i++) {
//		if(i%2==0) {
//			Psum+=i;
//		}else Hsum+=i;
//	}
//	

//2번 문제
//
//구구단을 작성하세요
//

	
//	for(int i=1;i<=9;i++) {
//		for(int j=1;j<=9;j++) {
//			System.out.println(i+"x"+j+"="+i*j);
//		}
//		System.out.println();
//	}
	
//	3번 문제
//	[보기의] 별 트리를 만드세요
//
//		[보기]	      *     중첩 for문을 사용하여 완성하시오
//			     ***
//			    *****
//			   *******
//			  *********  

	int a=1;
	for(int i=0;i<4;i++) {
		for(int j=0;j<4-i;j++) {
			System.out.print(" ");
		}
		
			for(int x=1;x<=a;x++) {
			System.out.print
			("*");
			}	System.out.println();
			a+=2;
		
	}
	
	
}
}
