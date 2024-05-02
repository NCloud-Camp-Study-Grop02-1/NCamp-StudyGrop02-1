package homework_0429;

public class _basic09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		9. int 10개짜리 배열 생성하여
//		 int배열에 3의 배수를 차례대로 저장하세요.
//		 그리고 거꾸로 출력하세요.\
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1)*3;
			System.out.println(arr[(11-i)]);
			//System.out.println(arr[(arr.length-i)]);

		}


	}

}
