Schema del progetto e workflow pre-sviluppo.

Analizzando la consegna andrò a strutturare inizialmente tre classi. La classe principale, che imposterò come astratta è la classe GIOCO in quanto possiede degli attributi condivisi sia dalla classe Videogioco che dalla classe GiochiDaTavolo.
Ciò che andranno a condividere sarà: ID univoco, titolo, anno di pubblicazione e prezzo.

Sia la classe Videogioco che GiocoDaTavola, classi figlie di Gioco, possiedono dei propri attributi non condivisi, per cui entrambe andranno a estendere la superclasse astratta implementando ulteriori attributi, appunto.
La classe collezione implementerà i metodi operativi e lo scanner per lavorare con lo stream sulle classi già definite.

In fase conclusiva di progetto aggiungo che ho predisposto una custom Exception per la gestire la duplicità degli id di gioco, e ho scelto di gestire i vari errori della validazione dell'input dell'utente tramite i costrutti switch, try/catch e if.

Ho usato la logica dell' instanceof per controllare e verificare se i dati richiesti fossero istanze idonee al mio percorso di strutturazione del progetto. 

Ho implementato lo Stream per dare il via alla manipolazione degli elementi, ho avuto modo di gestire la sua pipeline attraverso i suoi metodi come l'averagingDouble di cui ho usufruito per calcolare la media, il filter(predicate) per filtrare gli elementi, il map l'ho utilizzato per fare il casting da classi piu generiche a classe piu specifiche; il Collector che è uno dei metodi terminali l'ho utilizzato per trasformare appunto lo stream in una lista vera e propria 

Per quanto riguarda le lambda functions le ho utilizzate al posto dei for proprio per una
proprio per una maggiore leggibilità e concisione del codice, permettendomi di dichiarare l'intento dell'operazione (il "cosa") invece di gestire manualmente l'iterazione (il "come").