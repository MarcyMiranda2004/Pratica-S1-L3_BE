package Ess2;

public class Sim {
    private String numCell;
    private int creditoEur;
    private Call[] chiamate;

    // Costruttore della Sim
    public Sim(String numCell) {
        this.numCell = numCell;
        this.creditoEur = 0;
        this.chiamate = new Call[5];
    }

    // Metodo per aggiungere una chiamata nell'array
    public void aggiungiChiamata(Call chiamata) {
        for (int i = 0; i < chiamate.length - 1; i++) {
            chiamate[i] = chiamate[i + 1];
        }
        // Aggiungi la nuova chiamata alla fine
        chiamate[chiamate.length - 1] = chiamata;
    }

    // Metodo per stampare i dati della SIM
    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numCell);
        System.out.println("Credito disponibile: " + creditoEur + "€");
        System.out.println("\n");
        System.out.println("Ultime chiamate:");
        for (int i = 0; i < chiamate.length; i++) {
            if (chiamate[i] != null) {
                System.out.println(chiamate[i]);
                System.out.println("----------");
            }
        }
    }
}
