
# DOS - Test - Ricevuta

Esercizio svolto da Benedetto Asta.

L'IDE utilizzato è "Eclipse IDE for Enterprise Java Developers, Version: 2019-12 (4.14.0)".

## Installation

*   Eseguire il Clone del repository
*   Importare la Java Application all'interno del tuo IDE.

## Test
 
I test sono disponibili al path "src/test/*".

Per eseguire i test, selezionare il package "test.*" dall'IDE ed eseguire come "JUnit Test".

## Usage 

L'applicazione può essere eseguita direttamente dal tuo IDE.

Lanciare l'esecuzione selezionando la cartella del progetto, tasto destro -> Run as Java Application. Selezionare la classe main "Application.java" se fosse richiesto.

---

Puoi inoltre eseguire l'applicazione utilizzando il file JAR generato, presente all'interno della cartella build.

Per eseugire il JAR, lanciare il seguente comando dal cmd all'interno della cartella del file: 
	
	java -jar dos-test-ricevuta.jar

---	

Funzionalità dell'applicazione:

* E' possibile inserire un prodotto nel carrello
* E' possibile inserire un prodotto preconfigurato nell'applicativo (per rendere più veloce l'inserimento).
* E' possibile generare la ricevuta per il carrello corrente e, di conseguenza, creare un nuovo carrello vuoto.

---

Per inserire un prodotto bisogna rispettare il seguente formato:

* Inserire "Imported " in caso di merce importata
* Inserire la tipologia del prodotto (ad esempio fumetto, pasta, libro, snack,...)
* Inserire la descrizione tra virgolette (ad esempio "Topolino")
* Inserire il prezzo preceduto da ", prezzo " (ad esempio ", prezzo 5.99")

Un esempio di prodotto corretto è:
	
	Imported Fumetto "Topolino", prezzo 5.99

Le tipologie di prodotto disponibili sono:

##### BOOKS 

* book
* libro
* fumetto
* enciclopedia

##### FOODS

* snack
* pasta
* pane
* dolce

##### MUSICS

* compactdisk
* headset

##### PHARMS

* antibiotico
* vitamina

##### GENERICS

* qualsiasi altra tipologia non elencata in precedenza

---

Per inserire un prodotto preimpostato, scrivere "PRODOTTO#{numero}", selezionando il numero dall'elenco sottostante:

1. Libro "Il signore degli anelli", prezzo 12.49
2. CompactDisc "Innuendo", prezzo 14.99
3. Snack "Cioccolata", prezzo 0.85
4. Imported Fumetto "Topolino", prezzo 5.99
5. Imported Pasta "Spaghetti, numero 5", prezzo 1.99
6. Antibiotico "Tachipirina 500, pillole", prezzo 12.99
7. Imported Antibiotico "nuovo farmaco estero", prezzo 12.99
8. ProdottoGenerico "Pentole da cucina", prezzo 90.85

Ad esempio, digitare "PRODOTTO#1" è equivalente a scrivere "Libro "Il signore degli anelli", prezzo 12.49" durante l'inserimento del prodotto.

---

Per generare una ricevuta digitare "BILL".

**NOTA**: il numero di ricevute viene conteggiato anche se vuote.

**SUGGERIMENTO**: per testare che la decima ricevuta contenga il messaggio del concorso, digitare "BILL" 10 volte.


