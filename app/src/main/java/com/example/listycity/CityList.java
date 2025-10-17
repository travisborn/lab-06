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
     * @param city the object to add
     */
    public void add(City city) {
        if (cities.contains(city))
            throw new IllegalArgumentException(city + " already exists.");
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }

    /**
     * Returns whether or not a city is present in the list.
     * @param city city to check if it's in the list.
     * @return true if the city is in the list and false if not.
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Deletes the city if it is in the list, otherwise throw exception.
     * @param city city to be deleted.
     */
    public void delete(City city){
        if (!cities.contains(city)){
            throw new IllegalArgumentException(city + " not found.");
        }
        cities.remove(city);
    }

    /**
     * Will return the number of cities in the list.
     * @return size of cities array for the count of cities.
     */
    public int countCities(){
        return cities.size();
    }
}


