package homework.hw0501;

public class Rect {
	public int width;
	public int height;
	
	public Rect() {									//기본생성자
	}
	
	public Rect(int inputWidth,int inputHeight) {	//모든 필드 초기화
		this.width = inputWidth;
		this.height = inputHeight;
	}
	
	public int round() {							//사각형의 둘레를 리턴하는 메소드
		return 2*(width+height);
	}
	
	public int area() {							//사각형의 둘레를 리턴하는 메소드
		return width*height;
	}
	

}
