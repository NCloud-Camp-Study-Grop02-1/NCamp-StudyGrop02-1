package homework_0502.mammal;

public class Cat extends Mammal {
	public Cat() {
	}
	
	@Override
	public void color(String color) {
		System.out.println(color+"색입니당");
	}
	
	@Override
	public void speak(String speak) {
		System.out.println(speak+"소리를 냅니당");
	}


}
