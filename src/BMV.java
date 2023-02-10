public class BMV extends Tehnika {
    public BMV(String marka, double yearOfMade, String color, int price) {
        super(marka, yearOfMade, color, price);
    }

    @Override
    public String toStart() {
        return "Plut";
    }

    @Override
    public String toStop() {
        return "Tormoz";
    }
}
