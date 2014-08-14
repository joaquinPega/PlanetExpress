package logica;

public class Entrega {
	private Zona origen;
	private Zona destino;
	private Carga carga;
	private Nave nave;
	
	
	public Entrega(Zona origen, Zona destino, Carga carga, Nave nave) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.carga = carga;
		this.nave = nave;
	}
	public Zona getOrigen() {
		return origen;
	}
	public Zona getDestino() {
		return destino;
	}
	public Carga getCarga() {
		return carga;
	}
	public Nave getNave() {
		return nave;
	}
	public double getCosto(){
		return ((carga.getValorDeclarado() + carga.getValorAsegurado())*destino.getImpuesto())+destino.getCostoAsociado();
	}
	
}
