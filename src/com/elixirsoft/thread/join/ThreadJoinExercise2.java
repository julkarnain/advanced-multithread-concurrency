package com.elixirsoft.thread.join;

public class ThreadJoinExercise2 {

	public static void main(String[] args) {

		ThreadJoinInterupt th1 = new ThreadJoinInterupt();	
		try {
			th1.threadToInterupt = Thread.currentThread();
			th1.start();
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static class ThreadJoinInterupt extends Thread {

		Thread threadToInterupt;

		@Override
		public void run() {
			threadToInterupt.interrupt();
		}
	}
}
