package while_;

import java.util.Scanner;

public class Ex06 {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	String name1,name2;
	System.out.println("1.이름 입력 :");
	name1 =input.next();
	System.out.println("2.이름 입력 :");
	name2 =input.next();
	System.out.println("n1==n2=>"+(name1==name2));
//	1.이름 입력 :
//		kimjun
//		2.이름 입력 :
//		kimjun
//		false
//	문자열을 비교할 때는 등호로는 불가능하다.
//	숫자는 등호 두개로 비교가 가능하지만 문자열은 등호로는 비교를 할 수 없다.
//	그렇기 때문에 아래와 같이 .equals함수를 사용해야된다.
	System.out.println("n1==n2=>"+(name1.equals(name2)));
//	1.이름 입력 :
//		kimjun
//		2.이름 입력 :
//		kimjun
//		false
//		n1==n2=>true
//		이름이 같다.
	
	if(name2.equals(name1)) {
		System.out.println("이름이 같다.");			
	}else {
		System.out.println("이름이 다르다.");
	}
}
}
