import java.util.ArrayList;

public class Bank {
    
    String name;
    ArrayList<Customer> list=new ArrayList<>();
         
    public Bank(String name){
        this.name=name;
    }
    public Customer getCustomer(String name){
        for (var l:list){
            if(l.getName().equalsIgnoreCase(name)){
                return l;
            }
        }
        System.out.printf("Customer %s does not found %n",name);
        return null;
    }

    public void addCustomer(String name, double initialDeposit){
        if (getCustomer(name)==null){
            Customer customer =new Customer(name, initialDeposit);
            list.add(customer);
            System.out.println("New customer "+customer);
        }
    }
    public void addTransaction(String name, double amount){
        Customer newCustomer= getCustomer(name);
        newCustomer.setAmount(amount);
    }
    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", list='" + list + "'" +
            "}";
    }
    public void printTransaccion(String name){
        Customer customer =getCustomer(name);
        System.out.println(customer.getName());

        for (var t:customer.transactions){
            System.out.printf("$%10.2f (%s) %n",t, t < 0 ? "debit" : "credit");
        }
    }
}
    

