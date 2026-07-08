import java.text.NumberFormat;
import java.util.Scanner;

public class MonthSalesApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String[] monthNames = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        double[] monthSales = {
            1500.25, 1620.75, 1784.59, 2010.30,
            1895.40, 2210.60, 2450.90, 2605.80,
            3279.62, 2900.55, 3100.10, 3335.15
        };

        double totalSales = 0;
        for (double sale : monthSales) {
            totalSales += sale;
        }

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            System.out.print("Enter month number: ");
            int month = Integer.parseInt(sc.nextLine());

            System.out.println("Sales for " +
                    monthNames[month - 1] + ": " +
                    currency.format(monthSales[month - 1]));

            System.out.print("\nContinue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }

        System.out.println("Total sales: " + currency.format(totalSales));

        sc.close();
    }
}