package com;

/**
 * Crea un hilo que imprima su nombre cada vez que se ejecuta (por ejemplo,
 * "Ejecutando: Hilo-Usuario").
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Runnable ej2 = () -> System.out.println("Ejecutando: " + Thread.currentThread().getName());
		Thread hilo = new Thread(ej2);
		hilo.setName("Hilo-Usuario");

		hilo.start();
		
		Thread hilo2 = new Thread(ej2);
		hilo2.setName("Otro-Usuario");
		hilo2.start();
	}

}
