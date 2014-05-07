package teste;
import java.util.*;
 
 public class ProgramaConta
 {
 	public static void main(String args[])
 	{
 		// Declarando as vari�veis
 		double salIni, valor;
 		String nom;
 		int num, tpTransacao;
 		char op = 'S';
 		
 		// Declarando e criando objeto de leitura
 		Scanner input = new Scanner (System.in);
 		
 		// Lendo os dados do correntista
 		System.out.printf("Digite o nome: ");
 		nom = input.nextLine();
 		System.out.printf("Digite o numero da conta: ");
 		num = input.nextInt();
 		// Lendo o saldo Inicial
 		System.out.printf("Digite o saldo inicial da conta: ");
 		salIni = input.nextDouble();
 		
 		// Declarando objetos
 		ContaCorrente conta = new ContaCorrente(salIni);
 				
 		conta.setNumero(num);
 		
 		conta.setNome(nom);

 
 		// La�o
 		while (op=='S' || op=='s')
 		{
   			System.out.printf("\n\nDigite o valor da transacao: ");
 			valor = input.nextDouble();
 			System.out.printf("Digite o tipo de transacao (1-debito, 2-credito): ");
 			tpTransacao = input.nextInt();
 			if (tpTransacao>=1 && tpTransacao<=2)
 			{
 			if(tpTransacao == 1)
 				conta.debita(valor);
 			else
 				conta.credita(valor);
 			}	
    		System.out.printf("\nDeseja continar (<S>im ou <N>ao): ");
 			op = input.next().charAt(0);
			
 		} 
 	
 		// Exibindo o saldo final
 		System.out.printf("\n Cliente: %S",conta.getNome());
 		System.out.printf("\n\n*** Saldo final: %.2f\n\n", conta.getSaldo());
 
 
 	}
 	
 }