import java.util.ArrayList;

public class Customer {
    private String name;
    private Double amount=0.0;
    ArrayList<Double> transactions=new ArrayList<>(300);


    public Customer() {
    }

    public Customer(String name, Double amount) {
        this.name = name;
        this.amount=amount;
        transactions.add(this.amount);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
        transactions.add(this.amount);
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", amount='" + getAmount() + "'" +
           // ", transactions='" + getTransactions() + "'" +
            "}";
    }

}
