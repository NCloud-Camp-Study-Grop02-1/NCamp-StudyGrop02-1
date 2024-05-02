package homework_0430;

import java.util.Random;
import java.util.Scanner;

public class RockScissPaper {
	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();

	private boolean isExit = false;

	private int gameCnt = 0;

	private int winCnt = 0;

	private int drawCnt = 0;

	private int loseCnt = 0;

	
	//게임을 시작하는 메소드
	public void start() {
		while(true) {
			//가위(0) 바위(1) 보(2)
			int comRd1 = rd.nextInt(3);
			System.out.println("가위(0), 바위(1), 보(2) 중 하나를 입력하세요.(3 입력 시 종료)");
//			String input = sc.nextLine();
			int inputNum = sc.nextInt();

		}
	}

	

	//승무패 판단해주는 메소드

	public void judgeWDL(int user, int com) {
		
	}

	

	//컴퓨터 가위, 바위, 보 출력해주는 메소드

	public void printCom(int com) {
		
	}


}
