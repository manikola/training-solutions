package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        BankAccount current = new BankAccount("47566453-current", "John Doe", 3000);

        BankAccount savings = new BankAccount("47566453-savings", "John Doe", 6500);

        System.out.println(current.getInfo());
        System.out.println(savings.getInfo());

        System.out.println("How much would you like to deposit?");
        Scanner scanner = new Scanner(System.in);
        int depositAmount = scanner.nextInt();
        savings.deposit(depositAmount);

        System.out.println(savings.getInfo());

        System.out.println("How much would you like to withdraw?");
        Scanner scanner1 = new Scanner(System.in);
        int withdrawAmount = scanner1.nextInt();
        current.withdraw(withdrawAmount);

        System.out.println(current.getInfo());

        System.out.println("How much would you like to transfer to savings?");
        Scanner scanner2 = new Scanner(System.in);
        int transferAmount = scanner2.nextInt();
        current.transfer(savings, transferAmount);

        System.out.println(current.getInfo());
        System.out.println(savings.getInfo());






    }
}
