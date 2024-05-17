package tpo;
public class conjunto implements conjunto_tda{
	clientes lista[];
	Integer cant;
	@Override
	public void inicializar() {
		lista=new clientes[100];
		cant=0;
	}
	@Override
	public Boolean conjutno_vacio() {
		return cant==0;
	}

	@Override
	public void agregar(Integer id,Integer tipo) {
		if(pertenece(id)==true) {
			lista[cant]=new clientes(id,tipo);
			cant++;
		}
	}

	@Override
	public Boolean pertenece(Integer x) {
		Integer j=0;
		while(j<cant&&lista[j].id_cliente!=x){
			j++;
		}
		return j==cant;
	}

	@Override
	public clientes elegir() {
		return lista[cant-1];
	}

	@Override
	public void sacar(clientes x) {
		Integer i=0;
		while(i<cant&&lista[i].id_cliente!=x.id_cliente) {
			i++;
		}
		if(i<cant) {
			lista[i]=lista[cant-1];
			cant--;
		}
	}
	
	public void ver() {
		for (Integer i=0;i!=cant;i++) {
			System.out.println("elemento "+i+" del conjunto  es "+lista[i].id_cliente);
		}
	}
	
}
