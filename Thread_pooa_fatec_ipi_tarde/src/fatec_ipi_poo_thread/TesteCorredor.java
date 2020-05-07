package fatec_ipi_poo_thread;

public class TesteCorredor {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		
		Thread corredor1 = new Thread(new Corredor(mainThread, 30), "Senna");
		Thread corredor2 = new Thread(new Corredor(mainThread, 25), "Barrichello");
		Thread corredor3 = new Thread(new Corredor(mainThread, 20), "Mansell");
		Thread corredor4 = new Thread(new Corredor(mainThread, 15), "Piquet");
		Thread corredor5 = new Thread(new Corredor(mainThread, 10), "Hill");
		
		corredor1.start();
		corredor2.start();
		corredor3.start();
		corredor4.start();
		corredor5.start();
		
		System.out.println("Começa a corrida");
	}

}
