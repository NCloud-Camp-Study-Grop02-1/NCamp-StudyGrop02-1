package homework.hw0514;
//5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.
public class _01_basic {
	public static void main(String[] args) {
		//1. 1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다. 
		Thread subThread = new Thread() {
			@Override
			public void run() {
				for(int i=1;i<=20;i++) {
					if(30%i==0) {
						System.out.println("subThread스레드: "+i);
					}
				}
			}
		};
		subThread.start();
		//2. 1번 문제에서 join()메소드를 이용해서 서브 스레드가 먼저 실행돼서 
		//끝난 후에 메인 스레드가 실행되도록 구현하세요.
		try {subThread.join();		//join()메소드를 이용해 동작중인(main) 메소드 일시정지>>대기큐에 등록되어 있는 다음 순서(서브스레드)로 이동
		}catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		//1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고 
		for(int i=1;i<=20;i++) {
			if(i%3==0||i%4==0) {
				System.out.println("main스레드: "+i);
			}
		}
	}

}
