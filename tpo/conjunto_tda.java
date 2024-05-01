package tpo;

public interface conjunto_tda {
	public void inicializar();
	public Boolean conjutno_vacio();
	public void agregar(Integer x);
	public Boolean pertenece(Integer x);
	public Integer elegir();
	public void sacar(Integer x);
}
