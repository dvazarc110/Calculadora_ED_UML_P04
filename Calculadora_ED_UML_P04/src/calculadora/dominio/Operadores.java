package calculadora.dominio;

import java.util.ArrayList;

public interface Operadores {

	double operate(ArrayList<Double> num);
	String getDescription();
	
}
