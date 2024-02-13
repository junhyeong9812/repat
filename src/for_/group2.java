package for_;

import java.util.Scanner;

public class group2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		문제1번) 
//	점수를 입력받아 80점 이상이면 합격메세지를 그렇지 않으면 
//	불합격 메세지를 출력하는 작업을 반복하다가
//	0에서 100점 이외의 점수가 입력되면 종료하는 프로그램
//		while(true) {
//		System.out.println("점수를 입력하시오");
//		int score = input.nextInt();
//		if(score<=100||score<0) {
//		if(score>=80) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
//		}else break;
//		}
		
		
		
//	문제 2번)
//	숫자를 입력받아서 그 값이 짝수면 덧셈을, 홀수면 뺄셈을 진행하는 프로그램을 만듭니다.
//
//	입력받는 숫자는 1~20사이의 값이고 100이되면 종료됩니다.
//	더해지거나 뺀 값은 0미만, 100초과가 될 수 없습니다.
//int sum=0;
//		int sum=0;
	//	while(true) {
	//		System.out.println("입력하세요:");
//			int num =input.nextInt();
//			
//			if(num>=1&&num<=20) {
	//			
	//				if(num%2==0) {
		//				sum+=num;
		//				System.out.println(sum);
		//				if(sum>100) {
		//					System.out.println("100을 초과할 수 없습니다.");
		//					sum -=num;
			//				
			//		}
			//		}
			//		else {
				//		sum-=num;
			//			if(sum<0) {
			//				System.out.println("0보다 작을 수 없습니다.");
			//				sum+=num;
			//		
			//			}
			//		}
			//	}else System.out.println("1~20사이의 수를 입력해주세요.");
	//		if(sum==100) break;
//		}
			
		
//	출력 예시 :
//	----------------------------
//	현재 숫자는 0 입니다.
//	숫자를 입력하세요 : 20
//
//	숫자를 더합니다.
//
//	현재 숫자는 20 입니다.
//	숫자를 입력하세요 : 19
//
//	숫자를 뺍니다.
//
//	현재 숫자는 1 입니다.
//	숫자를 입력하세요 : 3
//
//	합계는 0이하로 내려갈 수 없습니다. 다시 입력해주세요
//
//	현재 숫자는 1 입니다.
//	숫자를 입력하세요 : 
//	---------------------------

//	문제3번)
//	아래와 같은 모양을 만드세요
//
//	*****
//	****
//	***
//	**
//	*
//	========
//		for(int i=0;i<5;i++) {
	//		for (int j=0;j<6-i-1;j++) {
		//		System.out.print("*");
			//}
			//System.out.println();
		//}


//	문제4번
//
//
//	int형 양수 범위 숫자를 입력하였을 경우 각 자릿수의 합을 구하세요.
//
//	반복해서 동작하다 입력값에 0이 들어가면 프로그램이 종료됩니다.
//
//	입력           출력
//
//	11               2 
//	111              3
//	1111            4
//	11111           5
//	895              22
//	222222222     18
System.out.println("숫자를 입력해주세요 :");
int num =input.nextInt();
int dec=0,sum=0;
while(true) {
	
	if(num>0) {
		
		sum+=num%10;
		num=num/10;
		
	}
	else if(num==0)break;
	
}
System.out.println(sum);
	}}
