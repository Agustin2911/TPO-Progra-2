package tpo;

public class Main {
	public static void  main(String[]agrs) {
		cola_prioridad cola_priori=new cola_prioridad();
		cola_priori.inicializar();
		cola_priori.agregar(1,2);
		cola_priori.agregar(2,2);
		cola_priori.agregar(3,3);
		cola_priori.agregar(4,1);
		cola_priori.agregar(5,3);
		cola_priori.agregar(6,2);
		cola_priori.agregar(7,1);
		cola_priori.agregar(8,3);
		cola_priori.agregar(9,2);
		cola_priori.agregar(10,1);
		cola_priori.agregar(11,2);
		cola_priori.agregar(13,3);
		cola_priori.agregar(14,1);
		cola_priori.agregar(15,2);
		System.out.println(cola_priori.prioridad());
		cola_priori.mostrar();
		
	}
}
