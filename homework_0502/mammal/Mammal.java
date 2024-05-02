package homework_0502.mammal;

public abstract class Mammal {
	public String color;
	public String speak;
	public Mammal() {
		color="검정";
		speak="냐옹";
	}
	
	public abstract void color(String color);
	public abstract void speak(String speak);

}
