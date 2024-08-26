package SumOrderAccount.bankprogram;

import java.util.Date;

public abstract class Visa {
//    String type;
//    String cardName;
//    String cvv;
//    Date expiryDate;
//    String accountHolder;
    int pin;
    String cardNumber;
    double balance;

    public abstract boolean authenticate(String cardNumber, int pin);

    public abstract double getBalance();

    protected double withdraw(double amount) {
        double balance = getBalance();
            if (balance < amount) {
                System.out.println("insufficient amount");
                return 0;
            }
            else {
                balance -= amount;
                System.out.println("Your balance amount is: " + balance);
                return amount;
            }
        }
    }


