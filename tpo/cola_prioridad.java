package tpo;

class valor{
	Integer contenido;
	Integer prioridad;
	
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
		return lista[0].contenido;
	};
	public Integer prioridad() {
		return lista[0].prioridad;
	};
	
	public void agregar(Integer x, Integer y) {
		int j= indice;
		for(;j>0 && lista[j-1].prioridad>=y;j--) {
			lista[j]=lista[j-1];
		}
		lista[j]=new valor(x,y);
		indice++;
	}
	public void mostrar() {
		for(Integer i =0;i!=indice;i++) {
			System.out.println("este es el valor "+ lista[i].contenido+ " esta es la prioridad "+ lista[i].prioridad);
			
		}
	}
	public Boolean vacia() {
		return indice==0;
	};
	public void restar_uno() {
		indice-=1;
	};
}
