package logica;

public class Zona {
	private String nombre;
	private String codigoPostal;
	private double impuesto;
	private TipoZona tipoZona;
	
	public Zona(String codigoPostal,String nombre,TipoZona tipoZona){
		this.impuesto = 0.23;
		this.codigoPostal=codigoPostal;
		this.tipoZona = tipoZona;
	}
	
	public double getImpuesto(){
		double c=this.impuesto;
		switch(tipoZona){
		case VIA_LACTEA:
			c= this.impuesto;
			break;
		case SISTEMA_SOLAR:
			c= this.impuesto*1.5;
			break;
		}
		return c;
	}
	public double getCostoAsociado(){
		double c = 0;
		switch(tipoZona){
		case VIA_LACTEA:
			c= this.impuesto;
			break;
		case SISTEMA_SOLAR:
			c= this.impuesto*1.5;
			break;
		}
		return c;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

}
