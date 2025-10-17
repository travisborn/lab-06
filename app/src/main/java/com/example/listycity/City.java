package com.example.listycity;

import java.util.Objects;

/**
 * Represents a city with a name and a province.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Constructor for a City.
     * @param city the city name (e.g., Edmonton).
     * @param province the province the city is in (e.g., Alberta).
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Getter for city name.
     * @return the city name.
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter for the city name.
     * @param city new name to set as the city name.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for the province name.
     * @return the province name.
     */
    public String getProvince() {
        return province;
    }

    /**
     * Setter for the province.
     * @param province new province name to change province to.
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method compares cities based on city name field
     * Orders lexigraphically.
     * @return -1 if caller is greater than the city name field of the called city object.
     */
    @Override
    public int compareTo(City city2) {
        //City city = (City) ; // typecasts object o to city type
        return this.city.compareTo(city2.getCity());
    }

    /**
     * Two cities are equal if both their names and provinces match.
     * @param o city object.
     * @return true if two cities are equal, false if not.
     */
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (!(o instanceof City)){
            return false;
        }
        City city2 = (City) o;
        return Objects.equals(city, city2.city) && Objects.equals(province, city2.province);
    }

    /**
     * Override hashCode to be consistent with equals method override.
     * @return hash value computed from city and province.
     */
    @Override
    public int hashCode(){
        return Objects.hash(city, province);
    }
}

