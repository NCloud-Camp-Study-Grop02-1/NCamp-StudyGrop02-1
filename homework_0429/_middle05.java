package homework_0429;

import java.util.Random;

public class _middle05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. 20개 배열을 선언하세요.
//	    20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
//	    인덱스의 홀수번째는 앞에서부터 출력하고
//	    짝수번째는 뒤에서부터 출력하세요.
		int[] arr = new int[20];
		Random random = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(100);
			//arr[i] = (int)(Math.random()*100)+1; 라고 해도 됨용
			if(i%2==0) { //홀수번째(인덱스값은 짝수)
				System.out.println(i+1+"번째의 랜덤값: "+arr[i]);
			}else{ //짝수번째(인덱스값은 홀수)
				System.out.println(21-i+"번째의 랜덤값: "+arr[20-i]);
			}
			
		}


	}

}
