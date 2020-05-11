package pl.knafelek.symolator_LOTTO;

import java.util.Random;

public class LOTTO {

    public static void main(String [] args){

        int [] liczby = new int [49];
        int nextVal = 1;
        for(int i = 0; i< liczby.length; i++){
            liczby[i] = nextVal++;
        }

        int zakres = liczby.length; // znacznik - na jakiej kulce skończyliśmy
        int[] wylosowane = new int [6];

        for (int i = 0; i < wylosowane.length; i++){
            // w tablicy liczby od 1 do 49 wiec zamiast losowac wartosc losujemy indeks tablicy
            int uzyty_index = 0 + new Random().nextInt(zakres);
            wylosowane[i] = liczby [uzyty_index] ;

            int temp = liczby[uzyty_index]; //bierzemy kulke w rękę
            liczby [uzyty_index] = liczby [zakres - 1]; //wstaw w to miejsce ostatnią kulkę
            liczby[zakres - 1]=temp; // i już podmieniliśmy dwie wartości
            zakres--; //algorytm niewydajny pamięciowo ale wydajny jeśli mamy mało liczb
        }
    }
}
