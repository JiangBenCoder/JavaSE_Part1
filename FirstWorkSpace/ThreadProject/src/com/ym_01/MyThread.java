package com.ym_01;


public class MyThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + i);
		}
	}
}
