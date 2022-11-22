package it.develhope;

import java.util.Objects;

public class SmartphonePrice implements Cloneable{

    public String priceType;
    public double priceInEuro;

    @Override
    public SmartphonePrice clone () throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();

        return clonedSmartphonePrice;
    }

    @Override
    public String toString() {
        return priceType + priceInEuro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice smartphonePrice = (SmartphonePrice) o;
        return Objects.equals(priceType, smartphonePrice.priceType) && Objects.equals(priceInEuro, smartphonePrice.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType,priceInEuro);
    }

    public SmartphonePrice(String priceType, double priceInEuro){
        this.priceType = priceType;
        this.priceInEuro = priceInEuro;

    }

}
