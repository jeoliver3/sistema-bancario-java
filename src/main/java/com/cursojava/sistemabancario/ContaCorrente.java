
package com.cursojava.sistemabancario;


public class ContaCorrente extends ContaBancaria implements Tributavel {


    
    public ContaCorrente(double agencia, String numeroConta)
    {
       // Construtores não são herdados da super classe para classes filhas. é preciso criá-los.
        super(agencia,numeroConta);
    }
    
    // sobreescrevendo o método sacar, porque para cada saque em cc, será cobrada uma taxa de 20 centavos
    @Override
    public boolean sacar(double valor) {
        
        double valorSacar = valor + 0.2;
        return super.sacar(valorSacar); 
        
    }

    // método que calcula 
    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }
    

   
}
