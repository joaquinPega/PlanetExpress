package logica;


public class Nave {
	private Humanoide capitan;
	private Robot copiloto;
	public Nave(){
		
	}
	public Nave(Humanoide capitan){
		this.capitan = capitan;
	}
	public Nave(Humanoide capitan,Robot copiloto){
		this.capitan=capitan;
		this.copiloto = copiloto;
	}
	public Humanoide getCapitan() {
		return capitan;
	}
	public Robot getCopiloto() {
		return copiloto;
	}
	public void setCapitan(Humanoide capitan) {
		this.capitan = capitan;
	}
	public void setCopiloto(Robot copiloto) {
		this.copiloto = copiloto;
	}
	
}
