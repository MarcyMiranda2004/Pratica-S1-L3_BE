public class Rettangolo {
    private double altezza;
    private double larghezza;

    /* Costruttore: serve per creare un rettangolo con altezza e larghezza,
    è lo stampino che ci consente di creare altri rettangoli*/
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // Metodo per calcolare l'area
    public double calcoloArea() {
        return larghezza * altezza;
    }

    // Metodo per calcolare il perimetro
    public double calcoloPerimetro() {
        return (larghezza + altezza) * 2;
    }

    //Metodo per stampare le informazioni del rettangolo
    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.calcoloArea());
        System.out.println("Perimetro: " + r.calcoloPerimetro());
    }

    //Metodo per stampare due rettangoli e sommarne le informazioni
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Area Rettangolo 1: " + r1.calcoloArea());
        System.out.println("Perimetro Rettangolo 1: " + r1.calcoloPerimetro());

        System.out.println("Area Rettangolo 2: " + r2.calcoloArea());
        System.out.println("Perimetro Rettangolo 2: " + r2.calcoloPerimetro());

        double sommaAree = r1.calcoloArea() + r2.calcoloArea();
        double sommaPerimetri = r1.calcoloPerimetro() + r2.calcoloPerimetro();

        System.out.println("la somma delle aree è: " + sommaAree);
        System.out.println("la somma dei perimetri è: " + sommaPerimetri);
    }

    //Metodo main per runnare il progetto
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(3, 5 );
        Rettangolo r1 = new Rettangolo(7, 9 );
        Rettangolo r2 = new Rettangolo(11, 13 );

        Rettangolo.stampaRettangolo(r);
        System.out.println("----------");
        Rettangolo.stampaDueRettangoli(r1, r2);
    }
}
