package com.travelplanner.travelplanner.models;

import jakarta.persistence.*;

@Entity
@Table(name = "destinations")
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cityName;

    private String countryName;
    private double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", price=" + price +
                '}';
    }
}
