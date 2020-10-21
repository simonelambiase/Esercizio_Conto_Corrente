package banca.domain; 

// In questa classe Estendiamo la classe ContoCorrente che al momento è classe madre di questa.
public class ContoItaliano extends ContoCorrente {
  // Creiamo una costante final static
  private static final double TASSA_PERCENTUALE = 5;

  // Inizializziamo il costruttore della classe madre dandogli i parametri e passandoli al supercostruttore
  public ContoItaliano( int id, double saldo ) {
    super( id, saldo );
  }

  // Stiamo sovrascrivendo il metodo astratto nella classe ContoCorrente dandogli un funzionamento specifico per ContoItaliano
  @Override
  public void deposita ( double amount ) {
      double saldo = getSaldo();
      saldo += ( 1 - TASSA_PERCENTUALE / 100.0 ) * amount;
      setSaldo(saldo);
      // Calcoliamo la percentuale e settiamo il saldo aggiornato tramite il metodo nella classe madre
  }

  
}