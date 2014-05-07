package teste;
import java.util.Scanner;
public class ProgramaElevador {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int menudo=0,qtd,i;
        while (menudo!=123){
            System.out.println("\n Se deseja sair digite: Sair:123");
            menudo= entrada.nextInt();
            Elevador e=new Elevador();
            e.Inicializa();
            for (i=0; i<=e.getTotalAndares();i++){
                System.out.println("Andar Atual:"+e.getAndarAtual()+" Total de Pessoas:"+e.getPessoas());
                System.out.println("Quantidade de Pessoas Para Entrar:");
                qtd=entrada.nextInt();
                while(qtd!=0){
                    e.Entra();
                    qtd--;
                }
                e.Sobe();System.out.println("Subindo^^");
                System.out.println("Quantidade de Pessoas Para Sair:");
                qtd=entrada.nextInt();
                while(qtd!=0){
                    e.Sai();
                    qtd--;
                }
            }
            for (i=e.getTotalAndares(); i>0; i--) {
               System.out.println("Andar Atual:"+e.getAndarAtual()+" Total de Pessoas:"+e.getPessoas());
               System.out.println("Quantidade de Pessoas Para Entrar:");
                qtd=entrada.nextInt();
                while(qtd!=0){
                    e.Entra();
                    qtd--;
                }
                e.Desce();System.out.println("Descendo =]");
                System.out.println("Quantidade de Pessoas Para Sair:");
                qtd=entrada.nextInt();
                while(qtd!=0){
                    e.Sai();
                    qtd--;
                }  
           } 
        System.out.println("\n Se deseja sair digite: Sair:123");
        menudo= entrada.nextInt();
        }
    }  
}
