package tpo;



public class cola_prioridad implements cola_prioridad_tda{
	clientes lista[];
	Integer indice;
	
	public void inicializar() {
		lista=new clientes[100];
		indice=0;
	};
	public void vaciar_cola() {
		indice=0;
	};
	public Integer primer(){
		return lista[indice-1].id_cliente;
	};
	
	public Integer prioridad() {
		return lista[indice-1].tipo_cliente;
	};
	
	public void agregar(clientes x) {
		int j= indice;
		for(;j>0 && lista[j-1].tipo_cliente<=x.tipo_cliente;j--) {
			lista[j]=lista[j-1];
		}
		lista[j]=x;
		indice++;
	}
	public void mostrar() {
		for(Integer i =0;i!=indice;i++) {
			System.out.println("este es el valor "+ lista[i].id_cliente+ " esta es la prioridad "+ lista[i].tipo_cliente);
			
		}
	}
	public Boolean vacia() {
		return indice==0;
	};
	
	public void restar_uno() {
		indice--;
	};
	
	public clientes devolver_cliente() {
		return lista[indice-1];
	}
}
