# WarsztatyJava1
Gry

## Zawartość

1. Gra w zgadywanie liczb
2. Symulator LOTTO
3. Gra w zgadywanie liczb 2 
4. Kostka do gry
5. Wyszukiwarka najpopularniejszych słów

### 1. Gra w zgadywanie liczb

##### Opis
```
Komputer losuje liczbę od 1 do 100. 
Następnie:
- prosi o podanie liczby z klawiatury;
- sprawdza, czy wprowadzony napis, to rzeczywiście liczba 
i w razie błędu wyświetla komunikat: "To nie jest liczba";
- wyświetla komunikat: "Za mało!", "Za dużo!", lub "Zgadłeś!".
```

##### Przykład rozgrywki

```
Wylosowano liczbę z zakresu 1-100. Zgadnij jaką!: 
abc
To nie jest liczba! Podaj raz jeszcze: 
50
To za mało! Próbuj dalej: 
70
To za mało! Próbuj dalej: 
90
To za dużo! Próbuj dalej: 
80
To za mało! Próbuj dalej: 
85
Zgadłeś! 
```
---
### 2. Symulator LOTTO

##### Opis
```
LOTTO to gra liczbowa polegająca na losowaniu 6 liczb z zakresu od 1 do 49. 
Zadaniem gracza jest poprawne wytypowanie losowanych liczb. 
Nagradzane jest trafienie 3, 4, 5 lub 6 poprawnych liczb.

Program:
- pyta o typowane liczby, przy okazji sprawdzi następujące warunki:
        czy wprowadzony ciąg znaków jest poprawną liczbą,
        czy użytkownik nie wpisał tej liczby już poprzednio,
        czy liczba należy do zakresu 1-49,
- po wprowadzeniu 6 liczb, sortuje je rosnąco i wyświetla na ekranie;
- losuje 6 liczb z zakresu i wyświetla je na ekranie;
- informuje gracza, czy trafił przynajmniej "trójkę".
```
---
### 3. Gra w zgadywanie liczb 2 

##### Opis
```
Użytkownik wymyśla liczbę z zakresu 1-1000, 
a komputer zgaduje ją maksymalnie w 10 ruchach!

Zadaniem gracza jest udzielanie odpowiedzi "więcej", "mniej", "trafiłeś".
```
---
### 4. Kostka do gry

##### Opis
```
W grach planszowych i papierowych RPG używa się wielu rodzajów kostek do gry, 
nie tylko tych dobrze znanych, sześciennych. Jedną z popularniejszych kości 
jest np. kostka dziesięciościenna, a nawet stuścienna!

Ponieważ w grach kośćmi rzuca się często, pisanie za każdym razem 
np. "rzuć dwiema kostkami dziesięciościennymi, a do wyniku dodaj 20", 
byłoby żmudne, czasochłonne i marnowałoby ogromne ilości papieru.

W takich sytuacjach używa się kodu skracającego polecenie np.: "rzuć 2D10+20".

Program:
- przyjmie w parametrze taki kod w postaci String;
- rozpoznaje wszystkie dane wejściowe:
        rodzaj kostki,
        liczbę rzutów,
        modyfikator,
- wykonuje symulację rzutów i zwróci wynik.

Typy kostek występujące w grach:
D3, D4, D6, D8, D10, D12, D20, D100.
```

### 5. Wyszukiwarka najpopularniejszych słów

##### Opis
```
Program:
- Wywołuje pobieranie dla wybranych serwisów internetowych;
- Pomija wszystkie elementy krótsze niż 3-znakowe;
- Tworzy tablicę elementów wykluczonych np. oraz, ponieważ;
- Wczytuje utworzony plik popular_words.txt i na jego 
podstawie tworzy plik filtered_popular_words.txt, który 
zawiera wszystkie znalezione słowa, pomijając słowa wykluczone.
```
---

