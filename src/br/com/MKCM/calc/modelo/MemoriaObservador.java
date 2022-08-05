package br.com.MKCM.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
    void valorAlterado(String novoValor);
}
