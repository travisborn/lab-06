package com.example.listycity;

/**
 * This is a class that defines a city.
 */
public class City implements Comparable{
    private String city;
    private String province;
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method compares cities based on city name field
     * @return -1 if caller is greater than the city name field of the called city object.
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o; // typecasts object o to city type
        return this.city.compareTo(city.getCity());
    }
}

