Schema del progetto e workflow pre-sviluppo.

Analizzando la consegna andrò a strutturare inizialmente tre classi. La classe principale, che imposterò come astratta è la classe GIOCO in quanto possiede degli attributi condivisi sia dalla classe Videogioco che dalla classe GiochiDaTavolo.
Ciò che andranno a condividere sarà: ID univoco, titolo, anno di pubblicazione e prezzo.

Sia la classe Videogioco che GiocoDaTavola, classi figlie di Gioco, possiedono dei propri attributi non condivisi, per cui entrambe andranno a estendere la superclasse astratta implementando ulteriori attributi, appunto.
La classe collezione implementerà i metodi operativi e lo scanner per lavorare con lo stream sulle classi già definite.