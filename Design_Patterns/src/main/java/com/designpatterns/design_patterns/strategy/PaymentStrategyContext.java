package com.designpatterns.design_patterns.strategy;


import lombok.Setter;

@Setter
public class PaymentStrategyContext {
    PaymentStrategy paymentStrategy;


    public void pay(int amount){
        paymentStrategy.pay(amount);
    }

    
}
