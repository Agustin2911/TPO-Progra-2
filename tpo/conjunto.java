package tpo;

public class conjunto implements conjunto_tda{
	Integer lista[];
	Integer cant;
	@Override
	public void inicializar() {
		lista=new Integer[100];
		cant=0;
	}
	@Override
	public Boolean conjutno_vacio() {
		return cant==0;
	}

	@Override
	public void agregar(Integer x) {
		if(pertenece(x)==true) {
			lista[cant]=x;
			cant++;
		}
	}

	@Override
	public Boolean pertenece(Integer x) {
		Integer j=0;
		while(j<cant&&lista[j]!=x){
			j++;
		}
		return j==cant;
	}

	@Override
	public Integer elegir() {
		return lista[cant-1];
	}

	@Override
	public void sacar(Integer x) {
		int i=0;
		while(i<cant&&lista[i]!=x) {
			i++;
		}
		if(i<cant) {
			lista[i]=lista[cant-1];
			cant--;
		}
	}
	
	public void ver() {
		for (Integer i=0;i!=cant;i++) {
			System.out.println("elemento "+i+" del conjunto  es "+lista[i]);
		}
	}
	
}
