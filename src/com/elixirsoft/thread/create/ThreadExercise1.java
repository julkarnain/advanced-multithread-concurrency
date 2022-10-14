package com.elixirsoft.thread.create;

public class ThreadExercise1 {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("I am in a " + Thread.currentThread().getName() + " thread");
				System.out.println("The personal thread priority number is  " + Thread.currentThread().getPriority());
				
			}
		});
		
		thread.setName("personal");
		thread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("We are in a thread " + Thread.currentThread().getName() + " before starting a new thread");
		thread.start();
		System.out.println("We are in a thread " + Thread.currentThread().getName() + " after starting a new thread");
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				throw new RuntimeException("Intenal Exception........");
			}
		});
		
		thread1.setName("Misbehavior");
		
		thread1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				// TODO Auto-generated method stub
				System.out.println("A critical error is happened in the thread " + thread1.getName() + ". The error is " + e.getMessage());
			}
		});
		
		thread1.start();
	}
}
