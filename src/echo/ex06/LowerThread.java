package echo.ex06;

public class LowerThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (char cnt = 'a'; cnt <= 'z'; cnt++) {
			System.out.println(cnt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
