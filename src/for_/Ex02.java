package for_;

public class Ex02 {
public static void main(String[] args) {
	int sum=0;
	//sum=sum+i;i++;
//	for(;;) {
//		
//	}//위 같이 ()안에 값이 없어도 되지만 ;;는 두개가 존재해야된다.
//	for(int i=1;i<=10;i++) {
//		System.out.println(i);
//		sum=sum+i;
//	}//처음에는 변수를 초기화하고 두번째에는 변수의 범위를 지정해서
//	반복할 횟수를 지정해주며 마지막에는 증감식을 저장해서 조건식에서 
//	카운트 역할을 한다
	//식을 실행할 떄는 조건식에 따라 조건식이 성립하면 종속블록문장을 실행
	//만약 조건이 충족하지 않으면 종속블록문장을 실행하지 않는다.
	System.out.println(sum);
//	이런 반복문의 장점은 조건식을 조절해주면 원하는 만큼 종속문장을 
//	동작시킬 수 있기 때문에 편리하다
//	프로그램을 돌릴 때 내가 만든 식이 제대로 동작하는 지 확인하는 것을
//	디버깅이라 하는데
//	이런 디버깅 기능을 사용하면 훨씬 쉽게 작업이 가능하다.
	for(int i=1;i<=10000000;i++) {
		System.out.println(i);
		sum=sum+i;
	}
	System.out.println(sum);

}
}
