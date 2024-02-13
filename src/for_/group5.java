package for_;

public class group5 {
	public static void main(String[] args) {
////		문제2) 100부터 500사이의 
//		암스트롱수를 구하는 프로그램을 작성해보자.
////	(암스트롱 수 : 3자리 숫자로 구성되는 수로 
//		각 자릿수에 있는 숫자의 세제곱의 합이 자신과 같은 수이다.) 
		int a=0,b=0,c=0;
		for(int i=100;i<=500;i++) {
			int x1=1,x2=1,x3=1;
			int x=i;
			c=(x%10);x/=10;
			b=(x%10);x/=10;
			a=x;
			for(int j=1;j<4;j++) {
				x1*=a; 
				x2*=b;
				x3*=c;
			}
			//System.out.println(a+","+b+","+c);
			if(i==x1+x2+x3){
				System.out.println(i+"는 암스트롱 수이다.");
			}
			
		}
	}

}
