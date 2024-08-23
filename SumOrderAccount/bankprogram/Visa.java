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

    public abstract double getbalance();

    protected double withdraw(double amount) {
        double balance = getbalance();
            if (balance < amount) {
                System.out.println("insufficient amount");
                return 0;
            }
            else {
                balance = balance - amount;
                System.out.println("Your balance amount is: " + balance);
                return amount;
            }
        }
    }


