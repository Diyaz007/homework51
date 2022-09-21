public class City implements Comparable<City>{
    private String name;
    private String nameCountry;
    private Integer cityNum;
    private Integer countryNum;

    public City(String name, String nameCountry, int cityNum, int countryNum) {
        this.name = name;
        this.nameCountry = nameCountry;
        this.cityNum = cityNum;
        this.countryNum = countryNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getCityNum() {
        return cityNum;
    }

    public void setCityNum(int cityNum) {
        this.cityNum = cityNum;
    }

    public int getCountryNum() {
        return countryNum;
    }

    public void setCountryNum(int countryNum) {
        this.countryNum = countryNum;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", nameCountry='" + nameCountry + '\'' +
                ", cityNum=" + cityNum +
                ", countryNum=" + countryNum +
                '}';
    }

    @Override
    public int compareTo(City o) {
        int hash = this.cityNum.compareTo(o.cityNum);
        return hash;
    }
}
