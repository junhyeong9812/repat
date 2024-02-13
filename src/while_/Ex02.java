package while_;

public class Ex02 {
	public static void main(String[] args) {
		int i =0;
		while(true) {
			i++;
//			System.out.println("i:"+i);
//			위와 같이 동작하게 되면 항상 true이기 때문에
//			무한반복이 되게 된다.
//			만약 이렇게 사용하게 되었을 때 반복문을 끝내기 위해서
			if(i>3) {
				break;
//				이와 같이 조건을 걸어서 break를 사용하면 위 조건 만족 시 
//				강제로 반복문을 종료시킬 수 있다.
//				if없이 그냥 break를 걸게 되면 break까지 실행 후 종료된다.
//				
			}
		}
		for(;;) {
			System.out.println("i :"+i);
			i++;
			if(i>5) {
				break;
			}
		}
//		현재 위 식이 while의 true같이 동작된다.
//		for문이나 while같이 무한반복을 하게되면 
//		그 무한반복문 아래에 식이 추가되면
//		실행할 수 없다는 오류가 난다.
//		System.out.println();
//		Exception in thread "main" 
//		java.lang.Error: Unresolved compilation problem: 
//			Unreachable code
//		위와 같이 불가능하다고 나오게 된다.
		System.out.println();
		//위에 break가 존재하게 되면 정상적으로 동작되는 것을 알 수 있다.
		
//		if(i==6) {
//			System.out.println();
//			break;
//		}
//		Exception in thread "main" 
//		java.lang.Error: Unresolved compilation problem: 
//			break cannot be used outside of a loop or a switch
//		또한 위와 같이 break문은 반복문 내부에서만 동작하게 된다.
//		위처럼 그냥 if문에 break를 넣게 되면 위와 같이 해결할 수 없는 문제가 
//		생기게 된다.
		
		
	}
}
