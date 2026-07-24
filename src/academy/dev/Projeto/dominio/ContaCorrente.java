package academy.dev.Projeto.dominio;

public class ContaCorrente extends Conta  {
    public final static double TAXA_DE_SAQUE = 0.05;
    public final static double TAXA_DE_IMPOSTO = 0.02;
    public ContaCorrente(String numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }


    @Override
    public void sacar(double valor) {
      double valorcomTaxa = valor + (valor * TAXA_DE_SAQUE);
      super.sacar(valorcomTaxa);
    }

    @Override
    public double taxa(){
        return TAXA_DE_SAQUE;
    }

    @Override
    public double calcularImposto(){
        System.out.println("Calculando Imposto de 2%");
        return getSaldo() * TAXA_DE_IMPOSTO;
    }
}
