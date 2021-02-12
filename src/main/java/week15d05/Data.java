package week15d05;

public class Data {

    private String country;
    private int weeklyCases;
    private int population;

    public Data(String country, int weeklyCases, int population) {
        this.country = country;
        this.weeklyCases = weeklyCases;
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public int getWeeklyCases() {
        return weeklyCases;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return  country + " " + weeklyCases + " " + population;
    }
}
