package entities;

//come annunciato nel README creo questa classe astratta in quanto possiede le basi che deve avere un gioco, le classi figlie Giocodatavola e Videogioco estenderanno la superclasse in quanto condividono gli stessi attributi. Gli attributi saranno private per il principio dell'Incapsulamento, li rendo inaccessibili e quindi, non modificabili direttamente. Prevedo, quindi anche dei metodi Getter e Setter eventualmente.

public abstract class Gioco {
private String idGioco;
private String titolo;
private int annoDiPubblicazione;
private double prezzo;

//creo il costruttore di gioco in modo che le classi figlie andranno a richiamare e lavorare su  questi dati tramite il super ().

    public Gioco(String idGioco, String titolo, int annoDiPubblicazione, double prezzo){
this.idGioco = idGioco;
this.titolo = titolo;
this.annoDiPubblicazione = annoDiPubblicazione;
this.prezzo = prezzo;
    }

// qui metto a disposizione i metodi getter e setter


    public String getIdGioco() {
        return idGioco;
    }
    public void setIdGioco(String idGioco) {
        this.idGioco = idGioco;
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }
    public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        if (prezzo <= 0) {
            throw new IllegalArgumentException("Prezzo non valido. Il prezzo deve essere positivo");
        }
        this.prezzo = prezzo;
    }

    //inizializzo anche il metodo per la verifica del prezzo positivo che mi servirà in seguito e lancio exception nativa.


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gioco{");
        sb.append("idGioco='").append(idGioco).append('\'');
        sb.append(", titolo='").append(titolo).append('\'');
        sb.append(", annoDiPubblicazione=").append(annoDiPubblicazione);
        sb.append(", prezzo=").append(prezzo);
        sb.append('}');
        return sb.toString();
    }
}

