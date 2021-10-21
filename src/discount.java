package com.kodluyoruzTubaAcar;
import java.util.List;

public class Discount{
    public boolean PercentageDiscount(CheckoutItem checkoutItem) {
        return checkoutItem.getProduct()>1000;
    }
    public boolean Buy2Take3Discount(CheckoutItem checkoutItem) {
        return checkoutItem>=5;
    }
}
