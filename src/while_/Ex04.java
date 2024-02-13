package while_;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int i,sum =0;
	while(true) {
		System.out.println("1-10사이의 수 입력");
		i=input.nextInt();
		if(i>0&&i<=10) {
			break;
			//&&연산자는 앞 뒤 모든 연산이 만족해야 참이 된다.
		}else if(i<=0 || i>10) {
			System.out.println("범위를 벗어남. 다시입력");
			continue;
			//||연산자는 앞 뒤중 한가지 연산이라도 만족하면 참이 된다.
		}
		System.out.println("while 다시실행");
		//결과
//		1-10사이의 수 입력
//		20
//		범위를 벗어남. 다시입력
//		1-10사이의 수 입력
//		1
//		위와 같이 결과가 나오게 되는데 만족하는 입력한 수가 0부터 10까지는 break로 빠져나오고
//		그 외에는 continue로 묶어서 0부터 10만 받도록 하는데
//		break continue 때문에 while다시실행은 출력 안되는 것을 알 수 있다.
	}
	for(int k=1;k<=i;k++) {
		sum+=k;
	}
	System.out.println("i~"+i+"까지의 합 :"+sum);
	
//	결과
//	1-10사이의 수 입력
//	20
//	범위를 벗어남. 다시입력
//	1-10사이의 수 입력
//	10
//	i~10까지의 합 :55
//	위처럼 while로 입력받은 수 만큼 1부터 더하는 식을 보면
//	이렇게 두 기능을 합쳐서 연산도 가능하다.
	
}
}
