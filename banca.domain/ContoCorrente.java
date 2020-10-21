package banca.model;

import banca.domain.exception.SaldoInsufficenteException;

public abstract class ContoCorrente {
  // Campi della classe Astratta ContoCorrente
  private int id; 
  private double saldo; 
  // Costruttore della Classe
  public ContoCorrente ( int id , double saldo ) {
    this.id = id; 
    this.saldo = saldo; 
  } 
  // Acquisisci id 
  public int getId () {
    return this.id; 
  }
  // Acquisisci saldo 
  public double getSaldo () {
    return this.saldo; 
  }
  /*
      Metodi Base del Conto 
  */

  // Metodo astratto deposita
  public abstract void deposita ( double amount );

  // Metodo non astratto preleva
  public void preleva ( double amount ) throws SaldoInsufficenteException {
    if ( amount > this.saldo ) {
      throw new SaldoInsufficenteException(this.saldo, this.amount, this.id ); 
    }
    this.saldo -= prelievo; 
  }
}