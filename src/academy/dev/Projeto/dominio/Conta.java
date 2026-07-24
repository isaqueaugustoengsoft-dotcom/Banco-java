package academy.dev.Projeto.dominio;

import java.time.LocalDateTime;

import static academy.dev.Projeto.dominio.TiposdeOperacao.*;

public abstract class  Conta implements Tributavel {
    private String numeroConta;
    private double saldo;
    private Cliente cliente;
    private HistoricodeOperacoes historicodeOperacoes;
    private Comprovante comprovante;
    private Extrato extrato;

    public Conta(String numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.cliente = cliente;
        this.historicodeOperacoes = new HistoricodeOperacoes();
        this.comprovante = new Comprovante();
        this.extrato = new Extrato();
    }


    public void depositar( double valor){
        if(valor > 0) {
            this.saldo += valor;
            String dataHora = LocalDateTime.now().toString();

            Operacao operacao = new Operacao(DEPOSITO,valor,dataHora,"Deposito em Dinheiro");
            historicodeOperacoes.registra(operacao);
            comprovante.imprimirOperacao(operacao, this);

        }else{
            System.out.println("Erro: no Deposito");

        }
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido para saque");
            return;
        }

        if(valor > this.saldo){
            throw new SaldoInsuficienteException();
        }

        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso: " + valor);
        String dataHora = LocalDateTime.now().toString();
        Operacao operacao = new Operacao(SAQUE,valor,dataHora,"Saque em dinheiro");
        historicodeOperacoes.registra(operacao);
        comprovante.imprimirOperacao(operacao, this);
    }

    public void transferencia(Conta destino,double valor){
        if( valor <= 0) {
            System.out.println("Valor invalido para Transferencia");
            return;
        }
        if(valor > this.saldo){
            throw new SaldoInsuficienteException();
        }
        this.saldo -= valor;
        destino.saldo += valor;
        //Conta de Transferecia Saida
        String dataHora = LocalDateTime.now().toString();
        Operacao operacaoSaida = new Operacao(TRANSFERENCIA_SAIDA,valor,dataHora,"Transferencia Enviada");
        historicodeOperacoes.registra(operacaoSaida);
        comprovante.imprimirTransferencia(operacaoSaida, this, destino);
        //Conta Destino Entrada
        Operacao operacaoEntrada = new Operacao(TRANSFERENCIA_ENTRADA,valor,dataHora,"Transferencia Recebida");
        destino.historicodeOperacoes.registra(operacaoEntrada);
    }

    public void extrato(){
        extrato.imprimirExtrato(this);
    }
    public abstract double taxa();

    public HistoricodeOperacoes getHistoricodeOperacoes() {
        return historicodeOperacoes;
    }

    public void setHistoricodeOperacoes(HistoricodeOperacoes historicodeOperacoes) {
        this.historicodeOperacoes = historicodeOperacoes;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
