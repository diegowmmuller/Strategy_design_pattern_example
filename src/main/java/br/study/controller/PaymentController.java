package br.study.controller;

import br.study.service.MainPaymentService;
import br.study.service.PaymentService;

public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService service){
        this.paymentService = service;
    }

    public void processPayment(String strategy, String destination, Double amount) {
        paymentService.sendPayment(strategy, destination, amount);
    }
}
