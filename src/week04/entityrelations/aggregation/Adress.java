package week04.entityrelations.aggregation;

public class Adress {
    private final String street;
    private final String city;

    public Adress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
