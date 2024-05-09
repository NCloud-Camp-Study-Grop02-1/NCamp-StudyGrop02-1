package homework.hw0507;

import java.util.Scanner;

public class _02_Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0507_middle01번 문제
		//사용자가 입력한 문자열 중 가운데 문자 출력(짝수개면 가운데 두개)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String middleStr = sc.nextLine();
		
		if(middleStr.length() % 2 != 0) {
			System.out.print("가운데 문자열: ");
			System.out.println(middleStr.charAt(middleStr.length()/2));
		}else {
			System.out.print("가운데 문자열: ");
			System.out.print(middleStr.charAt(middleStr.length()/2));
			System.out.print(middleStr.charAt(middleStr.length()/2)+1);
		}
		
		System.out.println();
		
		String answer = "";
		//int는 자동형변환 과정에서 반올림됨용
	    int num = middleStr.length()/2-1;
	 
	    if(middleStr.length()%2==0){          //짝수일때
	    	answer= answer+middleStr.charAt(num);
	        answer+= middleStr.charAt(num+1);
	 
	    }else if(middleStr.length()%2!=0){    //홀수일때
	    	num=middleStr.length()/2;
	    	answer+= middleStr.charAt(num);
	    	}
	    System.out.println(answer);
	    
	 
		
		//0507_middle02번 문제
		//길이가 12인 char배열 선언 후 
		//{'b','c','s','i','i','o','q','n','t','m','l','t'}로 초기화
	    //단어를  bit,com,sql,int로 만들어서 모두 출력하세요
	    //위와 같이 경우의 수를 4가지로 만들때 나머지 연산을 많이 사용함.
	    String s1 = "bcsiioqntmlt";
	    char[] ch = new char[12];
	    for (int i = 0; i < s1.length(); i++) {
	        ch[i] = s1.charAt(i);
	      }
//	    if() {
//	    	
//	    }else if() {
//	    	
//	    }else if() {
//	    	
//	    }else
	    System.out.println(ch);
	    System.out.println("-----------------");
	    
	    //거꾸로
	    String bit = "bit";
	    String com = "com";
	    String sql = "sql";
	    String intStr= "int";
	    
	    char[] charArr2 = new char[12];
	    
	    
	    for (int i = 0; i < s1.length(); i++) {
	    	if(i%4==0) {
	    	}
	    }
	    
	    sc.close();
		
	    
		//0507_middle03번 문제
		//10000원. 금리는 연 10%. 복리이자로 10년 후 금액 계산하기
	    double money = 10000;	//원금
		double rate = 0.1;	//금리 10퍼
		int year = 10;		//기간

		for(int i=0; i<year; i++){
			money = money+(money*rate);			
		}
		
		System.out.println(year + "년 후 총액은"+money +"입니다.");
	}

}
