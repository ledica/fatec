package teste;

import java.util.Scanner;

public class Elevador {
    
   int totalAndares,capacidade,pessoas,andarAtual;

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

   Scanner entrada = new Scanner(System.in);
   
   
   void Inicializa(){
   andarAtual=0;
   pessoas=0;
   System.out.println("Capacidade:");
   capacidade=entrada.nextInt();
   System.out.println("Total de Andares:");
   totalAndares=entrada.nextInt();
   }
   
   void Entra(){if(capacidade>pessoas)
   {pessoas++;}
   else{
          System.out.println("Limite Máximo atingido");
   }}
   void Sobe(){if(andarAtual!=totalAndares){andarAtual++;}}
   void Desce(){if(andarAtual!=0){andarAtual--;}}
   void Sai(){if (pessoas>0){pessoas--;}}
   
}
