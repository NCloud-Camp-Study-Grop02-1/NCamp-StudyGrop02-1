package homework.hw0503;

import java.util.Scanner;

public class Test_0503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse reverse = new Reverse();
		System.out.println(reverse.reverseString("안녕하세요"));
		
		//0503_middle02번
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String str1 = sc.nextLine();
		
		//charAt(i):i번째에 있는 문자열을 의미
		//.indexOf(a,0):"a"문자열이 있는 인덱스 번호를 의미.0번째부터 찾음.
		for (int i = 0; i < str1.length(); i++){
            if (str1.indexOf(str1.charAt(i)) == i) {
                str1 += str1.charAt(i);
            }
        }
		System.out.println(str1);
		
		//0503_middle03번
		System.out.print("문자열을 입력하세요: ");
		String str2 = sc.nextLine();
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i)%3==0) {
				str2=str2.replace("str2.charAt(i*3)","3");
			}
			str2+=str2;
		}
		System.out.println(str2);
		
	}

}
