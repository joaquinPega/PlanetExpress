package logica;

public abstract class Carga {
	private double peso;
	private double espacio;
	private double valorDeclarado;
	private int nivelPeligrosidad;
	public Carga(double peso, double espacio, double valorDeclarado) {
		super();
		this.peso = peso;
		this.espacio = espacio;
		this.valorDeclarado = valorDeclarado;
	}
	public abstract double getValorAsegurado();
	public double getPeso() {
		return peso;
	}
	public double getEspacio() {
		return espacio;
	}
	public double getValorDeclarado() {
		return valorDeclarado;
	}
	public int getNivelPeligrosidad() {
		return nivelPeligrosidad;
	}
	public void setNivelPeligrosidad(int nivelPeligrosidad){
		this.nivelPeligrosidad=nivelPeligrosidad;
	}
	
}
