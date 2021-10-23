# Christmas_Gift_Giving
     Aceasta aplicatie gestioneaza un set de surprize. Tipurile de surprize (Candies, Fortune Cookies si Minion Toys) implementeaza interfata ISurprise. 
Toate surprizele vor fi depozitate in 3 tipuri de containere, care vor dicta modul de stocare si mai ales ordinea in care surprizele vor fi impartite. 
Deoarece dorim sa operam cu orice tip de container intr-un mod transparent, independent de implementare, vom utiliza o interfata IBag ce va defini protocolul concret de comunicare. Se implementeaza urmatoarele tipuri de containere de surprize:
- un container care va da cadourile din interior intr-o ordine aleatoare
- un container care va da cadourile in ordinea in care acestea au fost introduse - FIFO
- un container care va da cadourile in ordinea inversa introducerii - LIFO

Deoarece exista mai multe tipuri de containere, ne dorim implementarea unui mecanism unic prin care sa generam un nou container (gol). Interfata comuna pentru orice builder de containere va fi IBagFactory.
Pentru a genera un set de surprize aleatoare, vom implementa clasa GatherSurprises.
Pentru impartirea surprizelor, se defineste clasa abstracta AbstractGiveSurprises. Ordinea de distribuire a surprizelor depinde de tipul containerului.
Dupa fiecare surpriza oferita, se asteapta un interval de timp corespunzator waitTime.

Aplicatia urmatoare are ca scop aprofundarea conceptelor de design a ierarhiei de clase si se urmareste punerea in practica a urmatoarelor notiuni:
- reutilizarea functionalitatii prin diverse procedee, precum:
     - compunere si agregare
     - mostenire
- ascunderea functionalitatii si a datelor prin incapsulare
- implementarea de metode wrapper si utilizarea delegarii
- continuarea dezvoltarii abilitatilor practice de design si proiectare a unei arhitecturi de clase, nivel mediu de complexitate
- organizarea corecta a codului in functie de aplicabilitate, clase, metode
- lucru cu obiecte de tipuri diferite dintr-o perspectiva comuna, folosind upcasting
- proiectarea si utilizarea interfetelor in comunicarea dintre componente
- familiarizarea cu conceptul de genericitate in dezvoltarea software

Scopul final este de a obtine un sistem generic capabil sa:
- utilizeze mai multe tipuri de surprize (i.e. ce implementeaza o interfata comuna)
- implementeze diversi algoritmi de stocare si daruire a surprizelor
- foloseasca un mecanism puternic, aleator de generare a unui set (nou) de surprize
