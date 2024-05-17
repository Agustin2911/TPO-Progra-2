package tpo;

public interface cola_prioridad_tda {
	public void inicializar();
	public void vaciar_cola();
	public Integer primer();
	public Integer prioridad();
	public void agregar(clientes x);
	public Boolean vacia();
	public void restar_uno();
	public clientes devolver_cliente();
}