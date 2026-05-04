package application;

import java.util.Arrays;
import java.util.List;

import model.entities.Usuario;

public class Capitulo2 {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		for (Usuario user : usuarios) {
			System.out.println(user.getName());
		}
	}

}
