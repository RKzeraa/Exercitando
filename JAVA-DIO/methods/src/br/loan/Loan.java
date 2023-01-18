package br.loan;

public class Loan {

    public static int getTwoInstallments() {
        return 2;
    }

    public static int getThreeInstallments() {
        return 3;
    }

    public static double getTwoInstallmentsRate() {
        return 0.3;
    }
    public static double getThreeInstallmentsRate() {
        return 0.45;
    }

    public static void calculate(double value, int installments) {

        if (installments == 2) {

            double finalValue = value + (value * getTwoInstallmentsRate());
            System.out.println("Final loan amount for 2 installments: $ "+ finalValue);
        } else if (installments == 3) {
            double finalValue = value + (value * getThreeInstallmentsRate());
            System.out.println("Final loan amount for 3 installments: $ "+ finalValue);
        } else {
            System.out.println("Quantity of installments was not accepted!");
        }
    }
}
