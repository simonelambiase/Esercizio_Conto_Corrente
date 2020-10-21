package banca.domain.ui; 

import banca.domain.*;
import banca.domain.ui.*;

public class SportelloBanca {
  public static void main ( String[] args ) {
    // Otteniamo l'istanza della banca
    Banca bank = Banca.getIstance(); 
    // Chiamiamo la lista dei clienti sotto forma di Iterable
    Iterable<Cliente> ic = bank.getClienti();
    // Utilizziamo il forEach per stampare i dati dei clienti
    for ( Cliente c : ic ) {
      System.out.println(c);
    }
    // Depositiamo dei soldi sul conto del cliente tramite il metodo creato all'interno della Banca
    bank.deposita(100, 1, 1);
    // Utilizziamo il try dopo che l'eccezione è stata passata fino alla classe SportelloBanca
    try {
    bank.bonifico(1000, 36, 2, 3, 1);
    } catch ( SaldoInsufficenteException e ) {
      System.out.println(e.getMessage());
    }
  }
}