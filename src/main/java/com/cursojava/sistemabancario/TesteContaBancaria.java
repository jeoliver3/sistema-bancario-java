
package com.cursojava.sistemabancario;

public class TesteContaBancaria {
 
    public static void main(String[] args) {
        
        // passando valores no construtor, que foram gerados em ContaBancaria
        ContaBancaria cb = new ContaBancaria(1234, "234.45-0 ");
        
        System.out.println(cb.getAgencia());
        System.out.println(cb.getNumeroConta());
        
        // criando uma nova conta passando um novo num de conta ,mas a  mesma agencia
        ContaBancaria joao = new ContaBancaria( 1234, "512.133-9");
        
         cb.depositar(100);
        
        //obtendo o valor do saldo da conta
        System.out.println(cb.getSaldo());
        
       
        cb.sacar(50);
        System.out.println(cb.getSaldo());
        
        
        
        ContaBancaria contaDaJessy = new  ContaBancaria();
        contaDaJessy.depositar(1000);
        // invocação de método. Usando método transferir
        // transferindo 500 reais da conta da Jessy para ContaBancaria
        contaDaJessy.transferir(500, cb);
        System.out.println(contaDaJessy.getSaldo());
        
        // tem que ter 750, pois foi transferido 500 para conta cb
        System.out.println(cb.getSaldo());
        
        Cliente cliente = new Cliente();
        cliente.setNome("JessyJane");
        cliente.setCpf("288.999.000-00");
        cliente.setProfissao("empresaria");
        
        
        //associa cliente a ContaBancaria
        cb.setTitular(cliente);
        System.out.println(cb.getTitular().getNome());
        
        
        //instanciando ContaCorrente
        ContaCorrente cc = new ContaCorrente(2337, "2556-0");
        //depositando na conta corrente
        cc.depositar(300);
        
        //instanciando ContaPoupanca
        ContaPoupanca cp = new ContaPoupanca(5667,"1966-2");
        //depositando na conta poupanca
        cp.depositar(200);
        
        
        ContaCorrente marcela = new ContaCorrente(2337, "2345-9");
        System.out.println(marcela.getNumeroConta());
        
        //transferindo valor de conta corrente para conta da marcela
        cc.transferir(100, marcela);
        System.out.println(marcela.getSaldo());
        // executando para ver saldo de conta corrente que agora dever ser 200
        System.out.println(cc.getSaldo());
        // sacando 50 reais, vai executar com menos 20 centavos de taxa
        cc.sacar(50);
        System.out.println(cc.getSaldo());
        
        SeguroDeVida seguro = new SeguroDeVida();
        CalculadoraDeImposto calc = new CalculadoraDeImposto();
        calc.registrar(cc); // ContaCorrente implementa de Tributavel
        calc.registrar(seguro);// SeguroDeVida implementa de Tributavel
        
        System.out.println(calc.getTotalImposto());
        
    }
}
