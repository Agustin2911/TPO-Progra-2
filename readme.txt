Conjuntos TDA:
public void inicializar() {
		lista=new clientes[100];  asignacion de objeto=o(1)
		cant=0;                   asignacion de valor=o(1)
}                             o(1)+o(1)=o(1)

public Boolean conjutno_vacio() {
		return cant==0;           retorno de una operacion logica o(1)
	}
public void agregar(Integer id,Integer tipo) {
		if(pertenece(id)==true) {              operacion logica o(1)
			lista[cant]=new clientes(id,tipo);   asignacion de elemento de la lista o(1)
			cant++;                              operacion aritmetica o(1)
		}
	}                                        o(1)+o(1)+o(1)=o(1)

public Boolean pertenece(Integer x) {
		Integer j=0;                            asignacion de valor =o(1)
		while(j<cant&&lista[j].id_cliente!=x){  bucle =o(n)
			j++;                                  operacion aritmetica=o(1)
		}
		return j==cant;                         operacion aritmetica=o(1)
	}                                         o(1)+o(n)+o(1)=o(n)

public clientes elegir() {
		return lista[cant-1];                   retorno de un elemento de la lista 0(1)
	}

public void sacar(clientes x) {
		Integer i=0;                            asignacion de valor= o(1)
		while(i<cant&&lista[i].id_cliente!=x.id_cliente) {  bucle =o(n)
			i++;                                              operacion aritmetica=o(1)
		}
		if(i<cant) {                                         operacion aritmetica= o(1)
			lista[i]=lista[cant-1];                            asignacion de valor= o(1)
			cant--;                                            operacion aritmetica= o(1)
		}
	}                                                      o(1)+o(n)+o(1)+o(1)+o(1)=o(n)

public void ver() {
		for (Integer i=0;i!=cant;i++) { o(n)
			System.out.println("elemento "+i+" del conjunto  es "+lista[i].id_cliente);o(1)
		}
	}                                                      o(n)+o(1)=o(n)

Cola con prioridad:
