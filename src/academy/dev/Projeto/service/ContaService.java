package academy.dev.Projeto.service;

import academy.dev.Projeto.dominio.Conta;

public class ContaService {
    public void depositar(Conta conta, double valor){
           conta.depositar(valor);
    }
    public void sacar(Conta conta,double valor){
         conta.sacar(valor);
    }
    public void transferencia(Conta origem, Conta destino,double valor){
        origem.transferencia(destino, valor);
    }
}
