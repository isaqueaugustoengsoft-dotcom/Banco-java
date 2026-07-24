package academy.dev.Projeto.dominio;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class Comprovante {
    public void  imprimirOperacao(Operacao operacao , Conta conta){
        System.out.println("======================");
        System.out.println("      COMPROVANTE     ");
        System.out.println("======================");
        System.out.println("Operação: " + operacao.getTipo());
        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Cliente: " + conta.getCliente().getNome());
        System.out.println("valor: " + formatarValor(operacao.getValor()));
        System.out.println("Saldo: " + formatarValor(conta.getSaldo()));
        System.out.println("Data/Hora: " + formatarData(operacao.getDatahora()));
        System.out.println("Descrição: " + operacao.getDescricao());
        System.out.println("========================");
    }
    public void imprimirTransferencia(Operacao operacao, Conta origem, Conta destino){
        System.out.println("======================");
        System.out.println("      COMPROVANTE DE TRANSFERENCIA    ");
        System.out.println("======================");
        System.out.println("Operação: " + operacao.getTipo());
        System.out.println("Conta Origem: " + origem.getNumeroConta());
        System.out.println("Cliente Origem: " + origem.getCliente().getNome());
        System.out.println("Conta Destino: " + destino.getNumeroConta());
        System.out.println("Cliente Destino: " + destino.getCliente().getNome());
        System.out.println("Valor: " + formatarValor(operacao.getValor()));
        System.out.println("Saldo Origem: " + formatarValor(origem.getSaldo()));
        System.out.println("Saldo Destino: " + formatarValor(destino.getSaldo()));
        System.out.println("Data/Hora: " + formatarData(operacao.getDatahora()));
        System.out.println("Descrição: " + operacao.getDescricao());
        System.out.println("========================");
    }
    private String formatarData(String dataHora){
        LocalDateTime data = LocalDateTime.parse(dataHora);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return data.format(formato);
    }
    private String formatarValor(double valor){
        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formato.format(valor);
    }
}
