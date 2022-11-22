package it.develhope;

import java.util.Objects;

public class Smartphone implements Cloneable{

    public String brandName;
    public String modelName;
    int batterymAh;

    public SmartphonePrice producerPrice;
    public SmartphonePrice retailPrice;

    @Override
    public String toString(){
        return "SMARTPHONE: " +
                 brandName +
        " -MODEL =" + modelName +
        " -BATTERY = " + batterymAh +
                " -PRODUCER PRICE = €" + producerPrice +
                " -RETAILPRICE = € " + retailPrice
        ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() !=o.getClass()) return false;
        Smartphone smartphone = (Smartphone) o;
        return Objects.equals(brandName, smartphone.brandName) && Objects.equals(modelName, smartphone.modelName)
                && Objects.equals (batterymAh, smartphone.batterymAh)  && Objects.equals (producerPrice, smartphone.producerPrice)
                && Objects.equals (retailPrice, smartphone.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();

        return clonedSmartphone;
    }

    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice){
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

}
