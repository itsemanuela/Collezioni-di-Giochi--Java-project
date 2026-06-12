package entities;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Statistiche  {

    //mi creo il metodo per stamparmi le statistiche partendo dal catalogo di tutti i giochi
    public void mostraStatistiche(List<Gioco> catalogo) {
        System.out.println("=================STATISTICHE DI GIOCO=====================");

        //conto i videogiochi usando long perchè occupano molta memoria in un magazzino
        //prendo il catalogo di tutti i giochi, apro lo stream, li filtro, se un gioco è un'istanza di gioco allora la prendo e conto quanti elementi ho con questi dati richiesti
        long numeroVideoGiochi = catalogo.stream().filter(gioco -> gioco instanceof Videogiochi).count();


        System.out.println("Numero video giochi presenti in memoria: " + numeroVideoGiochi);

// metodo per stampare i giochi da tavola
        long numeroGiochiTavolo = catalogo.stream().filter(giocoT -> giocoT instanceof GiochiDaTavolo).count();
        System.out.println("Numero giochi da tavola presenti in memoria: " + numeroGiochiTavolo);

        //calcolo la media dei prezzi con averagingDouble
        double mediaCatalogo = catalogo.stream().collect(Collectors.averagingDouble(Gioco::getPrezzo));
        System.out.println("Media dei prezzo degli elementi presenti nel catalogo: " + mediaCatalogo);
    }

        //metodo per stampare il prezzo piu alto -> workflow che seguo è stamparmi la lista dei prezzi di tutti i giochi e reversed sulla lista in modo da visualizzare il piu costoso.
//utilizzo sorted per riorganizzare tutta la lista degli elementi presenti, li ordino per prezzo e con reversed inverto l'ordine, quindi:
        //sorted mi restituisce uno Stream ordinato di oggetti gioco quindi apro il metodo
    //con findFirst mi trovo, appunto, il primo della lista, if è presente allora me lo stampi

        public void giocoPiuCostoso(List<Gioco> catalogo){
            catalogo.stream().sorted(Comparator.comparingDouble(Gioco::getPrezzo).reversed())
                    .findFirst().ifPresent(gioco->{
                        System.out.println("Il prezzo del gioco più costoso che abbiamo trovato è:" + " " + gioco.getPrezzo());
        });

    }}


