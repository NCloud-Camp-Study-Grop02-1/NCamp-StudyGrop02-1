package homework.hw0430;

public class _0430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main메소드에서 사용해보려면 static으로 메소드 맹들어야 됨.
		
		//basic01 값 주기
		System.out.println(total(10));
		
		//basic02,03
		//ConcatString concatString = 
		

	}
	
	//0430_basic_01문제
	public static int total(int a){
		int sum=0;
		for(int i=0; i<a; i++) {
			sum+=i;
		}
		return sum;
	}
	
	//0430_basic_04문제
	public static void back1(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[arr.length-i-1] );
		}
	}
	
	//0430_middle_01문제(역순으로 저장된 새로운 배열 리턴)
	public static int[] back2(int[] arr) {
		int[] newArr= new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			newArr[i] = arr[arr.length-i-1];
		}
		return newArr;
	}
	//0430_middle_02문제(대소문자 변환)
	public static char[] converChar(char[] chArr) {
		char[] newChar = new char[chArr.length];
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i]>= 65 && chArr[i]<= 90) {
				newChar[i] = (char)(chArr[i] + 31);
			}else{
				newChar[i] = (char)(chArr[i] - 31);
			}
		}
		return newChar;
	}
}
