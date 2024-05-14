package homework.hw0514;
//3. 그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와 
//numPrint2를 호출하는 스레드 클래스 1개를 구현하고 메인스레드에서 두 개의 스레드를 실행하세요.
public class SyncThread01 extends Thread{
	private NumberPrinter np;

	public NumberPrinter getNp() {
		return np;
	}

	public void setNp(NumberPrinter np) {
		this.np = np;
	}
	public void run() {
		np.numPrint1(10);
	}
}
