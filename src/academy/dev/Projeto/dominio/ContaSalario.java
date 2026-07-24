package academy.dev.Projeto.dominio;

public class ContaSalario extends Conta{
    public final static int LIMITES_DE_SAQUE = 3;
    public final static double TAXA_DE_IMPOSTO = 0.01;
    private int saquerealizados;
    public ContaSalario(String numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor)  {
        if(saquerealizados >= LIMITES_DE_SAQUE){
            throw new LimiteSaqueExcedidoException();
        }
        super.sacar(valor);
        saquerealizados++;

      }

    @Override
    public double taxa() {
        return 0;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto de 1%");
        return getSaldo() * TAXA_DE_IMPOSTO;
    }
}





