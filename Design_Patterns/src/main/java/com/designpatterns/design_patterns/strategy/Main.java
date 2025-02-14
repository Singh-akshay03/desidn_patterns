package com.designpatterns.design_patterns.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategyContext paymentStrategyContext = new PaymentStrategyContext();
        paymentStrategyContext.setPaymentStrategy(new CreditCardPaymentStrategy());
        paymentStrategyContext.pay(100);
        paymentStrategyContext.setPaymentStrategy(new PayPalPaymentStrategy());
        paymentStrategyContext.pay(100);
        paymentStrategyContext.setPaymentStrategy(new UPIPaymentStrategy());
        paymentStrategyContext.pay(1000);
    }
}
