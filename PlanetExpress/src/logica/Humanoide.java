package logica;

public class Humanoide {
	private String nombre;
	private boolean disponible;
	public Humanoide(String nombre){
		this.nombre=nombre;
		disponible=true;
	}
	
	public String getNombre() {
		return nombre;
	}

	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
}
