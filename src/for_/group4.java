package for_;

import java.util.Scanner;

public class group4 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

//	문제1. 입력받은 수만큼 덧셈, 뺄셈, 곱셈, 나눗셈을 순서대로 실행하는 코드 작성
//	1. 연산을 실행할 횟수 입력, 2. 연산을 실행할 두 개의 숫자 입력
//	단, 나눗셈 연산 시 첫번째 입력한 수가 두번째 입력한 수보다 작을 시 다시 입력받게 하시오. 
//	System.out.print("횟수 입력 :");
//	int run= input.nextInt();
//	
//	for(int i=1;i<=run;i++) {
//		System.out.print("두개의 숫자 입력 :");
//		int num1= input.nextInt();
//		int num2= input.nextInt();
//		switch (i%4) {
//		case 1 :{
//			System.out.println((i)+"덧셈 실행 결과: "+(num1+num2));
//			break;
//		}
//		case 2 :{
//			System.out.println((i)+"뺼셈 실행 결과: "+(num1-num2));
//			break;
//		}
//		case 3 :{
//			System.out.println((i)+"곱셈 실행 결과: "+(num1*num2));
//			break;
//		}
//		case 0 :{
//			if(num2>num1) {
//			System.out.println("첫 번째 수가 두번째 수보다 크도록 입력하세요.");
//			System.out.println("두 개의 숫자 재입력 :");
//			num1= input.nextInt();
//			num2= input.nextInt();
//			}
//			System.out.println((i)+"나눗셈 실행 결과: "+(num1/num2));
//			break;
//		}
//			
//		}
//	}
//	
//// 출력 예시 ) 횟수 입력 : 6
////			두 개의 숫자 입력 : 1 2
////			1. 덧셈 실행 결과 : 3
////			------------------------
////			두 개의 숫자 입력 : 1 2
////			2. 뺄셈 실행 결과 : -1
////			------------------------
////			두 개의 숫자 입력 : 1 2
////			3. 곱셈 실행 결과 : 2
////			------------------------
////			두 개의 숫자 입력 : 1 2
////			첫 번째 수가 두번째 수보다 크도록 입력하세요.
////			두 개의 숫자 재입력 : 2 1
////			4. 나눗셈 실행 결과 : 2
////			------------------------
////			두 개의 숫자 입력 : 1 2
////			5. 덧셈 실행 결과 : 3
////			------------------------
////			두 개의 숫자 입력 : 1 2
////			6. 뺄셈 실행 결과 : -1
//		
//
//문제2. 사각형 만들기
//	가로 세로 길이를 입력받아 사각형을 만드시오 ( * = 1 )
//	가로또는 세로길이를 1이하로 작성시 다시 길이를 입력하도록 작성
//	* continue = 아래를 실행하지않고 해당 반복문으로 다시 넘어감.
//	while(true) {
//	System.out.print("가로 길이 입력 :");
//	int num1= input.nextInt();
//	System.out.print("세로 길이 입력 :");
//	int num2= input.nextInt();
//	int i=1;
//	
//	if(num1>2&&num2>2) {
//	for(;i<=num2;i++) {
//		if(i==1){
//			for(int j=1;j<=num1;j++) {
//				System.out.print("*");
//			}
//		}else if(i==num2){
//			for(int j=1;j<=num1;j++) {
//				System.out.print("*");
//			}
//		}else {
//			for(int j=1;j<=num1;j++) {
//				if(j==1) {
//				System.out.print("*");
//				}else if(j==num1) {
//				System.out.print("*");	
//				}else {
//					System.out.print(" ");
//				}
//			}
//			
//		}
//		System.out.println();
//	}
//	break;
//	}else System.out.println("가로, 세로 2이상 입력해주세요");
//	}
//ex) 
//가로 세로 길이 입력 : 1 1
//가로, 세로 2이상 입력해주세요
//가로 세로 길이 입력 : 1 2
//가로, 세로 2이상 입력해주세요
//가로 세로 길이 입력 : 6 6
//******
//*    *
//*    *
//*    *
//*    *
//******
//
//
//문제3. 두 수를 입력하여 입력한 작은 수 부터 큰 수까지 1씩 늘어나게 만드시오
//ex ) 1,5 입력
//1
//2
//3
//4
//5
//   
//}
	System.out.print("첫번쨰 수를 입력 :");
	int num1= input.nextInt();
	System.out.print("두번쨰 수를 입력 :");
	int num2= input.nextInt();
	if(num1>0&&num2>0) {
	if(num2>num1) {
	for(int i=num1;i<=num2;i++) {
		System.out.println(i);
	}
	}else if (num1>num2) {
		for(int i=num2;i<=num1;i++) {
			System.out.println(i);
		}	
	}else System.out.println("두 수는 같습니다.");
	}else {
		System.out.println("양의 정수를 입력해주세요.");
	}
}
}
