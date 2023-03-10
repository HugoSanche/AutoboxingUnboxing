public class TestBank {
    public static void main(String[] args) {
        Bank newBank=new Bank("Bancomer");
        newBank.addCustomer("Hugo", 100.00);
        System.out.println(newBank);
        newBank.addTransaction("Hugo", 50.00);
        newBank.addTransaction("Hugo", 25.00);

        newBank.printTransaccion("Hugo");
    }
 

    }

