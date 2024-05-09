package homework.hw0503;

import java.util.Scanner;

public class Test_0503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0503_middle01번 실행문
		Reverse reverse = new Reverse();
		System.out.println(reverse.reverseString("안녕하세요"));
		
		//0503_middle02번
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String str1 = sc.nextLine();
		
		//charAt(i):i번째에 있는 문자열을 의미
		//.indexOf(a,0):"a"문자열이 있는 인덱스 번호를 의미.0번째부터 찾음.
		//리턴되는 변수는 새로 만들어야 기존의 값이 안들어가고 조건에 맞는 새로운 값만 받아올 수 있음!!!
		String removeStr = "";			
		for (int i = 0; i < str1.length(); i++){
            if (str1.indexOf(str1.charAt(i)) == i) {
            	removeStr += str1.charAt(i);
            }
        }
		System.out.println(removeStr);
		
		//0503_middle03번
		System.out.print("문자열을 입력하세요: ");
		String str2 = sc.nextLine();
		String changeStr = "";
		for(int i=0;i<str2.length();i++) {
			if((i+1)%3==0) {
				changeStr += str2.replace("str2.charAt(i*3)","3");
			}
			//changeStr += changeStr;
		}
		System.out.println(changeStr);
	}

}
