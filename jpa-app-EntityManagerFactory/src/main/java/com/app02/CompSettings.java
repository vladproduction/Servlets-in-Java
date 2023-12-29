package com.app02;

import javax.persistence.Embeddable;

@Embeddable
public class CompSettings {
    private int price;
    private String title;
    private String color;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CompSettings{" +
                "price=" + price +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
