package echo.ex05;

//에러나는 이유 >> 부모쪽에 있는 메소드 구
public class DigitRunableimpl implements Runnable {

	@Override
	public void run() {

		for (int cnt=0; cnt<=10; cnt++) {
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
