package while_;

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int i,temp;
	System.out.print("수 입력");
	i= input.nextInt();
	boolean bool = true;
//	while(bool) {
//		System.out.println("while");
//		if(bool) {
//			System.out.println("bool :"+bool);
//			//bool=false;
////			위와 같이 굳이 break문을 사용하지 않고
////			false로 조건식을 변경해줘도 된다.
//			break;
////			위에 bool에 값을 입력하게 되면 false를 값에 넣은 후
////			아래 식을 진행하지만
////			break를 사용하면 아래식을 실행하지 않게 된다.
////			위와 같은 차이가 있으니 식을 좀더 세분화 하기 위해서는 위 두 차이를 
////			알고 조절할 줄 알아야된다.
//		}
//	}
	//수 입력10
	//while
	//bool :true
	//다음문장 실행 :false
	System.out.println("다음문장 실행 :"+bool);
	while(bool) {
//		System.out.println("while");
		//123을 입력받았을 때
		temp = i%10;
		//123%10=3이 나오게 되고 위의 3값을 temp에 넣게 된다.
		i= i/10;
//		그 후 1의 자리를 사용했기 때문에 몫인 12가 나오게 된다
//		위 같이 반복하게 되면 각 자리의 모든 숫자가 temp에 더해지게 되고
//		마지막으로 10의 자리가 사라지면 위 작업 후 i==0이 되게 되고
//		i==0이 된다면 if에 충족이 되기 떄문에 위 while문을 나오게 된다.
		System.out.println(temp+",");
		if(i==0) {
//			System.out.println("bool :"+bool);
			break;
		}
		System.out.println("while 종속문장");
		//결과
//		수 입력123
//		다음문장 실행 :true
//		3,
//		while 종속문장
//		2,
//		while 종속문장
//		1,

	}
}

}
