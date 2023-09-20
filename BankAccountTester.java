package class23;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b=new BankAccount("marta",
                "Checking",1200000);
        System.out.println(b.getName());
        System.out.println(b.getBankAccountNumber());
        b.setName("Shawn");
        System.out.println(b.getName());
    }
}
