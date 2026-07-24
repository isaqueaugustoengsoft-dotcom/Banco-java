package academy.dev.Projeto.teste;

import academy.dev.Projeto.dominio.*;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Inter");
        Cliente cliente01 = new Cliente("Isaque","135.765.845-85");
        Cliente cliente02 = new Cliente("Ezequiel","135.865.865-55");
        Cliente cliente03 = new Cliente("Vitor","158.626.998-85");

        Conta conta1 = new ContaCorrente("1354584",cliente01);
        Conta conta2 = new ContaPoupanca("1465323",cliente02);
        Conta conta3 = new ContaSalario(" 1464823",cliente03);


        banco.registrarCliente(cliente01);
        banco.registrarCliente(cliente02);
        banco.registrarCliente(cliente03);

        banco.registrarContas(conta1);
        banco.registrarContas(conta2);
        banco.registrarContas(conta3);

        conta1.depositar(200);
        System.out.println();

        conta2.depositar(650);
        conta2.sacar(452);
        System.out.println();

        conta3.depositar(820);
        conta3.transferencia(conta1,200);

        System.out.println();

        conta1.extrato();
        conta2.extrato();

    }
}
