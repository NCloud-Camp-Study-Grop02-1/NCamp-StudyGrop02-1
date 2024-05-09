package homework.hw0508;

import java.util.Scanner;

public class _03_Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
	    //연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여출력하세요. 
		//(단, 대소문자 구분함. StringBuilder를 사용하세요.)
	    //ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb6 = new StringBuffer();
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) {
				result+=str.charAt(i);
			}
		}
		System.out.println(result);

	}

}
