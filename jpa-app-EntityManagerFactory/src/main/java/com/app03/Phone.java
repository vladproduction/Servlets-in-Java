package com.app03;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Phone {

    @EmbeddedId
    private PhoneData phoneData;
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneData getPhoneData() {
        return phoneData;
    }

    public void setPhoneData(PhoneData phoneData) {
        this.phoneData = phoneData;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneData=" + phoneData +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
