package homework.hw0502.worker;

public class Programmer extends Worker {

	@Override
	public void arrive() {
		// TODO Auto-generated method stub
		System.out.println("개발자 출근합니다 ㅠㅠ");

	}

	@Override
	public void goHome() {
		// TODO Auto-generated method stub
		System.out.println("개발자 집갑니다!");

	}

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("개발자 일하는중...");
	}

}
