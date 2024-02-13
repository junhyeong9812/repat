package while_;

public class quiz03 {
public static void main(String[] args) {
	int maxRice=100000,mouse=1,day=1;
	for(;maxRice>0;day++) {
	maxRice-=mouse*20;
	
	if(day%10==0) {
		mouse*=2;
	}
	System.out.println("ㄴ남은 쌀 :"+maxRice);
	}
	System.out.println("지난 날짜 :"+(day-1));
	System.out.println("남은 쥐 :"+mouse);
}
}
