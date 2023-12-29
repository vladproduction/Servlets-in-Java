package com.app03;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PhoneData implements Serializable {
    private static final long serialVersionUID = -7878154211119738369L;
    private int price;
    private int year;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "PhoneData{" +
                "price=" + price +
                ", year=" + year +
                '}';
    }
}
