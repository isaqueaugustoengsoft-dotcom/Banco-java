#  Banco-Java

Sistema Bancário desenvolvido em Java com foco na prática de Programação Orientada a Objetos (POO). O projeto simula operações bancárias como criação de contas, depósitos, saques, transferências, cálculo de impostos e registro de operações.
##  Funcionalidades

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

##  Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- IntelliJ IDEA
- Git
- GitHub

##  Conceitos Aplicados

- Encapsulamento
- Herança
- Polimorfismo
- Classes Abstratas
- Interfaces
- Exceções Personalizadas
- Enumerações (Enum)
- Coleções (`ArrayList`)
- Organização em pacotes

##  Estrutura do Projeto

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

##  Como Executar

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


## Futuras Melhorias
O projeto continuará sendo desenvolvido com o objetivo de aumentar sua complexidade e aplicar novos conceitos de desenvolvimento Java.
Entre as melhorias planejadas estão:

- Implementação de persistência de dados em banco de dados
-  Integração com MySQL ou PostgreSQL
-  Criação de uma API REST utilizando Spring Boot 
- Implementação de autenticação e controle de acesso
-  Criação de uma interface gráfica ou aplicação web
-  Implementação de testes unitários e testes de integração
-  Utilização de JUnit e Mockito
-  Implementação de logs para acompanhamento das operações
-  Melhorias na validação de CPF e dados dos clientes
-  Aprimoramento do sistema de extrato e histórico de operações
-  Implementação de novas modalidades de contas e serviços bancários
-  Aplicação de padrões de projeto (Design Patterns)
-  Melhor separação entre as camadas de domínio, serviço e infraestrutura
-  Documentação da API utilizando Swagger/OpenAPI
-  Containerização da aplicação utilizando Docker

## Objetivo do Projeto
O principal objetivo é utilizar o projeto como forma de estudo e evolução prática em Java, aplicando conceitos de Programação Orientada a Objetos e, posteriormente, conhecimentos relacionados ao desenvolvimento de aplicações reais.

O projeto será atualizado progressivamente conforme novos conhecimentos forem adquiridos durante os estudos.



##  Autor

**Isaque Augusto**

- Estudante de Engenharia de Software
- Desenvolvedor Java
- GitHub: https://github.com/isaqueaugustoengsoft-dotcom
