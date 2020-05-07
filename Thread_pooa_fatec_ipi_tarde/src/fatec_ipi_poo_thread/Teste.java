package fatec_ipi_poo_thread;

public class Teste {

	public static void main(String[] args) {
		
		MinhaPrimeiraThread thread = new MinhaPrimeiraThread();
		//thread.run(); // não cria uma nova thread
		// devemos chamar o start
		thread.start();
		System.out.println("No main: " + Thread.currentThread().getName());
	}

}
