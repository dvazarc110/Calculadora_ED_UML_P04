package calculadora.app;

import java.util.ArrayList;
import java.util.List;
import calculadora.dominio.*;

public class Main {

    public static void main(String[] args) {
    	
        ConsoleInput consola = new ConsoleInput();
        Menu menu = new Menu(consola);
        Historial historial = new Historial();
        ResultadoAnalisis result;
        List<TipoOperador> ope = new ArrayList<>();
        TipoOperador calc;
        ArrayList<Double> group = new ArrayList<>();
        Analizador analyzer;
        String input, add;
        double resultado;
        int cont; 
        int order = 1;
        
        
        do {
        	add = order + ".   ";
        	resultado = 0;
        	cont = 0;
	        menu.mostrar();
	        input = menu.leerInput();
	        analyzer = new Analizador(input);	        
	        result = analyzer.analizar(input, historial.getResultadoActual());
	        
	        if((result.comando()).name() == "CALCULO") {
	        	ope = result.operadores();	
	        	
	        	for(Double nums : result.numeros()) {
	        		if (cont == 0) {
	        			resultado = nums;
	        			add = add.concat(String.valueOf(resultado) + " ");
	        		}else if (cont > 0) {
	        			group.add(resultado);
	        			group.add(nums);
	        			calc = ope.get(cont-1);
	        			add = add.concat((calc.getDescription() + " ").concat(String.valueOf(nums) + " "));
	        			resultado = calc.operate(group);
	        			group.clear();
	        		}
	        		cont++;
	        	}
	
	        	System.out.printf("Resultado: %.2f \n", resultado);
	        	historial.setResultadoActual(resultado);
	        	add = add.concat("= ".concat(String.valueOf(resultado)));
	        	historial.addHistoria(add);
	        	order++;
	        	
	        }else {
	        	switch((result.comando()).name()) {
	        		case "LIST" -> {
	        			System.out.println((result.comando()).getDescription());
	        			historial.listHistorial();
	        			System.out.printf("\nRESULTADO ACTUAL: %.2f \n", historial.getResultadoActual());
	        		}
	        		case "RESET" -> {
	        			System.out.println((result.comando()).getDescription());
	        			historial.deleteHistorial();
	        		}
	        		case "RESULT" -> {
	        			System.out.println(((result.comando()).getDescription()).concat(String.valueOf(historial.getResultadoActual())));
	        		}
	        		case "QUIT" -> System.out.println("¡Hasta la próxima!");
	        		case "ERROR" -> System.out.println("Introduzca algo válido.");
	        	}
	        }
	        System.out.println("");
	        
        }while((result.comando()).name() != "QUIT");
    }
}
