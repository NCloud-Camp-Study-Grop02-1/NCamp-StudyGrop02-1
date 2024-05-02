package homework_0429;

import java.util.Random;

public class _basic11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		11. int 배열로 10개의 공간을 생성하세요.
//		  1 ~ 10까지의 임의의 수를 저장하고
//		  홀수만 골라서 출력하세요.
		Random random = new Random();
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(10);
			//arr[i] = (int)(Math.random()*100)+1; 라고 해도 됨용
			if(arr[i]%2==1) {
				System.out.println(i+1+"번째의 랜덤값: "+arr[i]);
			}
		}

	}

}
