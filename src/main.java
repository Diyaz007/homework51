import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        City city1 = new City("1","1",1,1);
        City city2 = new City("2","2",2,2);
        City city3 = new City("3","3",3,3);
        City city4 = new City("4","4",4,4);
        City city5 = new City("5","5",5,5);
        City city6 = new City("6","6",6,6);
        City city7 = new City("7","7",7,7);
        City city8 = new City("8","8",8,8);
        City city9 = new City("9","9",9,9);
        City city10 = new City("10","10",10,10);

        ArrayList<City> cities = new ArrayList<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);
        cities.add(city6);
        cities.add(city7);
        cities.add(city8);
        cities.add(city9);
        cities.add(city10);

        HashSet<City> cityHashSet = new HashSet<>();
        Set<City> cityTreeSet = new TreeSet<>();

        for (City city:cities) {
            if(city.getCityNum() % 2 == 0){
                cityHashSet.add(city);
            }else {
                cityTreeSet.add(city);
            }
        }

        System.out.println("HashSet:\n"+cityHashSet);
        System.out.println("TreeSet:\n"+cityTreeSet);
    }
}
