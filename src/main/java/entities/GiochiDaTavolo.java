package entities;

public class GiochiDaTavolo extends Gioco{

    private int numeroGiocatori;
    private int mediaMinutiGioco;
    private ListaGiocoTavola listaGiocoTavola;

    public GiochiDaTavolo(String idGioco, String titolo, int annoDiPubblicazione, double prezzo, int numeroGiocatori, int mediaMinutiGioco,  ListaGiocoTavola listaGiocoTavola) {
        super(idGioco, titolo, annoDiPubblicazione, prezzo);

        this.numeroGiocatori = numeroGiocatori;
        this.mediaMinutiGioco = mediaMinutiGioco;
this.listaGiocoTavola = listaGiocoTavola;

    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }
    public void setNumeroGiocatori(int numeroGiocatori) {
        // qui ho bisogno di stabilire già il controllo sul numero di giocatori ammessi, cioè se sono meno di due o maggiori di dieci non è possibile giocare.
        if (numeroGiocatori <2 || numeroGiocatori > 10) {
           throw new IllegalArgumentException("Il numero di giocatori deve essere compreso tra 2 e 10!");
        }
        this.numeroGiocatori = numeroGiocatori;
    }
    public int  getMediaMinutiGioco() {
        return mediaMinutiGioco;
    }
    public void setMediaMinutiGioco(int mediaMinutiGioco) {
        this.mediaMinutiGioco = mediaMinutiGioco;
    }

    public  ListaGiocoTavola getListaGiocoTavola() {
        return listaGiocoTavola;
    }
    public void setListaGiocoTavola(ListaGiocoTavola listaGiocoTavola) {
        this.listaGiocoTavola = listaGiocoTavola;
    }


    @Override
    public String toString() {
        return "GiocoDaTavolo {" +
                super.toString() +
                ", Giocatori=" + numeroGiocatori +
                ", Durata=" + mediaMinutiGioco+ " min" +
                ", Tipo=" + listaGiocoTavola +
                '}';
    }
}
