package singletonMode;

import java.util.List;

public abstract class Country {
    private String name;
    private List<String> cities;
    private Long population;

    protected Country(){}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public abstract String describe();

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", cities=" + cities +
                ", population=" + population +
                '}';
    }
}
