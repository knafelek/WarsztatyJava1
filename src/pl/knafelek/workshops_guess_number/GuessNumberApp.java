package pl.knafelek.workshops_guess_number;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberApp {

    public static void main(String[] args) throws InputMismatchException {
        Random losowanie = new Random();
        int liczba = losowanie.nextInt(101);
        //System.out.println(liczba);

        System.out.println("Wylosowano liczbę z zakresu 1-100. Zgadnij jaką!: ");

        Scanner scan = new Scanner(System.in);

        int proba;
        do{
            while (!scan.hasNextInt()) {
                scan.next();
                System.err.println("To nie jest liczba! Podaj raz jeszcze: ");
            }
            proba=scan.nextInt();

            if(proba>liczba){
                System.out.println("To za dużo! Próbuj dalej: ");

            } else if (proba<liczba){
                System.out.println("To za mało! Próbuj dalej: ");

            } else {
                System.out.println("Zgadłeś! ");
            }

        } while(true);
    }
}
