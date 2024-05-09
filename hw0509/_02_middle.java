package homework.hw0509;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
		Scanner sc = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print("날짜를 입력하세요(yyyy-MM-dd 형식으로): ");
		//calendar.YEAR= ;
		
		
	    //yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
	    //parse() 메소드를 이용하면 String -> Calendar로 변환가능)

		//2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
		//사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.

		//3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
		//시 분 초 형태로 나타내시오.
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2023,3,15,20,31,45);
		cal2.set(2021,7,8,11,58,04);
		long diff = cal1.getTimeInMillis() - cal2.getTimeInMillis();
		
		long diffTime = diff / ((long)1000 * 60 * 60);
		diff %= ((long)1000 * 60 * 60);
		long diffMin = diff / ((long)1000 * 60);
		diff %= ((long)1000 * 60);
		long diffSec = diff / ((long)1000);
		
		System.out.println("cal2부터 cal1까지 " + diffTime + "시간 " + diffMin + "분 " + diffSec + "초가 지났습니다.");
	}

}
