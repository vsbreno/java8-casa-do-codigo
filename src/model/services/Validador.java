package model.services;

@FunctionalInterface
public interface Validador <T>{
	
	boolean valida(T t);
}
