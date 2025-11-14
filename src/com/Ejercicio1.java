package com;

/**
 * Crea un hilo que imprima "Hola desde un hilo" mientras el hilo principal
 * imprime "Hola desde main". Observa que los mensajes pueden mezclarse en el
 * tiempo.
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		// Crea una clase que extienda Thread o usa Runnable con expresión lambda.
		Runnable ej1 = () -> System.out.println("Hola desde un hilo");
		Thread hilo = new Thread(ej1);

		// En main, crea el hilo, llama a start() y luego imprime el mensaje del hilo principal.
		System.out.println("Hola desde el Main");
		// En run() imprime el mensaje del hilo.
		hilo.run();
	}
}
