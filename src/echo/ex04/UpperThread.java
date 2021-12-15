package echo.ex04;

public class UpperThread extends Thread{

	@Override
	public void run() {

		for(int unt=0; unt<=10; unt++ ) {
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
