package sync;

public class ContadorConMonitor {

	private static int contador = 0;

	private static Object MONITOR = new Object();

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				synchronized (MONITOR) {
					System.out.println("Soy: " + Thread.currentThread().getName());
					contador++;
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				synchronized (MONITOR) {
					System.out.println("Soy: " + Thread.currentThread().getName());
					contador++;
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
		}

		System.out.println("Contador: " + contador);
	}

}
