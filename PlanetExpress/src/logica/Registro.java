package logica;

import java.util.ArrayList;

public class Registro {

	public static void main(String[] args) {
		ArrayList<Entrega> entregas = new ArrayList<Entrega>();
		Zona deposito = new Zona("4500","deposito",TipoZona.SISTEMA_SOLAR);
		Zona marte = new Zona("AB84","Rover",TipoZona.SISTEMA_SOLAR);
		Zona fueraSistSolar = new Zona("Out123","Lejos",TipoZona.VIA_LACTEA);
		Nave nave = new Nave();
		Humanoide h = new Humanoide("Leila");
		Robot r = new Robot("14");
		nave.setCapitan(h);
		nave.setCopiloto(r);
		entregas.add(new Entrega(deposito,marte,new CargaViva(2,1,1500,1),nave));
		entregas.add(new Entrega(deposito,fueraSistSolar,new CargaVivaAlien(3,2,1500,12),nave));
		for(Entrega e : entregas){
			System.out.println(e.getCosto());
			System.out.println(Registro.getGanancia(e));
		}
	}
	public static double getGanancia(Entrega e){
		return e.getCosto() - e.getCarga().getValorDeclarado();
	}
}
