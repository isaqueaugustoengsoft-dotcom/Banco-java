package academy.dev.Projeto.dominio;

public class Operacao {
    private TiposdeOperacao tipo;
    private double valor;
    private String dataHora;
    private String descricao;


    public Operacao(TiposdeOperacao tipo, double valor, String dataHora, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = dataHora;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
         return tipo +
                " | R$ " + valor +
                " | " + dataHora +
                " | " + descricao;
         }

    public TiposdeOperacao getTipo() {
        return tipo;
    }

    public void setTipo(TiposdeOperacao tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDatahora() {
        return dataHora;
    }

    public void setDatahora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}