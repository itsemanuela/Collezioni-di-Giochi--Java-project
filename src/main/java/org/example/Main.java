package org.example;

import entities.*;

import java.util.List;
import java.util.Scanner;

//dopo aver strutturato le fondamenta (le tre classi con gli enum) passo alla verifica iniziale dei dati nel main e soprattutto alla creazione dei primi elementi veri e propri del progetto.
//La classe collezione sarà il mio scaffale vuoto al cui interno inserirò i metodi che voglio applicre

public class Main {
    public static void main(String[] args) {

        //inizio a popolare il mio "negozio" dei videogiochi
        Collezione collezione = new Collezione();

        Videogiochi v1 = new Videogiochi("V01", "The Sims 4", 2014, 39.99, "PC", 500, ListaGeneriVideogiochi.STRATEGIA);
        Videogiochi v2 = new Videogiochi("V02", "Harry Potter e la Pietra Filosofale", 2001, 14.99, "PS1", 15, ListaGeneriVideogiochi.AVVENTURA);
        Videogiochi v3 = new Videogiochi("V03", "FarmVille Tales", 2010, 10.00, "PC", 300, ListaGeneriVideogiochi.STRATEGIA);
        Videogiochi v4 = new Videogiochi("V04", "Animal Crossing: New Horizons", 2020, 59.99, "Nintendo Switch", 400, ListaGeneriVideogiochi.AVVENTURA);
        Videogiochi v5 = new Videogiochi("V05", "Giulia Passione Cucina", 2008, 19.99, "Nintendo DS", 20, ListaGeneriVideogiochi.STRATEGIA);
        Videogiochi v6 = new Videogiochi("V06", "Hogwarts Legacy", 2023, 69.99, "PS5", 70, ListaGeneriVideogiochi.AVVENTURA);
        Videogiochi v7 = new Videogiochi("V07", "Nintendogs", 2005, 24.99, "Nintendo DS", 100, ListaGeneriVideogiochi.STRATEGIA);
        Videogiochi v8 = new Videogiochi("V08", "Tomb Raider: Legend", 2006, 9.99, "PS2", 12, ListaGeneriVideogiochi.AZIONE);
        Videogiochi v9 = new Videogiochi("V09", "Crash Bandicoot: Wrapped", 1998, 19.99, "PS1", 10, ListaGeneriVideogiochi.AZIONE);
        Videogiochi v10 = new Videogiochi("V10", "Just Dance 2026", 2025, 49.99, "Nintendo Switch", 50, ListaGeneriVideogiochi.SPORT);

        // collezione di 10 giochi da tavola
        GiochiDaTavolo t1 = new GiochiDaTavolo("T01", "Monopoly Italia", 1935, 29.99, 6, 90, ListaGiocoTavola.STRATEGIA);
        GiochiDaTavolo t2 = new GiochiDaTavolo("T02", "Indovina Chi?", 1979, 19.99, 2, 15, ListaGiocoTavola.PARTYGAMES);
        GiochiDaTavolo t3 = new GiochiDaTavolo("T03", "Cluedo", 1949, 24.99, 6, 45, ListaGiocoTavola.STRATEGIA);
        GiochiDaTavolo t4 = new GiochiDaTavolo("T04", "Taboo", 1989, 27.50, 10, 30, ListaGiocoTavola.PARTYGAMES);
        GiochiDaTavolo t5 = new GiochiDaTavolo("T05", "Uno", 1971, 9.99, 10, 15, ListaGiocoTavola.CARTE);
        GiochiDaTavolo t6 = new GiochiDaTavolo("T06", "Visual Game", 1988, 32.00, 8, 60, ListaGiocoTavola.PARTYGAMES);
        GiochiDaTavolo t7 = new GiochiDaTavolo("T07", "Il Mercante in Fiera", 1700, 7.50, 10, 40, ListaGiocoTavola.CARTE);
        GiochiDaTavolo t8 = new GiochiDaTavolo("T08", "Cranium", 1998, 29.90, 4, 60, ListaGiocoTavola.PARTYGAMES);
        GiochiDaTavolo t9 = new GiochiDaTavolo("T09", "Risiko!", 1977, 35.00, 6, 120, ListaGiocoTavola.STRATEGIA);
        GiochiDaTavolo t10 = new GiochiDaTavolo("T10", "Dixit", 2008, 29.99, 8, 30, ListaGiocoTavola.PARTYGAMES);

        //nella classe collezione creo il metodo per stampare solo i videogiochi o i giochi da tavola a seconda della scelta digitata dall'utente nel terminale.
        //tramite i metodi istanziati nella class Collezione vado a inserire tutti i videogiochi e i giochi in una lista
        List<Videogiochi> elencoVG = List.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);
        List<GiochiDaTavolo> elencoG = List.of(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);

        //ho creato le liste raggruppate e le invio alla collezione
        collezione.CreoListaGioco(elencoG);
        collezione.CreoListaVideogioco(elencoVG);

        //ora creo la variabile stringa vuota per inizializza la scelta dell'utente
        String sceltaUtente = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------BENVENUTO/A NELLA COLLEZIONE DI GIOCHI PIU' VIRALI DEL WEB----------------------");

        while (!sceltaUtente.equalsIgnoreCase("q")) {
            System.out.println("------------------PREMI 1 PER ESPLORARE I VIDEOGIOCHI, 2 PER I GIOCHI DA TAVOLA------------------");
            System.out.println("------------------PREMI q PER PASSARE AL MENU DI GESTIONE AVANZATA------------------");
            System.out.print("SCEGLI: ");

            sceltaUtente = scanner.nextLine().trim();
            switch(sceltaUtente) {
                case "1": {
                    System.out.println("Hai selezionato i VIDEOGIOCHI");
                    collezione.StampoVideogiochi();
                    break;
                }
                case "2": {
                    System.out.println("Hai selezionato i GIOCHI DA TAVOLO");
                    collezione.StampoTavolo();
                    break;
                }
                case "q":
                case "Q": {
                    System.out.println("Accesso al menu avanzato...");
                    break;
                }
                default: {
                    System.out.println("Opzione non valida, scegli tra le proposte");
                    break;
                }
            }
        }

        //Inizializzo un dropdown per far scegliere all'utente cosa fare per testare i miei metodi
        String sceltaDrop = "";
        while (!sceltaDrop.equals("esci")) {
            System.out.println("==================================================");
            System.out.println("Benvenuto nel dropdown avanzato del catalogo Gioco");
            System.out.println("PREMI 1 -> Per CERCARE un gioco tramite ID");
            System.out.println("PREMI 2 -> Per RIMUOVERE un gioco tramite ID");
            System.out.println("PREMI 3 -> Per FILTRARE i giochi con un prezzo inferiore al tuo budget");
            System.out.println("Scrivi 'ESCI' -> Per chiudere il programma");
            System.out.println("==================================================");
            System.out.print("SCEGLI OPERAZIONE: ");

            sceltaDrop = scanner.nextLine().trim().toLowerCase(); //per avere il controllo delle minuscole e spazi

            switch(sceltaDrop) {
                case "1": {
                    collezione.MostraTuttiGliId();
                    System.out.print(" Digita l'ID del gioco che vuoi visualizzare nel dettaglio: ");
                    String idCerca = scanner.nextLine();
                    collezione.CercoPerId(idCerca);
                    break;
                }
                case "2": {
                    collezione.MostraTuttiGliId();
                    System.out.print("Digita l'ID del gioco che vuoi eliminare: ");
                    String idRimuovi = scanner.nextLine();
                    collezione.RimuoviPerId(idRimuovi);
                    break;
                }

                case "3": {
                    try {
                        System.out.print("Inserisci il prezzo limite per la ricerca: ");
                        double budget = scanner.nextDouble();
                        scanner.nextLine();

                        List<Gioco> giochiTrovati = collezione.CercaPerPrezzoMassimo(budget);

                        if (!giochiTrovati.isEmpty()) {
                            System.out.println("Ecco i giochi trovati con prezzo inferiore a " + budget + "€:");
                            for (Gioco gioco : giochiTrovati) {
                                System.out.println("- " + gioco.getTitolo() + " | Prezzo: " + gioco.getPrezzo() + "€");
                            }
                        } else {
                            System.out.println("Nessun gioco trovato con prezzo inferiore a " + budget + "€.");
                        }

                    } catch (java.util.InputMismatchException e) {
                        // se l'utente scrive una stringa invece di un numero exception
                        System.out.println("Errore: Devi inserire un numero valido)");
                        scanner.nextLine();
                    }
                    break;
                }

                case "esci": {
                    System.out.println("Grazie per aver usato il catalogo. Arrivederci!");
                    break;
                }
                default: {
                    System.out.println("Opzione non valida, riprova!");
                    break;
                }
            }
        }

        scanner.close();
    }
}

