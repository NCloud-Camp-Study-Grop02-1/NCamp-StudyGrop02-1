package homework.hw0429;

import java.util.Scanner;

public class _basic12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		12. 정수 10개를 입력받아 배열에 저장하고, 
//	    이 정수 중에서 2의 배수와 3의 배수를 출력하세요.

		int[] numArr = new int[10];
		
		System.out.print("숫자 입력행: ");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++) numArr[i] = sc.nextInt();
		for(int i=0;i<10;i++) {
			if(numArr[i]%2==0 || numArr[i]%3==0) System.out.println(numArr[i]);
		}

	}

}
