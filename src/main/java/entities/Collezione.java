package entities;

import java.util.ArrayList;
import java.util.List;

public class Collezione {
    //questo è lo scheletro del negozio che popolo nel main
        private List<Gioco> catalogoCompleto;
        public Collezione() {
            this.catalogoCompleto = new ArrayList<Gioco>();
        }

            //metodo per stampare solo i videogiochi quando utente digita 1
            public void StampoVideogiochi(){
                for(Gioco gioco : this.catalogoCompleto){
                    if (gioco.getClass()== Videogiochi.class){
                        System.out.println(gioco);
                    }
                }
            }

            public void StampoTavolo(){
                for(Gioco gioco : this.catalogoCompleto){
                    if (gioco.getClass()== GiochiDaTavolo.class){
                        System.out.println("Hai selezionato" + " " + gioco  );
                    }
                }
            }

            public void CreoListaVideogioco(List<Videogiochi> lista){
            this.catalogoCompleto.addAll(lista);

            }
public void CreoListaGioco(List<GiochiDaTavolo> lista){
            this.catalogoCompleto.addAll(lista);
}


//1) RICERCO UN GIOCO TRAMITE ID
    //workflow: devo cercare un gioco tramite il suo id, quindi mi prendo il catalogo completo che ho creato, apro lo stream e applico il metodo filter per filtrare e portare l'id che corrisponde a quello cercato
    //prima istanzio un metodo che mi permetta di vedere tutti gli id disponibili

    public void MostraTuttiGliId() {
        System.out.println("---  ELENCO COMPLETO DEGLI ID DISPONIBILI ---");
        this.catalogoCompleto.stream()
                .forEach(gioco -> System.out.println("[" + gioco.getIdGioco().toLowerCase() + "] - " + gioco.getTitolo()));
        System.out.println("-----------------------------------------------");
    }

    public void CercoPerId(String idDaCercare){
        // mando tt in minuscolo
        this.catalogoCompleto.stream()
                .filter(gioco -> gioco.getIdGioco().toLowerCase().equals(idDaCercare.toLowerCase().trim())) //con trim elimino gli spazi
                .forEach(gioco -> System.out.println(" Gioco trovato tramite id:" + " " + gioco));
    }

    //METODO RIMUOVI PER ID
    public void RimuoviPerId(String idDaRimuovere) {
        String idRimuoviMinuscolo = idDaRimuovere.toLowerCase().trim();

        //mi prendo il gioco perchè quando elimino voglio che escano tutti i suoi dettagli e non solo l'id rimosso
        this.catalogoCompleto.stream()
                .filter(gioco -> gioco.getIdGioco().toLowerCase().equals(idRimuoviMinuscolo))
                .forEach(gioco -> System.out.println("HO RIMOSSO QUESTO GIOCO: " + gioco));
        //workflow: prelevo il catalogo completo, prendo l'id dal gioco e lo rimuovo con removeIf (trasformo tt in minuscolo", qs mi restituisce un booleano.

        boolean rimosso = this.catalogoCompleto.removeIf(gioco -> gioco.getIdGioco().toLowerCase().equals(idRimuoviMinuscolo));
        if (rimosso) {
            System.out.println("Gioco rimosso con successo dal catalogo!");
        } else {
            System.out.println("Errore: Nessun gioco trovato con l'ID '" + idDaRimuovere + "'. Impossibile rimuovere.");
        }
    }








}
