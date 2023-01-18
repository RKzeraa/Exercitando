package br.loan;

public class Main {
    public static void main(String[] args) {

        System.out.println("Loan");
        Loan.calculate(1000, Loan.getTwoInstallments());
        Loan.calculate(1000, Loan.getThreeInstallments());
        Loan.calculate(1000, 5);
    }
}
