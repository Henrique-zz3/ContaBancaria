package conta.model;

public class Conta {

	// Atributo / Caracteristicas
	
	//Encapsulamento: Encapsular/Proteger algo
	// Privete / Protected / Public / Friendly
	
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	// Método Construtor => que auxilia na criação/instanciação de um objeto da Classe
	public Conta(int numeroConta, int agencia, int tipo, String titular, float saldo){
		
		// this (Esta): representa o nome da própria classe (Conta)
		
		this.numero = numeroConta; // Conta.numero recebe o valor do arg. numero
		this.agencia = agencia; //Conta.agencia recebe o valor do arg. agencia
		this.tipo = tipo; //Conta.tipo recebe o valor do arg. tipo
		this.titular = titular; //Conta.titular recebe o valor do arg. titular
		this.saldo = saldo; //Conta.saldo recebe o valor do arg. saldo
		
	}
	
	//Método Get e Set
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	//Métodos / Ações
	
}
