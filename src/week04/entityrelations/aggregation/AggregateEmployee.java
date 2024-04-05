package week04.entityrelations.aggregation;

public class AggregateEmployee {
    private final int id;
    private final String name;
    private final Adress adress;

    public AggregateEmployee(int id, String name, Adress adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "AggregateEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }
}
