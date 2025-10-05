package br.study.service.strategy;

import java.util.logging.Logger;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    private final Logger logger = Logger.getLogger(CreditCardPaymentStrategy.class.getName());


    @Override
    public void sendPayment(String destination, Double amount) {
        logger.info("Sending payment to destination: " + destination + " amount: " + amount);
    }
}
