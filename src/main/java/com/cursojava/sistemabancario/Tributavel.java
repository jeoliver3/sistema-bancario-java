
package com.cursojava.sistemabancario;


public interface Tributavel {
    
    // não é necessário adicionar public abstract, pois esse já é o padrão de uma interface.
    // dentro de uma intaerface tudo é publico e abstrato
    
    double getValorImposto();
    
}
