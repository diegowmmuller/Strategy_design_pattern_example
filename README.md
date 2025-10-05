# # 💳 Simulador de Pagamentos - Strategy Pattern em Java

![Java](https://img.shields.io/badge/Java-21-blue?style=flat&logo=java)
![Design Pattern](https://img.shields.io/badge/Pattern-Strategy-orange?style=flat)
![Status](https://img.shields.io/badge/Status-Completo-brightgreen)

---

## 🚀 Visão Geral

Este projeto é um **simulador de pagamentos** desenvolvido em **Java puro**, demonstrando o uso do **Strategy Pattern** para gerenciar diferentes métodos de pagamento: **Cartão de Crédito**, **PayPal** e **PIX**.

O projeto é organizado com:
- **Interfaces** para definir contratos de serviço e estratégias de pagamento.
- **Estratégias concretas** para cada método de pagamento.
- **Controller fake** que simula a entrada de dados e delega a lógica ao serviço.
- **Serviço de pagamento** que aplica o Strategy Pattern e processa as transações.

---

## 💡 Conceito do Strategy Pattern

O **Strategy Pattern** sugere que:

- Uma tarefa ou problema pode ser resolvido de **múltiplas maneiras**.  
  Por exemplo, processar um pagamento pode ser feito via **Cartão**, **PayPal** ou **PIX**.

- Cada maneira é **encapsulada em uma classe separada**, chamada **estratégia concreta**.  
  Isso evita que uma única classe fique com muitas responsabilidades e `if/else` espalhados.

- Todas as estratégias implementam uma **interface comum** (ou classe abstrata), chamada **Strategy**.  
  A interface define os **métodos comuns** que todas as estratégias devem implementar.  
  Exemplo: `sendPayment(destination, amount)`.

- O **contexto** (ou serviço) utiliza a interface **sem se preocupar com a implementação concreta**.  
  Ele recebe a estratégia desejada e delega a execução a ela.

- Isso permite **trocar a estratégia em tempo de execução** sem alterar o contexto.

---

## 📦 Estrutura do Projeto
br/  
└── study/  
├── controller/  
│ └── PaymentController.java  
├── service/  
│ ├── PaymentService.java  
│ └── MainPaymentService.java  
└── service/strategy/  
├── PaymentStrategy.java  
├── CreditCardPaymentStrategy.java  
├── PaypalPaymentStrategy.java  
└── PixPaymentStrategy.java  
Main.java  