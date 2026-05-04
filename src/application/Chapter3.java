package application;

import model.services.Validador;

public class Chapter3 {

	public static void main(String[] args) {

		Validador<String> validadorCEP = valor -> valor.matches("[0-9]{5} - [0-9]{3}");
		
		System.out.println(validadorCEP.valida("04101-300"));
	}

}
