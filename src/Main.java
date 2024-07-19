import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Festgelegte Preise
        double preisWurst = 4.20;
        double preisKaese = 2.30;
        double preisBrot = 2.10;
        double preisDVD = 12.00;

        // Benutzereingaben
        System.out.print("Anzahl Wurst: ");
        int anzahlWurst = scanner.nextInt();

        System.out.print("Anzahl Käse: ");
        int anzahlKaese = scanner.nextInt();

        System.out.print("Anzahl Brot: ");
        int anzahlBrot = scanner.nextInt();

        System.out.print("Anzahl DVD: ");
        int anzahlDVD = scanner.nextInt();

        System.out.print("Inhalt der Brieftasche: ");
        double brieftasche = scanner.nextDouble();

        // Gesamtpreis berechnen
        double gesamtPreis = (anzahlWurst * preisWurst) +
                (anzahlKaese * preisKaese) +
                (anzahlBrot * preisBrot) +
                (anzahlDVD * preisDVD);

        if (gesamtPreis > brieftasche) {
            System.out.println("Der Gesamtpreis übersteigt den Inhalt der Brieftasche um " +
                    String.format("%.2f", gesamtPreis - brieftasche) + " EUR.");
        } else {
            // Kassenbon ausgeben
            System.out.println("Wurst      " + anzahlWurst + " x  " + String.format("%.2f", preisWurst) + " EUR");
            System.out.println("                        " + String.format("%.2f", anzahlWurst * preisWurst) + " EUR");
            System.out.println("Käse       " + anzahlKaese + " x  " + String.format("%.2f", preisKaese) + " EUR");
            System.out.println("                        " + String.format("%.2f", anzahlKaese * preisKaese) + " EUR");
            System.out.println("Brot       " + anzahlBrot + " x  " + String.format("%.2f", preisBrot) + " EUR");
            System.out.println("                        " + String.format("%.2f", anzahlBrot * preisBrot) + " EUR");
            System.out.println("DVD        " + anzahlDVD + " x " + String.format("%.2f", preisDVD) + " EUR");
            System.out.println("                       " + String.format("%.2f", anzahlDVD * preisDVD) + " EUR");
            System.out.println("----------------------------------");
            System.out.println("Gesamt                   " + String.format("%.2f", gesamtPreis) + " EUR");
            System.out.println("Gegeben                  " + String.format("%.2f", brieftasche) + " EUR");
            System.out.println();
            System.out.println("Zurück                   " + String.format("%.2f", brieftasche - gesamtPreis) + " EUR");
        }

        scanner.close();
    }
}
