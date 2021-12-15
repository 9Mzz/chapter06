package echo.ex04;

public class LowerThread extends Thread {

	@Override
	public void run() {
		for(int lnt=0; lnt<=10; lnt++ ) {
			System.out.println(lnt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	
	
}
