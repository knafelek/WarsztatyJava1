package pl.knafelek.workshops_guess_number;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberApp {

    public static void main(String[] args) throws InputMismatchException {
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(101);
        Scanner scan = new Scanner(System.in);

        System.out.println("Wylosowano liczbę z zakresu 1-100. Zgadnij jaką!: ");

        int guessNumber;
        do{
            while (!scan.hasNextInt()) {
                scan.next();
                System.err.println("To nie jest liczba! Podaj raz jeszcze: ");
            }
            guessNumber=scan.nextInt();

            if(guessNumber>number){
                System.out.println("To za dużo! Próbuj dalej: ");

            } else if (guessNumber<number){
                System.out.println("To za mało! Próbuj dalej: ");

            } else {
                System.out.println("Zgadłeś! ");
            }

        } while(true);
    }
}
