package homework.hw0429;

public class _basic07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. 1 ~ 100까지 합을 do ~ while문으로 출력	
		int i=1;
		int sum = 0;
		do {
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println(sum);
	}

}
