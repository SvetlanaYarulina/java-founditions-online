package ru.itsjava.statics;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String brand;
    private String color;
    private final  static double PRICE = 5000000.0;


    public double getPrice() {

        return PRICE;
    }
    public String toString(){
        return  "{ brand:" + brand + " color:" + color + " price:" + PRICE + "}";
    }

}
