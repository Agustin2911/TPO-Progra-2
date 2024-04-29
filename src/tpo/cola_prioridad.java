package tpo;

class valor{
	int contenido;
	int prioridad;
	
	public valor(Integer x , Integer y){
		this.contenido=x;
		this.prioridad=y;
	}
}

public class cola_prioridad implements cola_prioridad_tda{
	valor lista[];
	Integer indice;
	
	public void inicializar() {
		lista=new valor[100];
		indice=0;
	};
	public void vaciar_cola() {
		indice=0;
	};
	public Integer primer(){
		return lista[indice-1].contenido;
	};
	public Integer prioridad() {
		return lista[indice-1].prioridad;
	};
	public void agregar(Integer x,Integer y) {
		for(Integer i=indice;i!=-1;i--) {
			if (lista[i-1].prioridad>y) {
				lista[i]=lista[i-1];
			}
			else {
				lista[i]=new valor(x,y);
			}
		}
		indice++;
	};
	public Boolean vacia() {
		return indice==0;
	};
	public void restar_uno() {
		indice-=1;
	};
}
