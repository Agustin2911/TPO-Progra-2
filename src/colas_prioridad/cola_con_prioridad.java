package colas_prioridad;

public class cola_con_prioridad implements colas_prioridad_tda{
	Integer elementos[];	
	Integer prioridades[];
	Integer index;
	
	public void inicializar_cola() {
		elementos=new Integer [100];
		prioridades=new Integer [100];
		index=0;
		}
	public void agregar_elemento(Integer x ,Integer y) {
		for (Integer i=0;i!=index;i++) {
			if (prioridades[i]<y) {
				
			}
		}
	}
	
	public Boolean cola_vacia() {
		return index==0;
	}
	public void vaciar_cola() {
		index=0;
	}
	
	public void quitar_elemento() {
		index--;
	}
	
	public Integer primero() {
		return elementos[0];
	}
	public Integer primeroprioridad() {
		return prioridades[0];
	}
	
}
