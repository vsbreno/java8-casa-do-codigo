package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import model.entities.Usuario;

public class Capitulo2 {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		Consumer<Usuario> mostrador = new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getName());
			}
		};
		
		usuarios.forEach(mostrador);
	}
 }
