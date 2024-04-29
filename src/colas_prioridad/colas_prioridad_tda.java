package colas_prioridad;

public interface colas_prioridad_tda {
	void inicializar_cola();
	Boolean cola_vacia();
	void agregar_elemento(Integer x, Integer y);
	Integer primero();
	Integer primeroprioridad();
	void vaciar_cola();
	void quitar_elemento();
}
