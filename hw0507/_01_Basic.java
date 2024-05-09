package homework.hw0507;

import java.util.Scanner;

public class _01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0507_basic01번 문제
		//사용자가 입력한 문자열에서 가,바의 개수 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String cntStr = sc.nextLine();
		int gaCnt = 0;	//가의 개수
		int baCnt = 0;	//바의 개수
		
		for(int i=0; i<cntStr.length(); i++) {
			if (cntStr.charAt(i) == '가') {
				gaCnt++;
			}else if(cntStr.charAt(i) == '바') {
				baCnt++;
			}
		}
		if(gaCnt==0 && baCnt==0) {
			System.out.println("가,바가 존재하지 않습니다.");
		}else {
			System.out.println("'가'의 개수: "+gaCnt);
			System.out.println("'바'의 개수: "+baCnt);	
		}
		
		//0507_basic02번 문제
		//사용자가 입력한 문자열에서 알파벳 모음 제거하여 출력
		System.out.print("문자열을 입력하세요: ");
		String removeStr1 = sc.nextLine();
		String removeStr2="";
		
	    System.out.println("The string before removing character: " + removeStr1); 
	    removeStr2 = removeStr1.replaceAll("[aeiouAEIOU]", ""); 
	    System.out.println("The string after removing character: " + removeStr2); 
		
		//0507_basic03번 문제
	    //16.459를 소수점 둘 째 자리까지 반올림해서 출력
	    //Math.round(값): 소수 첫째자리 반올림
	    double num = 16.459;
	    double result = Math.round(num * 100) / 100.0; 
		System.out.println(result);
		
		sc.close();

	}

}
