public enum BancaEnum {
    BANK_OF_JAVA("La miglior banca per i programmatori Java.");


    private String bankName; 

    // Costruttore dell'Enumeratore che prende la Stringa 
    private BancaEnum ( String s ) {
      this.bankName = s; 
    }

    // Questo enumatore può avere lo stesso utilizzo del Singleton
}