import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FirstHomeWork {

    @Test
    public void mortgageСalculation() {

        int mortgageAmount = 64800;
        double percent = 2.1;
        double monthlyPayment = 242.77;
        int periodInYears = 30;

        double finalAmount = monthlyPayment * 12 * periodInYears;

        DecimalFormat df = new DecimalFormat("#####.##");

        System.out.println("Начальная сумма ипотеки: " + mortgageAmount + " EUR.");
        System.out.println("Процент ипотеки: " + percent + " %.");
        System.out.println("Конечная сумма, которую необходимо будет выплатить: " + (df.format(finalAmount)) + " EUR.");

        String secondTask = "Ипотека - зло!";
        System.out.println("Колличество символов в строке: " + secondTask + " = " + secondTask.length());



    }
}
