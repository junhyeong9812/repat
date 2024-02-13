package while_;

public class Ex07 {
public static void main(String[] args) {
	//자주 에러가 나는 부분
	String n1=null,n2="test";
	int num =1000;
	//대문자로 된 자료형은 class라는 자료형이며 
//	소문자로 되어있는 자료형은 일반 자료형이라 한다.
//	소문자로 된 변수는 .을 찍으면 어떠한 기능도 나오지 않는다.
//	대문자로 된 class자료형은 .을 찍으면 String관련
//	기능들이 나오는 것을 알 수 있다.
	
//	System.out.println(n1.equals(n2));
	
	//null은 어떠한 값도 없는 값이기 떄문에 null에서는 기능을 사용할 수 없다
//	Exception in thread "main" 
//	java.lang.NullPointerException:
//		Cannot invoke "String.equals(Object)" because "n1" is null
//	at repat/while_.Ex07.main(Ex07.java:13)
//	이렇게 널 값일 때는 기능을 사용할 수 없다고 나오며
	
	System.out.println(n2.equals(n1));
//	이렇게 내부의 데이터가 저장되어 있는 문자열은 위와 같이 정상적으로
//	동작하는 걸 확인 할 수 있다.ㄴ
	
//	위와 같이 n1을 비교할 때는 n1에 ==를 이용해서 null이란 값과 비교
//			후 아래와 같이 작성해서 비교를 하면 된다.
	if(n1==null) {
		System.out.println("n1을 입력하세요");
	}else {
		if(n1.equals(n2)) {
			System.out.println("두문자열은 같다.");
		}else {
			System.out.println("다르다");
		}
	}
//	만약 이퀄로 바로 비교하려면 값이 들어있는 변수로 이퀄 함수를 동작하도록
//	하면 된다.
}
}
