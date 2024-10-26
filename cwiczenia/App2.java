import java.util.InputMismatchException;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        System.out.println("Aplikacja do nauki obslugi bledow oraz petli.");

        boolean done = false;


        while (!done || count < 5) {
            try {

                Scanner input = new Scanner(System.in);
                System.out.print("Podaj liczbę: ");
                int number = input.nextInt();
                input.close();

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

                done = true;
            } catch (InputMismatchException exception) {
                System.out.println("Proszę podać liczbę całkowitą");
            }


//        if (number % 2 == 0) {
//            System.out.println("Podana liczba jest parzysta.");
//        } else {
//            System.out.println("Podana liczba jest nieparzysta.");
//        }


        }

    }
}