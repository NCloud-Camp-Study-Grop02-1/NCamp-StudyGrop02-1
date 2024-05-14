package homework.hw0514;

public class SyncThread02 extends Thread{
	private NumberPrinter np;

	public NumberPrinter getNp() {
		return np;
	}

	public void setNp(NumberPrinter np) {
		this.np = np;
	}
	public void run() {
		np.numPrint2(20);
	}
}
