// Zadanie 1. Napisac program służący do konwersji wartości temperatury
// podanej w stopniach Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        System.out.println("Program służący do konwersji stopni C na F.");

        double mnozik = 1.8;
        double skladnik = 32;
        System.out.print("Podaj stopnie C:");
        Scanner input = new Scanner(System.in);

        float tempC = input.nextFloat();
        double tempF = ((tempC * mnozik) + skladnik);
        System.out.println(tempC + " stopni C to " + tempF + " stopni F.");


    }
}
