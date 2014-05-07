package teste;


public class ContaCorrente
{
	// Atributos
	private int numero;
	private String nome;
	private double saldo;
	
	// M�todo Construtor
	public ContaCorrente(double saldoIni)
	{
		saldo = saldoIni;
	}
	
	// M�todos set e get
	public void setNumero (int n) { numero = n;}
	public void setNome (String no) { nome = no;}
	public void setSaldo (double s) { saldo = s;}
	public int getNumero () {return numero;}	
	public String getNome () {return nome;}			
	public double getSaldo () {return saldo;}			
	
	// M�todos Gerais
	public void debita(double valor) 
	{
		saldo = saldo - valor;
	}
	public void credita(double valor) 
	{
		saldo = saldo + valor;
	}
	
}
