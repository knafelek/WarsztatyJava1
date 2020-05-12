package pl.knafelek.LOTTO_simulator;

import java.util.Arrays;
import java.util.Random;

public class LOTTO {

    public static void main(String [] args){

        int [] numbers = new int [49];
        int nextVal = 1;
        for(int i = 0; i< numbers.length; i++){
            numbers[i] = nextVal++;
        }

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

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(drawnNumbers);
        System.out.println(Arrays.toString(drawnNumbers));

    }

}
