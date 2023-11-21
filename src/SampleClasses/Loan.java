package SampleClasses;

public class Loan {

    private int sale;
    private double price;

    public Loan(int sale, double price) {
        this.sale = sale;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Loan{" +
                "sale=" + sale +
                ", price=" + price +
                '}';
    }
}
