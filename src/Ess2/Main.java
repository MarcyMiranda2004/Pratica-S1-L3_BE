package Ess2;

public class Main {
    public static void main(String[] args) {
        // Creazione delle chiamate
        Call call1 = new Call("3211233321", 3.28);
        Call call2 = new Call("1233211233", 4.38);
        Call call3 = new Call("4566544566", 5.01);
        Call call4 = new Call("9877899789", 20.10);
        Call call5 = new Call("4159513477", 13.33);

        // Creazione della SIM e aggiunta delle chiamate
        Sim sim = new Sim("3333477707");
        sim.aggiungiChiamata(call1);
        sim.aggiungiChiamata(call2);
        sim.aggiungiChiamata(call3);
        sim.aggiungiChiamata(call4);
        sim.aggiungiChiamata(call5);

        // Stampa i dati della SIM
        sim.stampaDatiSim();
    }
}