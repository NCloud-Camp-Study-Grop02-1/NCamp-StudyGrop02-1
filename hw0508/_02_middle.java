package homework.hw0508;

import java.util.Scanner;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0508_middle01번
		//"hello"가 담겨있는 크기 30인 StringBuffer에서
		//비어있는 공간을 b,i,t가 반복되어 들어가도록 하시오.
		StringBuffer sb3 = new StringBuffer(30);
		sb3.append("hello");
		int emptySize = sb3.capacity()-sb3.length();
		for(int i=0; i<emptySize; i++) {
			if(i%3==0) {
				sb3.append("b");
			}else if(i%3==1){
				sb3.append("i");
			}else {
				sb3.append("t");
			}
		}
		System.out.println(sb3);
		
		
		//0508_middle02번
		//"유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 StringBuffer이 있을 때
		//사용자가 정수를 입력하고 위 StringBuffer를 거꾸로 만든 StringBuffer의 
		//사용자가 입력한 정수에 해당하는 인덱스의 문자를 출력하세요.
		StringBuffer sb4 = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		StringBuffer sb5 = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		sb5=sb4.reverse();
		System.out.println(num+"번째 문자: "+sb5.charAt(num-1));
	}

}
