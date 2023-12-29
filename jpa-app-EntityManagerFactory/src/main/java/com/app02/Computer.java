package com.app02;

import javax.persistence.*;

@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Embedded
    private CompSettings compSettings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompSettings getCompSettings() {
        return compSettings;
    }

    public void setCompSettings(CompSettings compSettings) {
        this.compSettings = compSettings;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", compSettings=" + compSettings +
                '}';
    }
}
