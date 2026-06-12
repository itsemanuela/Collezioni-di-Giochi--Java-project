package entities;

public class GiochiDaTavolo extends Gioco{

    private int numeroGiocatori;
    private int mediaMinutiGioco;

    public GiochiDaTavolo(String idGioco, String titolo, int annoDiPubblicazione, double prezzo, int numeroGiocatori, int mediaMinutiGioco) {
        super(idGioco, titolo, annoDiPubblicazione, prezzo);

        this.numeroGiocatori = numeroGiocatori;
        this.mediaMinutiGioco = mediaMinutiGioco;


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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GiochiDaTavolo{");
        sb.append("numeroGiocatori=").append(numeroGiocatori);
        sb.append(", mediaMinutiGioco=").append(mediaMinutiGioco);
        sb.append('}');
        return sb.toString();
    }
}
