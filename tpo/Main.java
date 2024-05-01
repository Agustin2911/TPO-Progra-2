package tpo;

public class Main {
	static conjunto ConjuntoInicial=new conjunto();
	static conjunto ConjuntoEmpresa=new conjunto();
	static conjunto ConjuntoParticularCliente=new conjunto();
	static conjunto ConjuntoParticularNoCliente=new conjunto();

	public static void  main(String[]agrs) {
		ConjuntoInicial.inicializar();
		ConjuntoEmpresa.inicializar();
		ConjuntoParticularCliente.inicializar();
		ConjuntoParticularNoCliente.inicializar();
		cola_prioridad cola=new cola_prioridad();
		cola.inicializar();
		cola.agregar(1,1);
		cola.agregar(2,2);
		cola.agregar(3,3);
		cola.agregar(4,2);
		cola.agregar(5,2);
		cola.agregar(6,3);
		cola.agregar(7,1);
		cola.agregar(8,3);
		cola.agregar(9,1);
		cola.mostrar();
		atender_clientes(cola);
		ConjuntoEmpresa.ver();
		ConjuntoParticularCliente.ver();
		ConjuntoParticularNoCliente.ver();
	}

	
	private static void ingresar_al_conjunto(Integer numero,Integer prioridad){
		if(prioridad==1) {
			ConjuntoEmpresa.agregar(numero);
		}
		else if (prioridad==2) {
			ConjuntoParticularCliente.agregar(numero);
		}
		else if (prioridad==3) {
			ConjuntoParticularNoCliente.agregar(numero);
		}
	}
	
	private static void atender_clientes(cola_prioridad x){
		while(x.vacia()==false) {
			ingresar_al_conjunto(x.primer(),x.prioridad());
			x.restar_uno();
		}
	}
	
		 
	
	
}
