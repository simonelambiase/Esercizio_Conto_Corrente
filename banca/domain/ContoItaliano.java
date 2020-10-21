package banca.domain; 

// In questa classe Estendiamo la classe ContoCorrente che al momento è classe madre di questa.
public class ContoItaliano extends ContoCorrente {
  // Inizializziamo il costruttore della classe madre dandogli i parametri e passandoli al supercostruttore
  public ContoItaliano( int id, double saldo ) {
    super( id, saldo );
  }

  // Stiamo sovrascrivendo il metodo astratto nella classe ContoCorrente dandogli un funzionamento specifico per ContoItaliano
  @Override
  public void deposita ( double amount ) {

  }
}