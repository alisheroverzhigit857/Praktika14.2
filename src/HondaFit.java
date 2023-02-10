public class HondaFit extends Tehnika {
    public HondaFit(String marka, double yearOfMade, String color, int price) {
        super(marka, yearOfMade, color, price);
    }

    @Override
    public String toStart() {
        return "Key";
    }

    @Override
    public String toStop() {
        return "Break";
    }
}
