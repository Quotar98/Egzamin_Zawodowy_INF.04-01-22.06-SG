import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int rozmiar = 50;

        Tablica tablica = new Tablica(rozmiar);

        System.out.println("Tablica: ");
        tablica.wyswietlTablice();

        System.out.print("Podaj wartość do wyszukania: ");
        int klucz = skaner.nextInt();

        int wynik = tablica.przeszukajTabliceZWartownikiem(klucz);
        if (wynik != -1) {
            System.out.println("Element " + klucz + " znaleziono na indeksie: " + wynik);
        } else {
            System.out.println("Element " + klucz + " nie został znaleziony w tablicy.");
        }

        skaner.close();
    }
}