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
		for(;j>0 && lista[j-1].tipo_cliente<=x.tipo_cliente;j--) {   bucle (desplaza todos los elementos) = O(n)
			lista[j]=lista[j-1];        asignacion de valor = O(1)
		}
		lista[j]=x;                         asignacion de valor = O(1)
		indice++;                           operacion aritmetica = O(1)
	}                                           O(1) + (O(n) * O(1)) + O(1) + O(1) = O(n)

	public void mostrar() {
		for(Integer i =0;i!=indice;i++) {   bucle (recorre todos los elementos) = O(n)
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
