package entities;
// la prima classe figlia che estende Gioco utilizzerà il metodo super() per leggere gli attributi della madre e gli passa anche il controllo del prezzo.


public class Videogiochi extends Gioco{
    private String piattaforma;
    private int durataInOre;
    private  ListaGeneri generi;

    public Videogiochi(String idGioco, String titolo, int annoDiPubblicazione, double prezzo, String piattaforma, int durataInOre, ListaGeneri generi) {
        super(idGioco, titolo, annoDiPubblicazione, prezzo);

        //qui inserisco anche gli attributi propri di Videogioco
        this.piattaforma = piattaforma;
        this.durataInOre = durataInOre;
        this.generi=generi;

    }


//istanzio i getter e i setter anche per queste tre nuove variabili
    public String getPiattaforma() {
        return piattaforma;
    }
    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }
    public int getDurataInOre() {
        return durataInOre;
    }
    public void setDurataInOre(int durataInOre) {
        this.durataInOre = durataInOre;
    }
    public ListaGeneri getGeneri() {
        return generi;
    }
public void setGeneri(ListaGeneri generi) {
        this.generi = generi;
}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Videogiochi{");
        sb.append("piattaforma='").append(piattaforma).append('\'');
        sb.append(", durataInOre=").append(durataInOre);
        sb.append(", generi=").append(generi);
        sb.append('}');
        return sb.toString();
    }
}
