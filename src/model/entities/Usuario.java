package model.entities;

public class Usuario {

	private String name;
	private int pontos;
	private boolean moderador;

	public Usuario() {
	}
	
	public Usuario(String name, int pontos) {
		this.name = name;
		this.pontos = pontos;
	}
	
	public Usuario(String name, int pontos, boolean moderador) {
		this.name = name;
		this.pontos = pontos;
		this.moderador = moderador;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public boolean isModerador() {
		return moderador;
	}

	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}

}
