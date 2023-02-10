import java.time.LocalDate;

public class Tehnika {
    private  String marka;
    private double yearOfMade;
    private String color ;
    private  int price ;

    public Tehnika(String marka, double yearOfMade, String color, int price) {
        this.marka = marka;
        this.yearOfMade = yearOfMade;
        this.color = color;
        this.price = price;
    }

    public  String toStart () {
        return " ";
    }
    public String toStop () {
        return " ";
    }



    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(double yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "marka='" + marka + '\'' +
                ", yearOfMade=" + yearOfMade +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
