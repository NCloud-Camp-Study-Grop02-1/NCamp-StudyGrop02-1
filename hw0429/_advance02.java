package homework.hw0429;

import java.util.Scanner;

public class _advance02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		2. 369게임을 작성합니다.
		//		   1~99까지의 정수를 입력받고
		//		   3,6,9중 하나가 있으면 "박수짝"을 출력하고
		//		   2개가 있으면 "박수짝짝"을 출력하세요
		//		   예를 들어 13은 "박수짝"
		//		   36인 경우는 "박수짝짝"을 출력하면 됩니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요: ");
		int num = sc.nextInt();
		int ten, one, clap = 0;
		ten = num/10; one = num%10;

		if(ten==9 || ten==6 || ten==3) clap++;
		if(one==9 || one==6 || one==3) clap++;
		if(clap==2) System.out.println("박수짝짝");
		else if(clap==1) System.out.println("박수짝");
		
		sc.close();
		
//		while(true) {
//			System.out.print("1~99사이의 숫자를 입력하세용: ");
//			if(num<1 || num>100) {
//				System.out.println("1~99사이의 숫자가 아닙니다.");
//				continue;
//			}

//			else if(숫자에 3,6,9가 있으면) {
//				숫자의 개수만큼 "짝" 출력
//			}
//		}
		
//		sc.close();
				
		

	}

}
