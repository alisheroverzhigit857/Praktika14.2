public class Combain extends Tehnika {
    public Combain(String marka, double yearOfMade, String color, int price) {
        super(marka, yearOfMade, color, price);
    }

    @Override
    public String toStart() {
        return "Key";
    }

    @Override
    public String toStop() {
        return "break";
    }
}
