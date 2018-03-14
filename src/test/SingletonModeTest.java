package test;

import singletonMode.ChinaCountry;
import singletonMode.Country;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingletonModeTest {
    public static void main(String[] args){
        Country country = ChinaCountry.getInstance();
        String[] cities_array = new String[]{"北京","上海","广州","东北","山东"};
        List<String> cities = Arrays.asList(cities_array);
//        List<String> cities = new ArrayList<>();
//        Collections.addAll(cities,cities_array);
        country.setCities(cities);
        country.setName("中国");
        country.setPopulation(1300000000l);

        System.out.println(country.describe());

        String[] trans_array = cities.toArray(new String[cities.size()]);
        System.out.println(Arrays.toString(trans_array));
    }
}
