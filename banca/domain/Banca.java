package banca.domain; 

import java.util.*;
import banca.domain.*;

public class Banca {

  /* Questo oggetto sarà un Singleton, ossia un oggetto istanziabile UNA sola volta nella classe.
   Fa parte dei design pattern
   Si può anche creare un Singleton tramite un Enumerator
  */

  // Rendendola statica esisterà un SOLO oggetto di tipo Banca, anche volendo provare a crearne ulteriori farà SEMPRE riferimento a questo oggetto banca.
  private static Banca istance = new Banca(); 
  private String nome = "Bank of Java";
  private String[] secretKeys = {"key1","key2","key3"};
  private List<Cliente> clienti = new ArrayList<Cliente>(); 

  // Creo un costruttore privato cosi che sia accessibile solamente da questa classe
  // Il costruttore Chiama il metodo init per inizializzare i dati dei clienti
  private Banca () {
    init();
  }

  // Creo un metodo di inizializzazione dei dati del Cliente
  private void init () {
    Cliente c1 = new Cliente(1, "Ciccio", "Pasticcio", 22, Sesso.MASCHIO);
    ContoCorrente cc1 = new ContoCayman(0, 100, "key1");
    ContoCorrente cc2 = new ContoItaliano(0, 500);
    c1.aggiungiConto(cc1); c1.aggiungiConto(cc2);
    Cliente c2 = new Cliente(1, "Mario", "Rossi", 25, Sesso.MASCHIO);
    Cliente c3 = new Cliente(1, "Paola", "Carlito", 30, Sesso.FEMMINA);
    clienti.add(c1); clienti.add(c2); clienti.add(c3);
  }

  // Iterable permette di passare una lista che può funzionare solo in lettura per essere iterata
  public Iterable<Cliente> getClienti() {
    return clienti;
  }
 
  // Con questo metodo ritorno l'istanza della Banca, è statico per essere accessibile ovunque senza bisogno di istanziare una nuova banca
  public static Banca getIstance() {
    return istance; 
  }

  //Con questo metodo prendiamo in input l'id del cliente, del conto e della somma da depositare per depositare
  public void deposita ( double amount, int idCliente, int idConto ) {
    // Cicliamo i clienti per trovare il cliente giusto da utilizzare 
    for ( Cliente c : clienti ) {
      if ( c.getID() == idClient ) {
        ContoCorrente cc = c.getContoById(idConto); // Ottenuto il conto tramite l'id
        cc.deposita(amount); return; // oppure avrei potuto usare anche break se non ho altre istruzioni dopo; 
      }
    }
  }

  //Con questo metodo prendiamo il metodo bonifica all'interno del conto e lo usiamo tramite l'interfaccia della banca
    public void bonifico ( double amount, int idContoSorgente, int idClienteSorgente, int idContoRicevente, int id ContoSorgente ) throws SaldoInsufficenteException {
    // Cicliamo i clienti per trovare il cliente giusto da utilizzare 
    for ( Cliente c : clienti ) {
      Cliente cliente = c.getID(); 
      Cliente clienteSorgente = null; 
      Cliente clienteDestinatario = null; 
      if ( idClienteSorgente == id ) {
        clienteSorgente = cliente;
      } else if ( idContoRicevente  ==  ) {
        clienteDestinatario = cliente;
      }
    }
    // Bisognerebbe controllare tramite un eccezione se il conto esiste veramente oppure no
    clienteSorgente.getContoById(idContoSorgente)
    .bonifico(amount, clienteDestinatario.getContoById(idContoRicevente))
  }

  // Con questo metodo controllo se il codice segreto corrisponde a una delle tre presenti nell'array
  public boolean checkCode ( String code ) {
    for ( int i = 0; i < secretKeys.length; i++ ) {
      if ( secretKeys[i].equals(code)) {
        return true;
      }
    }
    return false;  
  }
}