package com;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Muestra los estados de un hilo antes de arrancar, mientras está trabajando y
		// una vez que ha terminado.

		Thread hilo = new Thread(() -> {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		});

		System.out.println("Estado: " + hilo.getState());

		hilo.start();

		System.out.println("Estado: " + hilo.getState());
		System.out.println("isAlive: " + hilo.isAlive());

		try {
			hilo.join();
		} catch (InterruptedException e) {
		}

		System.out.println("Estado: " + hilo.getState());
		System.out.println("isAlive: " + hilo.isAlive());

	}

}
