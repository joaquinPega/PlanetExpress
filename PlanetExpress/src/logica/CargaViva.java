package logica;

public class CargaViva extends Carga {
	private double oxigenoPorHora;

	public CargaViva(double peso, double espacio, double valorDeclarado,double oxigenoPorHora) {
		super(peso, espacio, valorDeclarado);
		this.setNivelPeligrosidad(1);
		this.oxigenoPorHora = oxigenoPorHora;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValorAsegurado() {
		// TODO Auto-generated method stub
		return 2*this.getValorDeclarado()*this.getEspacio();
	}

	public double getOxigenoPorHora() {
		return oxigenoPorHora;
	}

}
