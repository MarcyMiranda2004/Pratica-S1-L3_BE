package Ess3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private Cliente cliente;
    private List<Articolo> articoli;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
    }

    public void aggiungiArticolo(Articolo articolo) {
        articoli.add(articolo);
    }

    public double calcolaTotale() {
        double totale = 0;
        for (Articolo art : articoli) {
            totale += art.getPrezzo();
        }
        return totale;
    }

    public void mostraRiepilogo() {
        System.out.println(cliente);
        System.out.println("Articoli nel carrello:");
        for (Articolo art : articoli) {
            System.out.println(" - " + art);
        }
        System.out.println("Totale: €" + calcolaTotale());
    }
}

