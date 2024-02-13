package while_;

import java.util.Scanner;

public class Ex09 {
public static void main(String[] args) {
	Scanner	input = new Scanner(System.in);
	int num, sum=0;
//	while(true) {
//		System.out.print("1~10사이 수 입력 :");
//		num =input.nextInt();
//		if(num>0&&num<=10) {
//			break;
//		}
//	}
//	for(int i=1;i<=num;i++) {
//		sum+=i;
//	}
	System.out.println("입력 수 까지의 합 :"+sum);
//	이와 같이 반복문 아래에 반복문을 동작 시킬 수 있다.
	//또한 반복문 안에 반복문을 넣어서 연산도 가능한 데
	while(true) {
		System.out.print("1~10사이 수 입력 :");
		num =input.nextInt();
		if(num>0&&num<=10) {
			for(int i=1;i<=num;i++) {
				sum+=i;
			}//이와 같이 if문 안에 충족할 때마다 for문을 반복문을
//			동작시킬 수 있다
			break;
			//이와 같이 for문 내부에 넣어서 동작 시킬 수도 있다. 
			
		}
	}
	
	
}
}
//위 코드는 if를 충족해서 break를 만나야 반복이 끝나는 코드이다.
//그렇기 때문에 위 if조건이 충족하지 않으면 반복문이 계속 동작하게 된다.