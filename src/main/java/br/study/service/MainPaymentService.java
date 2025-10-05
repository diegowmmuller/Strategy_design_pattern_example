package br.study.service;

import br.study.service.strategy.CreditCardPaymentStrategy;
import br.study.service.strategy.PaymentStrategy;
import br.study.service.strategy.PaypalPaymentStrategy;
import br.study.service.strategy.PixPaymentStrategy;

import java.util.Map;
import java.util.logging.Logger;

public class MainPaymentService implements PaymentService{

    private final Logger logger = Logger.getLogger(MainPaymentService.class.getName());

    Map<String, PaymentStrategy> strategies = Map.of(
            "credit card", new CreditCardPaymentStrategy(),
            "pix", new PixPaymentStrategy(),
            "paypal", new PaypalPaymentStrategy());

    public void sendPayment(String strategy, String destination, Double amount){
        strategies.get(strategy).sendPayment(destination, amount);
    }
}
