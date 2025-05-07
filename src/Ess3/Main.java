package Ess3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crea alcuni articoli
        Articolo a1 = new Articolo("A001", "Mouse Wireless", 19.99, 10);
        Articolo a2 = new Articolo("A002", "Tastiera Meccanica", 49.90, 5);
        Articolo a3 = new Articolo("A003", "Monitor 24\"", 129.90, 3);

        // Crea un cliente
        Cliente cliente = new Cliente("C001", "Mario", "Rossi", "mario.rossi@email.com", LocalDate.now());

        // Crea un carrello e aggiunge articoli
        Carrello carrello = new Carrello(cliente);
        carrello.aggiungiArticolo(a1);
        carrello.aggiungiArticolo(a2);
        carrello.aggiungiArticolo(a3);

        // Mostra il riepilogo del carrello
        carrello.mostraRiepilogo();
    }
}

