package fatec_ipi_poo_thread;

public class MinhaPrimeiraThread extends Thread{
	
	public void run ()  {
		System.out.println("Estou sendo executado por uma thread diferente" 
	+ Thread.currentThread().getName());
		
	}
}
