import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your complete name: ");
        String name = input.nextLine();

        System.out.print("Enter your identity: ");
        String identity = input.nextLine();

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your initial deposit money: ");
        double initialDeposit = input.nextDouble();

        BankAccount account = new BankAccount(name, identity, address, age, initialDeposit);

        System.out.println("Bank account created successfully!");
    }
}

class BankAccount {
    private String name;
    private String identity;
    private String address;
    private int age;
    private double balance;

    public BankAccount(String name, String identity, String address, int age, double initialDeposit) {
        this.name = name;
        this.identity = identity;
        this.address = address;
        this.age = age;
        this.balance = initialDeposit;
    }
}