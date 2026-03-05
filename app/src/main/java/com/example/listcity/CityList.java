package com.example.listcity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist.
     * @param city This is a candidate city to add.
     * @throws IllegalArgumentException If the city already exists in the list.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities.
     * @return Return the sorted list.
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if a city is in the list.
     * @param city This is the city to check.
     * @return Return true if it exists, false otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This removes a city from the list if it exists.
     * @param city This is the city to remove.
     * @throws IllegalArgumentException If the city does not exist in the list.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This returns the number of cities in the list.
     * @return Return the count of cities.
     */
    public int countCities() {
        return cities.size();
    }
}
