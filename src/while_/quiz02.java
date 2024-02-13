package while_;

import java.util.Scanner;

public class quiz02 {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int money=0,leftMoney=0,select=0;
	boolean flag = true;
	System.out.print("요금을 투입하세요 >>>");
	money=input.nextInt();
	leftMoney+=money;
	
	while(flag) {
		System.out.println("=========커피 자판기==========");
		System.out.println("1.커피(200)\t2.코코아(250)\t3.반환\t4.종료");
		System.out.print("메뉴를 선택하세요 >>>");
		select =input.nextInt();
		if(select>0&&select<=4) {
		switch (select) {
			case 1 :{
				leftMoney-=200;
				if(leftMoney>0) {
					System.out.println("맛있게 드세요.");
				}else {
					System.out.println("요금이 부족합니다.");
					leftMoney+=200;
				}
				System.out.println("남은 돈 :"+leftMoney);
				break;
			}
			case 2 : {
				leftMoney-=250;
				if(leftMoney>0) {
					System.out.println("맛있게 드세요.");
				}else {
					System.out.println("요금이 부족합니다.");
					leftMoney+=250;
				}
				System.out.println("남은 돈 :"+leftMoney);
				break;
			}
			case 3 : {
				System.out.println("거스름돈 :"+leftMoney);
				leftMoney=0;
			break;
			}
		}
		if(select==4) {
			System.out.println("자판기를 종료합니다.");
			break;
		}
		}else {
			System.out.println("0부터 4까지만 선택해주세요.");
			continue;
		}		
	}
}
}

//요금을 투입하세요 >>>1000
//=========커피 자판기==========
//1.커피(200)	2.코코아(250)	3.반환	4.종료
//메뉴를 선택하세요 >>>1
//맛있게 드세요.
//남은 돈 :800
//=========커피 자판기==========
//1.커피(200)	2.코코아(250)	3.반환	4.종료
//메뉴를 선택하세요 >>>2
//맛있게 드세요.
//남은 돈 :550
//=========커피 자판기==========
//1.커피(200)	2.코코아(250)	3.반환	4.종료
//메뉴를 선택하세요 >>>3
//거스름돈 :550
//=========커피 자판기==========
//1.커피(200)	2.코코아(250)	3.반환	4.종료
//메뉴를 선택하세요 >>>1
//요금이 부족합니다.
//남은 돈 :0
//=========커피 자판기==========
//1.커피(200)	2.코코아(250)	3.반환	4.종료
//메뉴를 선택하세요 >>>4
//자판기를 종료합니다.
