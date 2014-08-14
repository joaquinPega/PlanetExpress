package logica;

public class CargaVivaTerrestre extends CargaViva {

	public CargaVivaTerrestre(double peso, double espacio,
			double valorDeclarado,double oxigenoPorHora) {
		super(peso, espacio, valorDeclarado, oxigenoPorHora);
		this.setNivelPeligrosidad(2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValorAsegurado() {
		// TODO Auto-generated method stub
		return super.getValorAsegurado() + super.getValorAsegurado()*(1/3);
	}
	
}
