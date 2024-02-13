package while_;

public class Ex03 {
public static void main(String[] args) {
	int i =0;
//	while(i<5) {
//		i++;
//		if(i==3) {
//			System.out.println("33333");
//			break;
//		}
//		System.out.println("i:"+i);
//	}
//	System.out.println("다음 문장 실행");
	
//	i:1
//	i:2
//	33333
//	다음 문장 실행
//	위와 같이 동작하게 되는 데
//	while(i<5) {
//		i++;
//		if(i==3) {
//			System.out.println("33333");
//			//break;
//			continue;
//		}
//		System.out.println("i:"+i);
//	}
//	i:1
//	i:2
//	33333
//	i:4
//	i:5
//	이와 같이 i:3은 출력이 안되는 것을 확인 할 수 있으며
//	이와 같이 continue를 만나게 되면 그 아래 코드들은 동작하기 않고
//	반복문의 위로 올라가는 것을
//	알 수 있다.
	for(;i<5;) {
		
		if(i==3) {
			System.out.println("33333");
			//break;
			continue;
//			33333
//			33333
//			33333
//			33333
//			이와 같이 i++이 아래 있으면 위처럼 i++에 도달하지 못해서
//			무한 루프가 발생되니 조심해야된다.
		}
		i++;
		System.out.println("i:"+i);
	}
}
}
