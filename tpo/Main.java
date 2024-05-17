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
		ConjuntoInicial.agregar(1,2);
		ConjuntoInicial.agregar(2,2);
		ConjuntoInicial.agregar(3,1);
		ConjuntoInicial.agregar(4,3);
		ConjuntoInicial.agregar(5,1);
		ConjuntoInicial.agregar(6,2);
		ConjuntoInicial.agregar(7,3);
		ConjuntoInicial.agregar(8,1);
		ConjuntoInicial.agregar(9,2);
		ConjuntoInicial.agregar(10,1);
		ConjuntoInicial.agregar(11,2);
		ConjuntoInicial.agregar(12,3);
		ConjuntoInicial.agregar(13,3);
		ConjuntoInicial.agregar(14,3);
		ConjuntoInicial.agregar(15,1);
		while(!ConjuntoInicial.conjutno_vacio()) {
			cola.agregar(ConjuntoInicial.elegir());
			ConjuntoInicial.sacar(ConjuntoInicial.elegir());
		}
		cola.mostrar();
		atender_clientes(cola);
		ConjuntoEmpresa.ver();
		ConjuntoParticularCliente.ver();
		ConjuntoParticularNoCliente.ver();
	}

	
	private static void ingresar_al_conjunto(clientes x){
		if(x.tipo_cliente==1) {
			ConjuntoEmpresa.agregar(x.id_cliente,x.tipo_cliente);
		}
		else if (x.tipo_cliente==2) {
			ConjuntoParticularCliente.agregar(x.id_cliente,x.tipo_cliente);
		}
		else if (x.tipo_cliente==3) {
			ConjuntoParticularNoCliente.agregar(x.id_cliente,x.tipo_cliente);
		}
	}
	
	private static void atender_clientes(cola_prioridad x){
		while(!x.vacia()) {
			ingresar_al_conjunto(x.devolver_cliente());
			x.restar_uno();
		}
	}
	
		 
	
	
}
