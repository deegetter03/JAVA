package projectATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double calculateCheckingWithdraw(double amount) {
        checkingBalance -= amount;
        return checkingBalance;
    }

    public double calculateSavingWithdraw(double amount) {
        savingBalance -= amount;
        return savingBalance;
    }

    public double calculateCheckingDeposit(double amount) {
        checkingBalance += amount;
        return checkingBalance;
    }

    public double calculateSavingDeposit(double amount) {
        savingBalance += amount;
        return savingBalance;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
        System.out.print("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0) {
            calculateCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
        System.out.print("Amount you want to deposit to Checking Account: ");
        double amount = input.nextDouble();

        if (amount >= 0) {
            calculateCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
        } else {
            System.out.println("Cannot deposit negative amount." + "\n");
        }
    }

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
        System.out.print("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0) {
            calculateSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
        System.out.print("Amount you want to deposit to Saving Account: ");
        double amount = input.nextDouble();

        if (amount >= 0) {
            calculateSavingDeposit(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
        } else {
            System.out.println("Cannot deposit negative amount." + "\n");
        }
    }
}