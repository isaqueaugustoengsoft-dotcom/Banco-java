package academy.dev.Projeto.dominio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarContas(Conta conta) {
        contas.add(conta);
    }

    public Cliente buscarClientePorCPF(String cpf) {
        for (Cliente c : clientes) {
            if (c.getCPF().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    public void listarContas() {
        System.out.println("=== Contas " + nome + "===");
        for (Conta i : contas) {
            System.out.println("Conta: " + i.getNumeroConta() +
                    "| " + "Saldo: " + i.getSaldo() +
                    "| " + "Cliente" + i.getCliente());
        }
    }

    public double SaldoTotal() {
        double total = 0;

        for (Conta j : contas) {
            total += j.getSaldo();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }
}

