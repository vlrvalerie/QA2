import org.junit.jupiter.api.Test;

public class JavaPractice1 { //Nazvanije klass s bolshoj bukvi
    //Napisatj ljuboj koment

    @Test
    public void firstJavaCode() { //sozdali pervij testovij metod
        //rashod topliva na 100km
        Double distance = 135.7;
        Double fuelAmount = 20.00;

        double consumption = fuelAmount / distance * 100;

        //сколько на проездной в среднем в месяц

        double ticketMonthlyPrice = 50.00;
        int ridesCount = 80;

        int zojasRidesCount = 2;

        double pricePerRideForZoja = calculatePricePerRide(zojasRidesCount);
        double pricePerRide = calculatePricePerRide(ridesCount); //повторяется поэтому можно вынести как функцию

        //rezultat sout
        System.out.println("Current fuel consumption is " + consumption + ", but using Trolley it costs "
                + pricePerRide + " per one ride" + " and now Zoja spend " + pricePerRideForZoja + " per ride.");

        //начинаем сложение
        int a = 15;
        int b = 10;

        String c = "15";
        String d = "10";

        System.out.println(a + b);
        System.out.println(c + d); //склеил в строку 1510

    } //navanije metoda s malenjkoj bukvi

    //функция, которая будет делить (сумма одной поездки используя месячный проезд)
    private double calculatePricePerRide(int ridesCount) {
        final double PRICE = 50.00; //константа final

        double pricePerRide = PRICE / ridesCount;
        return pricePerRide;
    }
//private так как функция за пределами
}
