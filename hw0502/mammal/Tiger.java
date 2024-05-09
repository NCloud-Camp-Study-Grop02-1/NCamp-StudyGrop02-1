package homework.hw0502.mammal;

public class Tiger extends Cat {
	public Tiger() {		
	}
	public void name() {
		System.out.println("호랑이입니다.");
	}
	public void tigerColor() {
		super.color("갈");
	}
	public void tigerSpeak() {
		super.speak("크앙?");
	}

}
