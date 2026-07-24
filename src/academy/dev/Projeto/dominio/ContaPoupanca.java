package academy.dev.Projeto.dominio;

public class ContaPoupanca extends Conta {
    public final static double RENDIMENTO_AO_MES = 0.005;
    public final static double TAXA_DE_IMPOSTO = 0;
    public ContaPoupanca(String numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }

    @Override
    public void depositar(double valor) {
     double valorComRendimento = valor + (valor * RENDIMENTO_AO_MES);
     super.depositar(valorComRendimento);
    }

    @Override
    public double taxa() {
        return 0;
    }
    public double rendimento(){
        return getSaldo() * RENDIMENTO_AO_MES;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto de 0%");
        return getSaldo() * TAXA_DE_IMPOSTO;
    }
}
