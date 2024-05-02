package homework_0502.mammal;

public class Lion extends Cat {
	public Lion() {
		
	}
	public void name() {
		System.out.println("사자입니다.");
	}
	
	@Override
	public void color(String color) {
		super.color(color);
	}
	
	public void lionColor() {
		super.color("황갈");
	}
	public void tigerSpeak() {
		super.speak("크아아앙?");
	}

}
