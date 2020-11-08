package finalmodifier;

public class Taxcalculator {

    public static final int VAT = 27;


    public double tax(double price) {
        return price * VAT / 100;
    }

    double priceWithTax(double price) {
        return price + price * VAT / 100;
    }

    public static void main(String[] args) {
        System.out.println("VAT tax = " + new Taxcalculator().tax(1000));
        System.out.println("Price with tax = " + new Taxcalculator().priceWithTax(1000));
    }
}
