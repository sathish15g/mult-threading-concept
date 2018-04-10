package com.sathish;


class RunnerThread1 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<10;++i)
			System.out.println("Runner1: "+i);
	}
}

class RunnerThread2 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<10;++i)
			System.out.println("Runner2: "+i);
	}
}

public class RunnableThread {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new RunnerThread1());
		Thread t2 = new Thread(new RunnerThread2());
		
	/*	Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<1000;++i)
					System.out.println("Runner1: "+i);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<1000;++i)
					System.out.println("Runner2: "+i);
			}
		});
		*/
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("FINISHED Execution.......");
	
	}
}
