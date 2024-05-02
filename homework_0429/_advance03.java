package homework_0429;

public class _advance03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 다음과 같이 출력하세요.
//	    *
//	   ***
//	  *****
//	 *******
//	*********
		for(int i=1; i<=5; i++) {
		    for(int j=0; j<5-i; j++) System.out.print(" ");
		    for(int j=0; j<i+i-1; j++) System.out.print("*");
		    System.out.println ();
		}


	}

}
