Conjuntos TDA:
public void inicializar() {
		lista=new clientes[100];  asignacion de objeto = O(1)
		cant=0;                   asignacion de valor = O(1)
}                             O(1) + O(1) = O(1)

public Boolean conjutno_vacio() {
		return cant==0;           retorno de una operacion logica = O(1)
	}
public void agregar(Integer id,Integer tipo) {
		if(pertenece(id)==true) {              operacion logica = O(1)
			lista[cant]=new clientes(id,tipo);   asignacion de elemento de la lista = O(1)
			cant++;                              operacion aritmetica = O(1)
		}
	}                                        O(1) + O(1) + O(1) = O(1)

public Boolean pertenece(Integer x) {
		Integer j=0;                            asignacion de valor = O(1)
		while(j<cant&&lista[j].id_cliente!=x){  bucle (recorre todos los elementos) = O(n)
			j++;                                  operacion aritmetica = O(1)
		}
		return j==cant;                         operacion aritmetica = O(1)
	}                                         O(1) + O(n) * (O(1)) + O(1) = O(n)

public clientes elegir() {
		return lista[cant-1];                   retorno de un elemento de la lista = O(1)
	}

public void sacar(clientes x) {
		Integer i=0;                            asignacion de valor = O(1)
		while(i<cant&&lista[i].id_cliente!=x.id_cliente) {  bucle (recorre todos los elementos) = O(n)
			i++;                                              operacion aritmetica = O(1)
		}
		if(i<cant) {                                         operacion aritmetica = O(1)
			lista[i]=lista[cant-1];                            asignacion de valor = O(1)
			cant--;                                            operacion aritmetica = O(1)
		}
	}                                                      O(1) + O(n) * (O(1)) + O(1) + O(1) + O(1) = O(n)

public void ver() {
		for (Integer i=0;i!=cant;i++) { bucle (recorre todos los elementos) = O(n)
			System.out.println("elemento "+i+" del conjunto  es "+lista[i].id_cliente); imprimir elemento = O(1)
		}
	}                                                      O(n) * O(1) = O(n)




Cola con Prioridad TDA:
	public void inicializar() {
		lista=new clientes[100];           asignacion de objeto O(1)
		indice=0;                          asignacion de valor O(1)
	};                                         O(1) + O(1) = O(1)

	public void vaciar_cola() {
		indice=0;                          asignacion de valor O(1)
	};

	public Integer primer(){
		return lista[indice-1].id_cliente;    acceder a elemento de lista O(1)
	};
	
	public Integer prioridad() {
		return lista[indice-1].tipo_cliente;   acceder a elemento de lista O(1)
	};
	
	public void agregar(clientes x) {
		int j= indice;                      asignacion de valor = O(1)
		for(;j>0 && lista[j-1].tipo_cliente<x.tipo_cliente;j--) {   bucle (desplaza todos los elementos) = O(n)
			lista[j]=lista[j-1];        asignacion de valor = O(1)
		}
		lista[j]=x;                         asignacion de valor = O(1)
		indice++;                           operacion aritmetica = O(1)
	}                                           O(1) + (O(n) * O(1)) + O(1) + O(1) = O(n)

	public void mostrar() {
		for(Integer i =indice-1;i!=-1;i--) {   bucle (recorre todos los elementos) = O(n)
			System.out.println("este es el valor "+ lista[i].id_cliente+ " esta es la prioridad "+ lista[i].tipo_cliente);
                                                                                       imprimir elemento = O(1)
			
		}
	}                                            O(n) * O(1) = O(n)

	public Boolean vacia() {
		return indice==0;                    operacion logica = O(1)
	};
	
	public void restar_uno() {
		indice--;                            operacion aritmetica = O(1)
	};
	
	public clientes devolver_cliente() {
		return lista[indice-1];             acceder a elemento de lista = O(1)
	}
}

main:
public static void  main(String[]agrs) {
	ConjuntoInicial.inicializar(); 			llamada a metodo= O(1)
	ConjuntoEmpresa.inicializar();			llamada a metodo = O(1)
	ConjuntoParticularCliente.inicializar();	llamada a metodo = O(1)
	ConjuntoParticularNoCliente.inicializar();	llamada a metodo = O(1)
	cola_prioridad cola=new cola_prioridad();	asignacion de objeto = O(1)
	cola.inicializar();				llamada a metodo = O(1)
	ConjuntoInicial.agregar(1,2);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(2,2);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(3,1);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(4,3);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(5,1);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(6,2);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(7,3);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(8,1);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(9,2);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(10,1);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(11,2);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(12,3);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(13,3);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(14,3);			llamada a metodo = O(1)
	ConjuntoInicial.agregar(15,1);			llamada a metodo = O(1)
	while(!ConjuntoInicial.conjutno_vacio()) {	bucle = o(n)
		cola.agregar(ConjuntoInicial.elegir());		llamada a metodo =o(1)
		ConjuntoInicial.sacar(ConjuntoInicial.elegir());	llamada a metodo=o(1)
	}	
	cola.mostrar();					llamada a metodo = o(n)
	atender_clientes(cola);				llamda a metodo atender=o(n)
	ConjuntoEmpresa.ver();				llamda a metodo=o(n)
	ConjuntoParticularCliente.ver();		llamda a metodo=o(n)
	ConjuntoParticularNoCliente.ver();		llamda a metodo=o(n)
}							o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(1)+o(n)+0(1)+o(1)+o(n)+o(n)+o(n)+o(n)+o(n)=o(n)

	
private static void ingresar_al_conjunto(clientes x){
	if(x.tipo_cliente==1) {					operacion aritmetica =o(1)
		ConjuntoEmpresa.agregar(x.id_cliente,x.tipo_cliente);	llamada a metodo=o(1)
	}
	else if (x.tipo_cliente==2) {				operacion aritmetica =o(1)
		ConjuntoParticularCliente.agregar(x.id_cliente,x.tipo_cliente);llamada a metodo=o(1)
	}
	else if (x.tipo_cliente==3) {				operacion aritmetica =o(1)
		ConjuntoParticularNoCliente.agregar(x.id_cliente,x.tipo_cliente);llamada a metodo=o(1)
	}
								o(1)+o(1)+o(1)+o(1)+o(1)+o(1)=o(1)
}
	
private static void atender_clientes(cola_prioridad x){
	while(!x.vacia()) {					bucle = o(n)
		ingresar_al_conjunto(x.devolver_cliente());	llamada a metodo=o(n)
		x.restar_uno();					llamada a metodo=o(1)
	}							o(n)+o(n)+o(1)=o(n)
}
	
