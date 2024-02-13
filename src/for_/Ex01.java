package for_;

public class Ex01 {
	public static void main(String[] args) {
		int sum=0, i=1;
		sum=sum+i;
		i++;
		sum=sum+i;
		i++;
		sum=sum+i;
		i++;
		sum=sum+i;
		i++;
		sum=sum+i;
		i++;
		sum=sum+i;
		i++;
		sum=sum+i;
		i++;
		sum=sum+i;
		i++;
		sum=sum+i;
		i++;
		sum=sum+i;
		//만약 코드가 불규칙적이면 반복문을 사용할 수 없다.
		//위와 같이 코드가 규칙적으로 되어 있어야 for문을 사용할 수 있다.
		
		i++;System.out.println(sum);
		for(i=1;i<=10;i++) {
			sum+=i;
		}
		
	}
}
