package com.thread;

public class RunnableInterface implements Runnable{

	
	public void run()
	{
		System.out.println("I was actually present in Runnable Interafce. In order to use me-");
		System.out.println("You will have to override me and make me public");
		
	}
	public static void main(String args[])
	{
		RunnableInterface ri=new RunnableInterface();
		Thread th=new Thread(ri);
		th.start();
	}
}
