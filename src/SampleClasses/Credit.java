package SampleClasses;

public class Credit {

    private int rate;
    private double amount;


    public Credit(int rate, double amount) {
        this.rate = rate;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "rate=" + rate +
                ", amount=" + amount +
                '}';
    }
}
