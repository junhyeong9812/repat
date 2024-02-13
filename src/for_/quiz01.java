package for_;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maxNum=0, minNum=0,num=0,select=0,range=0;
		while(true) {
			System.out.println("1.난수 생성기 사용");
			System.out.println("2.사용 종료");
			System.out.print("원하시는 기능의 숫자를 입력해주세요:");
			select=input.nextInt();
				if(select==1){
				System.out.print("시행 횟수를 입력해주세요.");
				num=input.nextInt();
				System.out.print("범위의 최소를 입력해주세요.");
				minNum=input.nextInt();
				System.out.print("범위의 최대를 입력해주세요.");
				maxNum=input.nextInt();
				range=maxNum-minNum;
				if(maxNum<minNum) {
					System.out.println("최소가 최대보다 큽니다. 처음으로 돌아갑니다.");
					continue;
				}
				for(int i=0;i<num;i++) {
					int ran=(int)(Math.random()*range+minNum);
					System.out.println(ran);
					
				}
				System.out.println("계속진행 하시겠습니까?");
				System.out.println("1.예 2.아니요");
				select=input.nextInt();	
				
				}
				if(select==2) {
					break;
					}
				
				else System.out.println("1,2중 선택해주세요.");
				
			
			}
			
		}
		
	}
	

