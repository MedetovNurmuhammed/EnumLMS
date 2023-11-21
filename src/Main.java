import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите дистанцию: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println(TRansportType.BUS+ " " + TRansportType.BUS.calculateTravelCost(a)+"$");
        System.out.println(TRansportType.CAR+ " "+ TRansportType.TRUCK.calculateTravelCost(a)+ "$");
        System.out.println(TRansportType.CAR+ " "+TRansportType.CAR.calculateTravelCost(a)+ " $");

        }
    }
