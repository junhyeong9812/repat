package while_;

public class Ex01 {
public static void main(String[] args) {
int i =1, sum =0;
//	while(i<=10){
//		System.out.println(i);
//		sum+=i;
//		i++;
//	}
	for(;i<=10;){
		System.out.println(i);
		sum+=i;
		i++;
	}
//	위와 같이 포문과 while문을 서로 같이 사용가능
	System.out.println();
	System.out.println("다음 문장들 실행!!!");
}
}
