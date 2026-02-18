package calculadora.dominio;

import java.util.ArrayList;

public enum TipoOperador implements Operadores{

	SUMA("+"){

		@Override
		public double operate(ArrayList<Double> num) {
			
			return num.get(0) + num.get(1);
		}
	},
	RESTA("-"){

		@Override
		public double operate(ArrayList<Double> num) {
			
			return num.get(0) - num.get(1);
		}
		
	},
	MULTIPLICACION("*"){

		@Override
		public double operate(ArrayList<Double> num) {
			
			return num.get(0) * num.get(1);
		}
		
	},
	DIVISION("/"){

		@Override
		public double operate(ArrayList<Double> num) {
			
			return num.get(0) / num.get(1);
		}
		
	};

	private final String description;
	
	TipoOperador(String string) {
		this.description = string;
	}
	
	@Override
	public String getDescription() {
		
		return description;
	}
	
}
