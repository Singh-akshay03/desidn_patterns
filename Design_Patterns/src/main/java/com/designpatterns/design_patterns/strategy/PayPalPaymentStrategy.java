package com.designpatterns.design_patterns.strategy;

public class PayPalPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment of "+ amount+" is done via PayPal");
    }
}
