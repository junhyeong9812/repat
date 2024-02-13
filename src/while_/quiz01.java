package while_;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=0;
		String id=null,pw=null,svid=null,svpw=null;
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.print(">>>>");
			num=input.nextInt();
			if(num>0&&num<=3) {
				switch(num) {
				case 1 : {
					System.out.print("1.아이디 입력 :");
					id=input.next();
					System.out.print("2.비밀번호 입력 :");
					pw=input.next();
					if(id.equals(svid)) {
						if(pw.equals(svpw)) {
							System.out.println("로그인 성공");
						}else {
							System.out.println("인증 실패!!!");
							System.out.println("비밀번호가 틀렸습니다.");
						}
					}else {
						System.out.println("인증 실패!!!");
						System.out.println();
					}
					break;	
					}
				
				case 2 : {
					System.out.print("저장할 아이디 입력 :");
					svid=input.next();
					System.out.print("저장할 비밀번호 입력 :");
					svpw=input.next();
					System.out.println("가입성공!!");
					System.out.println("\n\n");
					break;
				}
				case 3 : {
					break;
				}default :{
					
				}
				}
				if(num==3) {
					break;
				}
			}
		}
	}
}
