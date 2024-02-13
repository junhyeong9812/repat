package while_;

public class Ex10 {
public static void main(String[] args) {
	for(int k=0; k<3;k++) {
		System.out.println("상위 반복문 시작");
		for(int i=0;i<3;i++) {
			System.out.println(i+".for");
//			break;
			//여기 break를 넣게 되면 현재 바로 상위 for문을 종료시킨다.
//			상위 반복문 시작
//			0.for
//			상위 반복문 끝
//			상위 반복문 시작
//			0.for
//			상위 반복문 끝
//			상위 반복문 시작
//			0.for
//			상위 반복문 끝
//			다음 문장들 실행
//			이와 같이 0.for만 나오는 것을 확인 할 수 있으며
//			이렇게 break는 1개의 for문만 동작을 중지시킨다.
//			
		}
		System.out.println("상위 반복문 끝");
	}
	System.out.println("다음 문장들 실행");
}
}
//상위 반복문 시작
//0.for
//1.for
//2.for
//상위 반복문 끝
//상위 반복문 시작
//0.for
//1.for
//2.for
//상위 반복문 끝
//상위 반복문 시작
//0.for
//1.for
//2.for
//상위 반복문 끝
////다음 문장들 실행
//이렇게 결과가 나오게 된다.
