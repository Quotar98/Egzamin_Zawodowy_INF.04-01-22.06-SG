import java.util.Random;

public class Tablica {

    private int[] tablica;
    private int rozmiar;

    public Tablica(int rozmiar) {
        this.rozmiar = rozmiar;
        this.tablica = new int[rozmiar + 1];
        wypelnijTablice();
    }

    private void wypelnijTablice() {
        Random rand = new Random();
        for (int i = 0; i < rozmiar; i++) {
            tablica[i] = rand.nextInt(100) + 1;
        }
    }

    /**
     *  nazwa funkcji: przeszukajTabliceZWartownikiem
     *  argumenty:
     *  - klucz - wartość całkowita, która jest przeszukiwana w tablicy.
     *  typ zwracany:
     *  - int, indeks elementu w tablicy, jeżeli element zostanie znaleziony; w przeciwnym razie -1.
     *  informacje: - Funkcja przeszukuje tablicę w poszukiwaniu podanego elementu. Do tablicy dodawany jest wartownik,
     *                co pozwala zabezpieczyć przed wyjściem poza jej granice. Jeżeli element zostanie znaleziony, funkcja
     *                zwraca jego indeks, w przeciwnym razie zwraca -1.
     *  autor: 00000000000
     **/
    public int przeszukajTabliceZWartownikiem(int klucz) {
        int dlugoscTablicy = tablica.length;
        int ostatni = tablica[dlugoscTablicy - 1];
        tablica[dlugoscTablicy - 1] = klucz;
        int i = 0;
        while (tablica[i] != klucz) {
            i++;
        }
        tablica[dlugoscTablicy - 1] = ostatni;
        if (i < dlugoscTablicy - 1 || tablica[dlugoscTablicy - 1] == klucz) {
            return i;
        }
        return -1;
    }

    public void wyswietlTablice() {
        for (int i = 0; i < rozmiar; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }
}