package while_;

import java.util.Scanner;

public class quiz03_2 {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	int num1=0,num2=0,lcMulti=0,gCFactor=0;
	System.out.print("첫번째 숫자를 입력해주세요 :");
	num1=input.nextInt();
	System.out.print("두번째 숫자를 입력해주세요 :");
	num2=input.nextInt();
	int i =1;	
	while(true) {
		if(num1>=i&&num2>=i) {
		if (num1%i==0&&num2%i==0) {
			gCFactor=i;	
		}
		}else {
		
			if (i%num1==0&&i%num2==0) {
				lcMulti+=i;
				break;

			}
		}
		
		i++;
		
		
	}
	System.out.println("두 수의 최대 공약수는 "+gCFactor);	
	System.out.println("두 수의 최소 공배수는 "+lcMulti);
}
}
