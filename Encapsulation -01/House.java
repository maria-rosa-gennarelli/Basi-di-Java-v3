package it.develhope.incapsulamento01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class House {

    private int floorsNumber;
    private String address;
    private String [] residentNames;


    @Override
    public String toString() {
        return "House{" +
                "floorsNumber=" + floorsNumber +
                ", address='" + address + '\'' +
                '}';
    }

}
