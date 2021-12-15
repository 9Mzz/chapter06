package echo.ex06;

public class UpperThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int unt = 0; unt <= 10; unt++) {
			System.out.println(unt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
