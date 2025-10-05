package br.study.service;

public interface PaymentService {

    void sendPayment(String strategy, String destination, Double amount);
}
