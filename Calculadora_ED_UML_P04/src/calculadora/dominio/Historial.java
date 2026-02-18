package calculadora.dominio;

import java.util.ArrayList;

public class Historial {
	
	private double resultadoActual;
	ArrayList<String> historia = new ArrayList<>();
	
	public Historial() {
		this.setResultadoActual(0);
	}
	
	public Historial(double result) {
		this.setResultadoActual(result);
	}

	public double getResultadoActual() {
		return resultadoActual;
	}

	public void setResultadoActual(double resultadoActual) {
		this.resultadoActual = resultadoActual;
	}
	
	public void addHistoria(String nuevo) {
		this.historia.add(nuevo);
	}
	
	public void listHistorial() {
		for(String output : this.historia) {
			System.out.println(output);
		}
	}
	
	public void deleteHistorial() {
		this.historia.clear();
	}
	
}
