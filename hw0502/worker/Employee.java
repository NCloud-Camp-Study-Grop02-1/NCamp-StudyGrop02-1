package homework.hw0502.worker;

public class Employee extends Worker {

	@Override
	public void arrive() {
		// TODO Auto-generated method stub
		System.out.println("공무원 출근");

	}

	@Override
	public void goHome() {
		// TODO Auto-generated method stub
		System.out.println("공무원 집감");

	}

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("공무원 일하는중...");

	}

}
