package br.study.service.strategy;

import java.util.logging.Logger;

public class PaypalPaymentStrategy implements PaymentStrategy{

    private final Logger logger = Logger.getLogger(PaypalPaymentStrategy.class.getName());

    @Override
    public void sendPayment(String destination, Double amount) {
        logger.info("Sending payment to destination: " + destination + " amount: " + amount);
    }
}
