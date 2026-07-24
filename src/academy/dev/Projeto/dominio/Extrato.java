package academy.dev.Projeto.dominio;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class Extrato {
    public void  imprimirExtrato(Conta conta){
        System.out.println("===================");
        System.out.println("      EXTRATO       ");
        System.out.println("===================");
        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Cliente: " + conta.getCliente().getNome());
        System.out.println("====================");

        List<Operacao> operacoes = conta.getHistoricodeOperacoes().getOperacoes();
        for(Operacao op : operacoes){
            System.out.println("Operação: " + op.getTipo());
            System.out.println("Valor: " + formatarValor(op.getValor()));
            System.out.println("Data/Hora: " + formatarData(op.getDatahora()));
            System.out.println("Descrição: " + op.getDescricao());
            System.out.println("-------------------");

              }

           System.out.println();
           System.out.println("--------------------");
           System.out.println("Saldo Final: " + formatarValor(conta.getSaldo()));
           System.out.println("====================");
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


