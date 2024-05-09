package homework.hw0508;

import java.util.Scanner;

public class _01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0508_basic01번 문제
		//사용자가 입력한 문자열 3개를 합쳐서 출력. StringBuffer사용
		Scanner sc = new Scanner(System.in);
		StringBuffer sb1 = new StringBuffer();
		String[] arr = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.print(i+1+"번째 문자열을 입력하세요: ");
			arr[i] = sc.nextLine();
		}
		for(int i=0;i<3;i++) {
			sb1.append(arr[i]);
		}
		System.out.println("합쳐진 문자열: "+sb1);
		
		//0508_basic02번
		//크기가 30인 StringBuffer에 "hello"라는 문자열있음
		//비어있는 바이트 공간을 a로 채우시오
		StringBuffer sb2 = new StringBuffer(30);
		sb2.append("hello");
		int emptySize = sb2.capacity()-sb2.length();
		for(int i=0; i<emptySize; i++) {
			sb2.append("a");
		}
		System.out.println(sb2);
		
		sc.close();
	}

}
