package edu.impacta.gcmaula11;

public class ContaBancaria {
	private long saldo;
	public ContaBancaria() { saldo = 0; }
	public ContaBancaria(long s) { saldo = s; }
	
	public void depositar(long valor) {
		// FALTA IMPLEMENTAR
		// Deve acrescentar o valor ao saldo
	}
	
	public boolean sacar(long valor) {
		if(valor <= saldo){
			saldo-=valor;
			return true;
		}
		return false;
	}
	
	public long getSaldo() {
		// FALTA IMPLEMENTAR
		// Deve retornar o saldo
		return 0;
	}
	
}
 