package homework.hw0429;

public class _middle04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고,
//		   그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요.
		int i=1;
		int sum=0;
		while(i<=1000) {
			i++;
			if(i%2==0 && i%7==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("총 합은: "+sum);


	}

}
