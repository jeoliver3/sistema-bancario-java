
package com.cursojava.sistemabancario;


public class CalculadoraDeImposto {
    
    private double totalImposto;
    
    public void registrar(Tributavel t){
    
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    
    }
        
    public double getTotalImposto()
    {
        return totalImposto;
    }
    
}
