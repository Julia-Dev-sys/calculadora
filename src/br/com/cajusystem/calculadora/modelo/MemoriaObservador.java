package br.com.cajusystem.calculadora.modelo;


@FunctionalInterface
public interface MemoriaObservador {
	
	
	void valorAlterado(String novoValor);

}
