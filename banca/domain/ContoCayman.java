package banca.domain; 

public class ContoCayman extends ContoCorrente {
  // In questa classe Estendiamo la classe ContoCorrente che al momento è classe madre di questa.
  private String codiceSegreto; 
  private static final double BONUS_AMOUNT = 10.0; 
  // Inizializziamo il costruttore della classe madre dandogli i parametri e passandoli al supercostruttore, questa volta aggiungiamo anche un parametro specifico per questa classe ossia il codiceSegreto
  public ContoCayman ( int id, double saldo, String codiceSegreto ) {
    super ( id, saldo ); 
    this.codiceSegreto = codiceSegreto;
  }

  @Override
  public void deposita ( double amount ) {
    double saldo = getSaldo(); 
    // Facciamo il controllo sul codice segreto richiamando l'istanza della nostra Banca, se il codice è uguale regaliamo il Bonus
    // Protip: Non è obbligatorio mettere == true , non specificandolo controlla se è vero, per negare invece e controllare se è false andiamo mettendo un '!' prima della condizione
    if ( Banca.getIstance().checkCode(codiceSegreto) ) {
      saldo += amount+(1+BONUS_AMOUNT/100.0);
    } else {
      saldo += amount;
    }
    setSaldo(saldo);
  }
}