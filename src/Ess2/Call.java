package Ess2;

public class Call {
    private String numChiamato;
    private double durata;

    //Costruttore della chiamata
    public Call(String numChiamato, double durata) {
        this.numChiamato = numChiamato;
        this.durata = durata;
    }

    //Metodo per ottenre il numero chiamato
    public String getNumeroChiamato() {
        return numChiamato;
    }

    //Metodo per ottenere la durata della chiamata
    public double getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "Numero Chiamato: " + numChiamato + "\nDurata Della Chiamata: " + durata + " min";
    }

    public static void main(String[] args) {
        Call call1 = new Call("3211233321", 3.28);
        Call call2 = new Call("1233211233", 4.38);
        Call call3 = new Call("4566544566", 5.01);
        Call call4 = new Call("9877899789", 20.10);
        Call call5 = new Call("4159513477", 13.33);

        // creazione Array di chiamate
        Call[] chiamate = new Call[5];
        chiamate[0] = call1;
        chiamate[1] = call2;
        chiamate[2] = call3;
        chiamate[3] = call4;
        chiamate[4] = call5;

        for (int i = 0; i < chiamate.length; i++ ) {
            System.out.println(chiamate[i]);
            System.out.println("----------");
        }
    }
}
