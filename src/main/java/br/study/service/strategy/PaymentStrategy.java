package br.study.service.strategy;

public interface PaymentStrategy {

    void sendPayment(String destination, Double amount);
}
