package edu.impacta.gcmaula11;

public class ContaBancaria {
	private long saldo;
	public ContaBancaria() { saldo = 0; }
	public ContaBancaria(long s) { saldo = s; }
	
	public void depositar(long valor) {
		// FALTA IMPLEMENTAR
		// Deve acrescentar o valor ao saldo
		saldo += valor;
	}
	
	public boolean sacar(long valor) {
		// FALTA IMPLEMENTAR
		// Se o valor for menor ou igual ao saldo, deve retirar o valor do saldo e retornar true
		// Se o valor ultrapassar o saldo, deve retornar false
		if (valor <= saldo) {
		saldo -= valor;
		return true;
		}
		return false;
	}
	
	public long getSaldo() {
		return saldo;

	}
	
}
 
