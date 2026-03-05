package com.example.listcity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    /**
     * The name of the city.
     */
    private String city;
    /**
     * The name of the province where the city is located.
     */
    private String province;

    /**
     * This is a constructor for City.
     * @param city The name of the city.
     * @param province The name of the province.
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This returns the city name.
     * @return The city name.
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This returns the province name.
     * @return The province name.
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This compares two cities for equality.
     * @param o The object to compare with.
     * @return True if the cities are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    /**
     * This returns the hash code for the city.
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }

    /**
     * This compares two cities for ordering.
     * @param o The object to compare with.
     * @return A negative integer, zero, or a positive integer as this object is less than,
     * equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}
