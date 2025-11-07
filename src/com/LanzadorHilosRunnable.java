package com;

public class LanzadorHilosRunnable {

	public static void main(String[] args) {
		Thread h = new Thread(new Hilo("runnable"));
		h.start();
		try {
			System.out.println(h.getName() + " -> " + h.getState());
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
