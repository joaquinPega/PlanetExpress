package logica;

public class CargaInerte extends Carga{

	public CargaInerte(double peso, double espacio, double valorDeclarado) {
		super(peso, espacio, valorDeclarado);
		this.setNivelPeligrosidad(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValorAsegurado() {
		// TODO Auto-generated method stub
		return this.getValorDeclarado()*1.05;
	}

}
