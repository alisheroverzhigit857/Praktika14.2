public class Traktor extends Tehnika {
    public Traktor(String marka, double yearOfMade, String color, int price) {
        super(marka, yearOfMade, color, price);
    }

    @Override
    public String toStart() {
        return "Tross";
    }

    @Override
    public String toStop() {
        return "Tormoz";
    }
}
