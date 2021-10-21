package com.kodluyoruzTubaAcar;

public class Payment {
    public class Factory {
        System.out.println("select a payment method");
        return payment.get(type);
    }
}
public class Cash implements Payment {
    public void pay(Checkout checkout) {
        System.out.println("You will pay total");
    }
    public PaymentType getType() {
        return PaymentType.CASH;
    }
}
public class CreditCard implements Payment {
    public CreditCard(DiscountProperties discountProperties) {
        this.discountProperties = discountProperties;
    }
    public void pay(Checkout checkout) {
        double newPrice = currentPrice+(currentPrice*discountProperties.getCreditCartCommission()/100);
        checkout.setTotalPrice(newPrice);
    }
    public PaymentType getType() {
        return PaymentType.CREDIT_CARD;
    }
}
}

