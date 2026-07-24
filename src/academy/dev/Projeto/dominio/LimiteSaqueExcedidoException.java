package academy.dev.Projeto.dominio;

public class LimiteSaqueExcedidoException extends RuntimeException {
    public LimiteSaqueExcedidoException(){
       super("Limite de Saque Excedido");
    }
}
