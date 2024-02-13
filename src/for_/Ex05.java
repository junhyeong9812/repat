package for_;

public class Ex05 {
public static void main(String[] args) {
//	for(;;) {
//		System.out.println("실행");
////	()빈칸으로 위와 같이 실행하면 지속적으로 반복되게 된다.
////		루프현상에 빠질 수 있다.
//	}
	int i=0;
	while(i<5) {
		System.out.println(i);
		i++;
	}
//	현재 위 for문과 while true와 같은 동작을 보인다.
//	for문으로 하게 되면 위와 같이 되며 초기화 해주는 시기는 
//	while문 상단에 그 후 조건식은 while옆 ()에 들어가면 되고
//	증감식은 while 끝에 작성하면 for문과 비슷하게 구동이 가능하다.
	
	for(i=0;i<5;i++) {
		System.out.println(i);
	}
	//for문도 while처럼 사용이 가능하다.
	i=0;
	for(;i<5;) {
		System.out.println(i);
		i++;
	}
//	이와 같이 while문과 for문은 서로 비슷하게 구동시킬 수 있다.
}
}
