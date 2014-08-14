package logica;

public class CargaVivaAlien extends CargaViva {

	public CargaVivaAlien(double peso, double espacio, double valorDeclarado,double oxigenoPorHora) {
		super(peso, espacio, valorDeclarado,oxigenoPorHora);
		this.setNivelPeligrosidad(5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValorAsegurado() {
		// TODO Auto-generated method stub
		return super.getValorAsegurado()+(super.getValorAsegurado()*1.2);
	}

}
