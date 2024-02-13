package while_;

public class Ex08 {
public static void main(String[] args) {
//	int i=5, su=10;
//	do {
//		System.out.println("do while :"+su);
//	}while(su<i);
//	System.out.println("다음 문장 실행");
//	위와 같이 su<i의 조건은 false지만
//	결과:
//		do while :10
//		다음 문장 실행
//	이렇게 종속문장은 무조건 1번은 실행되기 때문에 false라도 1번이 실행된
//	것을 확인 할 수 있다.
//	su를 1로 변경 후
	int i=5, su=1;
	do {
		su++;
		System.out.println("do while :"+su);
	}while(su<i);
//	do while :2
//	do while :3
//	do while :4
//	do while :5
//	다음 문장 실행
//	이와 같이 조건을 정상적으로 바꾸면 정상적으로 반복하는 것도 확인 가능
	System.out.println("다음 문장 실행");
	
//	while은 조건식이 위에 있기 때문에 while문에 조건을 파악 후 아래
//	명령어를 실행하지만
//	do while은 종속문장이 먼저 오기 때문에
//	종속문장 실행 후 조건을 비교하고 반복할 지 결정하는 것을 알 수 있다.

	
}
}
