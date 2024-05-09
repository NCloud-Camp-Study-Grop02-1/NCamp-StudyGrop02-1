package homework.hw0429;

public class _middle06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 중첩 for문을 이용해서 아래와 같이 출력하세요.
//		6-1)  
//		*		j=0
//		**		j=1
//		***		j=2
//		****	j=3
//		*****	j=4
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) System.out.print("*");
			System.out.println();
		}
		System.out.println("\n------------------");
//		6-2)
//		    *	공백j=4
//		   **	공백j=3
//		  ***	공백j=2
//		 ****	공백j=1
//		*****	공백j=0
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) System.out.print(" ");
			for(int j=0;j<=i;j++) System.out.print("*");
			System.out.println();
		}
		System.out.println("\n------------------");
//		6-3)
//		*****
//		****
//		***
//		**
//		*
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) System.out.print("*");
			System.out.println();
		}
		System.out.println("\n------------------");
//		6-4)
//		*****
//		 ****
//		  ***
//		   **
//		    *
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) System.out.print(" ");
			for(int j=0;j<5-i;j++) System.out.print("*");
			System.out.println();
		}

	}

}
