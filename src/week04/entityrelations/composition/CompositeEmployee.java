package week04.entityrelations.composition;

import week04.entityrelations.aggregation.Adress;

public class CompositeEmployee {
    private final int id;
    private final String name;
    private final Adress adress;

    public CompositeEmployee(int id, String name, String street, String city) {
        this.id = id;
        this.name = name;
        this.adress = new Adress(street,city);
    }

    @Override
    public String toString() {
        return "AggregateEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }
    private static class Adress {
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

}
