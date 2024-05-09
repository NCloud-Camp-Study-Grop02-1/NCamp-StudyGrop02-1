package homework.hw0429;

import java.util.Scanner;

public class _basic10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		10. int배열을 10개 생성해서
//		  사용자로부터 10개의 값을 입력받고
//		  순서대로 출력하고 총합을 구하세요.
		
		int[] arr = new int[10];
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("숫자 입력행: ");
			Scanner sc = new Scanner(System.in);
			int userNum = sc.nextInt();
			sum+=userNum;
		}
		
		System.out.println("지금까지 입력하신 숫자의 합은: "+sum);
	}
	

}
