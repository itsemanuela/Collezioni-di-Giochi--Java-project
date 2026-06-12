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

}
