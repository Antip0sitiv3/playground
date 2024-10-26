import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Aplikacja do nauki obslugi bledow oraz petli.");

        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");

        try {
            number = input.nextInt();

            for (int j = 0; j < number; j++) {
                for (int i = 0; i <= number; i++) {
                    if (i < number) {
                        System.out.print(i + ", ");
                    } else {
                        System.out.print(i);
                    }
                }
                System.out.println();
            }

        } catch (InputMismatchException exception) {
            System.out.println("Proszę podać liczbę całkowitą");
        }
        input.close();

//        if (number % 2 == 0) {
//            System.out.println("Podana liczba jest parzysta.");
//        } else {
//            System.out.println("Podana liczba jest nieparzysta.");
//        }


    }

}