package calculadora.dominio;

public class Historial {
	
	private double resultadoActual;

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
	
}
