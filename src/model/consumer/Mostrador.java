package model.consumer;

import java.util.function.Consumer;

import model.entities.Usuario;

public class Mostrador implements Consumer<Usuario>{

	@Override
	public void accept(Usuario usuario) {
		System.out.println(usuario.getName());
	}
}
