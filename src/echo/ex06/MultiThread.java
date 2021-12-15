package echo.ex06;

import echo.ex05.DigitRunableimpl;

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {

		Runnable digit = new DigitRunableimpl();
		Runnable lower = new LowerThread();
		Runnable upper = new UpperThread();
				
		Thread thread1 = new Thread(digit);
		Thread thread2 = new Thread(lower);
		Thread thread3 = new Thread(upper);
		

		thread1.start();
		thread2.start();
		thread3.start();
		for (char ch = 'Z'; ch <= 'Z'; ch++)
			System.out.println(ch+"========================");
		Thread.sleep(1000);
	}

}
