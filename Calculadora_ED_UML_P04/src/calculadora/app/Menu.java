package calculadora.app;

import calculadora.dominio.ResultadoAnalisis;

public class Menu {
	private ConsoleInput consola;
	private ResultadoAnalisis analisis;
	private Analizador analyzer;
	
	public Menu(ConsoleInput consola) {
		this.consola = consola;
	}
	
	/*public void mostrar() {
	    consola.escribirLinea("=== MENÚ DE LA AGENDA ===");
	    consola.escribirLinea("1. Agregar contacto");
	    consola.escribirLinea("2. Listar contactos");
	    consola.escribirLinea("3. Buscar contactos");
	    consola.escribirLinea("4. Borrar contacto");
	    consola.escribirLinea("5. Agregar teléfono a contacto");
	    consola.escribirLinea("0. Salir");
	}*/
	
	public void mostrar() {
	    consola.escribirLinea("CALCULADORA");
	    consola.escribirLinea("-----------------");
	    consola.escribirLinea(">");
	    /*consola.escribirLinea("3. Buscar contactos");
	    consola.escribirLinea("4. Borrar contacto");
	    consola.escribirLinea("5. Agregar teléfono a contacto");
	    consola.escribirLinea("0. Salir");*/
	}
	
	public String leerInput() {
	    String input = consola.readString();
	    return input;
	}
}
