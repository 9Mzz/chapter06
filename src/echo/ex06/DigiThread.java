package echo.ex06;

public class DigiThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int dnt = 0; dnt <= 10; dnt++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
