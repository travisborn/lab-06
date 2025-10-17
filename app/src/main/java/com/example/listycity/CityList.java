package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class holds our City type objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This method adds a City type object to the cities list.
     *
     * @param city: the object to add
     */
    public void add(City city) {
        if (cities.contains(city))
            throw new IllegalArgumentException();
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * implement the hasCity method, may need to override the equalsTo method.
     * When given a city, return whether or not it belongs in the list.
     */
    public boolean hasCity(City city){

    }
}


