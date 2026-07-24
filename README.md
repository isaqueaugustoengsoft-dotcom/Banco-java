# 💳 Banco-Java

Sistema Bancário desenvolvido em Java com foco na prática de Programação Orientada a Objetos (POO). O projeto simula operações bancárias como criação de contas, depósitos, saques, transferências, cálculo de impostos e registro de operações.
## 🚀 Funcionalidades

- Cadastro de clientes
- Gerenciamento de contas bancárias
- Conta Corrente
- Conta Poupança
- Conta Salário
- Depósitos
- Saques
- Transferências entre contas
- Emissão de comprovantes
- Extrato de operações
- Histórico de transações
- Tratamento de exceções personalizadas
- Cálculo de impostos por tipo de conta

## 🛠️ Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- IntelliJ IDEA
- Git
- GitHub

## 📚 Conceitos Aplicados

- Encapsulamento
- Herança
- Polimorfismo
- Classes Abstratas
- Interfaces
- Exceções Personalizadas
- Enumerações (Enum)
- Coleções (`ArrayList`)
- Organização em pacotes

## 📂 Estrutura do Projeto

```text
src
└── academy
    └── dev
        └── Projeto
            ├── dominio
            │   ├── Banco.java
            │   ├── Cliente.java
            │   ├── Conta.java
            │   ├── ContaCorrente.java
            │   ├── ContaPoupanca.java
            │   ├── ContaSalario.java
            │   ├── Comprovante.java
            │   ├── Extrato.java
            │   ├── HistoricodeOperacoes.java
            │   ├── Operacao.java
            │   ├── Tributavel.java
            │   ├── TiposdeOperacao.java
            │   ├── SaldoInsuficienteException.java
            │   └── LimiteSaqueExcedidoException.java
            ├── service
            │   └── ContaService.java
            └── teste
                └── Main.java
```

## ▶️ Como Executar

1. Clone este repositório:

```bash
git clone https://github.com/isaqueaugustoengsoft-dotcom/Banco-java.git
```

2. Abra o projeto no IntelliJ IDEA.

3. Execute a classe:

```text
src/academy/dev/Projeto/teste/Main.java
```

4. O sistema será iniciado no console, permitindo testar as operações bancárias implementadas.


## 👨‍💻 Autor

**Isaque Augusto**

- Estudante de Engenharia de Software
- Desenvolvedor Java
- GitHub: https://github.com/isaqueaugustoengsoft-dotcom
- 