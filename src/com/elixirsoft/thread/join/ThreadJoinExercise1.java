package com.elixirsoft.thread.join;

public class ThreadJoinExercise1 {

	public static void main(String[] args) {

		// creating 3 threads
		ThreadJoin th1 = new ThreadJoin();
		ThreadJoin th2 = new ThreadJoin();
		ThreadJoin th3 = new ThreadJoin();

		// thread th1 starts
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// thread th2 starts
		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// thread th3 starts
		th3.start();
	}

	private static class ThreadJoin extends Thread {

		@Override
		public void run() {

			for (int j = 0; j < 2; j++) {
				try {
					Thread.sleep(300);
					System.out.println("The current thread name is " + Thread.currentThread().getName());
				} catch (Exception e) {

					System.out.println("The Exception has been caught : " + e);
				}
				System.out.println(j);
			}
		}
	}
}