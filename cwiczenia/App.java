import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Aplikacja sprawdzająca czy podana liczba jest liczbą parzystą lub nieparzystą.");

        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        number = input.nextInt();
        input.close();

        if (number % 2 == 0) {
            System.out.println("Podana liczba jest parzysta.");
        }
        else {
            System.out.println("Podana liczba jest nieparzysta.");
        }


    }

}