package calculadora.dominio;

public enum TipoComando implements Comandos{

	LIST("------HISTORIAL------"),
	RESET("--HISTORIAL BORRADO--"),
	RESULT("ÚLTIMO RESULTADO: "),
	QUIT("ADIOS"),
	CALCULO("CALCULAR"),
	ERROR("ERROR");
	
	private final String description;
	
	TipoComando(String string) {
		this.description = string;
	}
	@Override
	public String getDescription() {
		return description;
	}	
}
