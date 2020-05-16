package pl.knafelek.LOTTO_simulator;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LOTTO {

    public static void main(String [] args) throws InterruptedException {

        int [] numbers = new int [49];
        int nextVal = 1;
        for(int i = 0; i< numbers.length; i++){
            numbers[i] = nextVal++;
        }

        System.out.println("Za chwilę wylosujemy 6 spośród liczb: ");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Zgadnij, jakie to będą liczby: ");

        Scanner scan = new Scanner(System.in);

        int [] guessNumbers = new int [6];
        for (int i=0; i < guessNumbers.length; i++){
            guessNumbers[i] = scan.nextInt();
        }

        Arrays.sort(guessNumbers);
        System.out.println("Wytypowałeś następujące liczby: " + Arrays.toString(guessNumbers));

        System.out.println("Następuje zwolnienie blokady!");

        Thread.sleep(4000);

        int scope = numbers.length; // znacznik - na jakiej kulce skończyliśmy
        int[] drawnNumbers = new int [6];

        for (int i = 0; i < drawnNumbers.length; i++){
            // w tablicy liczby od 1 do 49 wiec zamiast losowac wartosc losujemy indeks tablicy
            int usedIndex = 0 + new Random().nextInt(scope);
            drawnNumbers[i] = numbers [usedIndex] ;

            int temp = numbers[usedIndex]; //bierzemy kulke w rękę
            numbers [usedIndex] = numbers [scope - 1]; //wstaw w to miejsce ostatnią kulkę
            numbers[scope - 1]=temp; // i już podmieniliśmy dwie wartości
            scope--; //algorytm niewydajny pamięciowo ale wydajny jeśli mamy mało liczb
        }

        System.out.println("Wylosowano następujące liczby: ");
        Arrays.sort(drawnNumbers);
        System.out.println(Arrays.toString(drawnNumbers));

        int guessCounter = 0;
        for (int i=0; i<guessNumbers.length; i++){
            for(int j=0; j<drawnNumbers.length; j++){
                if (guessNumbers[i] == drawnNumbers[j]){
                    guessCounter+=1;
                } else guessCounter +=0;
            }
        }
        Thread.sleep(2000);
        if (guessCounter<3){
            System.out.println("Nie tym razem! Nie trafiłeś nawet trójki! Spróbuj szczęścia jeszcze raz!");
        } else if (guessCounter<5){
            System.out.println("Udało Ci się trafić " + guessCounter + " liczby.");
        } else {
            System.out.println("Gratulacje! Udało Ci się trafić " + guessCounter + " liczb.");
        }

    }

}


