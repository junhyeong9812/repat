package for_;

import java.util.Random;
import java.util.Scanner;

public class group6 {
public static void main(String[] args) {
	Random random = new Random();
	Scanner input = new Scanner(System.in);
//	문제 1번.
//
//	1. 사용자에게 구구단을 입력받는다. ex) 구구단을 입력하세요: 3
//	2. 만약에 3을 입력 받았으면 구구단을 1단부터 3단까지 출력한다.
//System.out.print("출력하실 단을 입력해주세요 :");
//int a =input.nextInt();
//for(int i=1;i<=a;i++) {
//	for(int j=1;j<10;j++) {
//		System.out.println(i+"x"+j+"="+i*j);
//	}
//	System.out.println();
//}
//	입력 예시: 3
//	출력 예시: 
//
//	1 * 1 = 1
//	1 * 2 = 2
//	.
//	.
//	.
//	2 * 1 = 2
//	2 * 2 = 4
//	.
//	.
//	.
//	3 * 1 = 3
//	3 * 2 = 6
//	.
//
//	.
//	3 * 9 = 27
//
//	문제 2번.
//
//	램덤한 0 ~ 9 까지의 수를 생성하여 5번의 기회 내에 랜덤 생성된 숫자를 맞추는 프로그램을 만드시오
//	1) 현재 남은 목숨 출력
//	2) 정답 시 맞춘 숫자, 추측 횟수 출력
//	3) 목숨이 다 닳는다면 정답을 출력
	int life =5;
	double ranDouble = Math.random();
	int ranInt = (int)(ranDouble*10);
	while(true) {
	System.out.println("램덤한 0 ~ 9 까지의 수를 생성하여 5번의 기회 내에 랜덤 생성된 숫자를 맞추는 프로그램");
	System.out.println("현재 목숨"+life);
	System.out.print("숫자를 맞추세요(1~9) :");
	int a = input.nextInt();
	if(ranInt==a) {
		System.out.println("★★★★★숫자를 맞추셨습니다★★★★★");
		System.out.println("맞춘 숫자 : "+a);
		System.out.println("추측 횟수 : "+(5-life));
		break;
	}else {
		life-=1;
		System.out.println("추측 실패, 목숨 -1");
	}
	System.out.println("");
	if(life==0) {
		System.out.println("목숨이 모두 닳았습니다.");
		System.out.println("정답은 "+ranInt+"입니다.");
		break;
	}
	
	}
//
//	- 랜덤 숫자 생성 코드 -
//	double ranDouble = Math.random();
//	int ranInt = (int)(ranDouble*10)
//
//	----------- 코드 진행 예시(오답) -----------
//	현재 목숨 : 5
//	숫자를 맞추세요(1~9) : 7
//
//	추측 실패, 목숨 -1
//	-----------------------------------------------
//
//	----------- 코드 진행 예시(정답) -----------
//	현재 목숨 : 4
//	숫자를 맞추세요(1~9) : 2
//
//	★★★★★숫자를 맞추셨습니다★★★★★
//	맞춘 숫자 : 2
//	추측 횟수 : 2
//	-----------------------------------------------
//
//	------ 코드 진행 예시(목숨이 없을때) -----
//	현재 목숨 : 1
//	숫자를 맞추세요(1~9) : 5
//
//	추측 실패, 목숨 -1
//
//	목숨이 모두 닳았습니다.
//	정답은 6입니다.
//	-----------------------------------------------
//
//	문제 3번.
//
//	[윷놀이 게임]
//	숫자 1을 입력하여 윷을 던진다.
//	하나의 윷으로 4번을 던져 나온 결과를
//	(*윷놀이의 규칙에 기반하여) 다음과 같이 출력한다.
//
//	*윷놀이의 규칙은 다음과 같다.
//	X X X O => '도'
//	X X O O => '개'
//	X O O O => '걸'
//	O O O O => '윷'
//	X X X X => '모'
	
//	다음과 같은 결과가 나오도록 프로그래밍을 작성하시오.
//	=====================================
//	윷 던지기- 모(X X X X)가 나올 때까지 계속됩니다. 
//	1. 윷 던지기 
//	2. 게임 종료하기
//	( 1 또는 2 입력)
//	X O X X => '도'
//	=====================================
//
//	[조건 1]
//	사용자로부터 숫자를 입력받고 
//	1 -> 윷 던지기 실행
//	2 -> 게임 종료 문구 출력
//	그 외 -> '잘못된 입력입니다. 다시 선택해주세요' 출력
//
//	[조건 2] 
//	하나의 윷을 총 4번에 걸쳐 던진다.
//	이 때, 윷의 결과를 0과 1로 나타내는데,
//	random.nextInt(2) 를 사용하여 0또는 1 중에 하나의 숫자를 랜덤으로 생성할 것이다.
//	랜덤 값이 0이면 "O",  1이면 "X"를 출력한다.
//
//	[조건3]
//	X의 개수에 따라 도 or 개 or 걸 or 윷 or 모 를 출력한다. (O의 개수를 기준으로 해도 됨)
//	(*X의 개수를 기준으로 - 도(3개) 개(2개) 걸(1개) 윷(0개) 모(4개))
//
//	[조건4]
//	윷 4개가 모두 앞면 - X X X X (모) 가 나오게 되면, 
//	     ['모'가 나왔습니다! 게임 종료!!!]
//	====================================
//	라는 결과를 출력한다.
//
//
//
//	================================================================================

//	while(true) {
//	System.out.println("윷 던지기- 모(X X X X)가 나올 때까지 계속됩니다. ");
//	System.out.println("1. 윷 던지기");
//	System.out.println("2. 게임 종료하기");
//	System.out.println("( 1 또는 2 입력)");
//	System.out.println("X O X X => '도'");
//	System.out.print("숫자를 입력해주세요:");
//	int a = input.nextInt();
//	if(a==1) {
//		int back=0;
//		for(int i=1;i<4;i++) {
//		int x=random.nextInt(2);
//		if (x==0) {
//			back++;
//		}
//		}
//		switch(back) {
//		case 1 : System.out.println("도");break;
//		case 2 : System.out.println("개");break;
//		case 3 : System.out.println("걸");break;
//		case 4 : System.out.println("윳");break;
//		case 0 : System.out.println("모");break;
//		}
//		if(back==0) {
//			System.out.println("모가 나왔습니다. 게임종료");
//			break;
//		}
//	}else if(a==2) break;
//	else {
//		System.out.println("잘못된 입력입니다.");
//		continue;
//	}
//	}
}
}
