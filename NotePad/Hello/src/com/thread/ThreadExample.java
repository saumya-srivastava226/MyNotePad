package com.thread;

public class ThreadExample extends Thread {
	 public void run()
	{
		System.out.println("I am in runnable state");
	}
	
	public static void main(String args[])
	{
		// By default the main thread is present in every program
		ThreadExample te=new ThreadExample();
		te.start();
		
	}

}
