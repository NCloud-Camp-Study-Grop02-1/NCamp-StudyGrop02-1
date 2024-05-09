package homework.hw0501;

public class SmartPhone {

	//핸드폰의 속성들
	public String company;	//제조사
	public String volume;	//음량
	public String model;	//모델
	public int price;		//가격
	
	//생성자 메소드: 리턴타입이 없고 클래스 이름과 동일한 명칭의 메소드
	//생성자 메소드의 역할은 객체를 생성하고 객체에 있는 변수와 메소드를 메모리에 올리면서
	//변수드을 초기화하는 역할
	
	//핸드폰의 기능들
	public void phoneOn() {
		System.out.println("폰을 켠다.");
	}
	public void phoneOff() {
		System.out.println("폰을 끈다");
	}
	public void volumeUp() {
		System.out.println("음량을 높인다.");
	}
	public void volumeDown() {
		System.out.println("음량을 줄인다.");
	}
	// 핸드폰의 정보를 표시한다.
	public void printPhoneInfo() {
		System.out.println("제조사: "+company);
		System.out.println("모델: "+model);
		System.out.println("가격: "+price);
	}
}
