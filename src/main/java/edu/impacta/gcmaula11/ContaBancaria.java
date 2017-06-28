package edu.impacta.gcmaula11;

public class ContaBancaria {
	private long saldo; //atributo que representa o valor do saldo da conta bancaria
	public ContaBancaria() { saldo = 0; } //Construtor da classe 1
	public ContaBancaria(long s) { saldo = s; }//Construtor da classe 2
	
	public void depositar(long valor) { //Metodo para depositar valor na conta bancaria
		saldo = saldo + valor;
	}
  
	public boolean sacar(long valor) { //Metodo para sacar valor da conta bancaria
		if(valor <= saldo){
			saldo-=valor;
			return true;
		}
		return false;
	}
	
	public long getSaldo() { //Metodo para consultar saldo da conta bancaria
		return saldo;

	}
}
 
