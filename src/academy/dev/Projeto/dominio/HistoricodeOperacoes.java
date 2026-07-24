package academy.dev.Projeto.dominio;

import java.util.ArrayList;
import java.util.List;

public class HistoricodeOperacoes {
         private List<Operacao> operacoes = new ArrayList<>();

         public void registra(Operacao operacao){
             operacoes.add(operacao);
         }
         public List<Operacao> getOperacoes(){
             return operacoes;
         }
}

