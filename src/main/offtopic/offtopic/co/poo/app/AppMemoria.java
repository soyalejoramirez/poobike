package offtopic.co.poo.app;

import co.poobike.dominio.Bicicleta;

public class AppMemoria {
	public static void main(String[] args) throws InterruptedException {
		/**
		 * Vamos a llenar el Stack
		 */
//		metodoRecursivo();
		
		/**
		 * Vamos a llenar el Heap
		 */
//		int iteraciones = 20;
//		for (int i = 1; i < 20; i++) {
//			System.out.println("Ciclo #" + i + ". Memoria libre: " + Runtime.getRuntime().freeMemory());
//			
//			int ciclo = 2;
//			int[] arrayPesado = new int[iteraciones];
//			
//			do {
//				arrayPesado[ciclo] = 0;
//				ciclo--;
//			} while (ciclo > 0);
//			
//			iteraciones = iteraciones * 3;
//			System.out.println("\nMemoria requerida para el siguiente ciclo: " + iteraciones);
//			Thread.sleep(5000);
//		}
		
		Bicicleta bici;
		System.out.println("Memoria antes del ciclo: " + Runtime.getRuntime().freeMemory());
		for (int i = 0; i < 999899999; i++) {
			bici = new Bicicleta("Trek", 3160000);
		}
		System.out.println("Memoria DESPUÉS del ciclo: " + Runtime.getRuntime().freeMemory());
		System.gc();
		System.out.println("Memoria DESPUÉS del Garbage Collector: " + Runtime.getRuntime().freeMemory());
	}
	
	public static void metodoRecursivo() {
		metodoRecursivo();
	}
}







