package tpo;

public interface cola_prioridad_tda {
	void inicializar();
	void vaciar_cola();
	Integer primer();
	Integer prioridad();
	void agregar(Integer x,Integer y);
	Boolean vacia();
	void restar_uno();
}
