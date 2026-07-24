package academy.dev.Projeto.dominio;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(){
        super("Saldo Insulficente");
    }
}
