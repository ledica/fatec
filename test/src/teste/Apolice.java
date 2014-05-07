package teste;

import java.util.Scanner;

public class Apolice {
   String nomeSegurado;
   int idade,cidade;
   double valorPremio;
   

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }


   public void imprimir(){
       System.out.println(nomeSegurado+"\n"+idade+"\n"+valorPremio);
   }
   public void calcularPremioApolice(){
       if (idade<=25 || idade>=18){valorPremio+=valorPremio*0.2;}
       if (idade>25 || idade<=36){valorPremio+=valorPremio*0.15;}
       if (idade>36){valorPremio+=valorPremio*1.1;}
   }
   public void obterDesconto(){

       switch (cidade) {
           case 1:
               valorPremio=valorPremio*0.8;
               break;
           case 2:
               valorPremio=valorPremio*0.85;
               break;
           case 3:
               valorPremio=valorPremio*.9;
               break;
           case 4:
               valorPremio=valorPremio*0.95;
               break;
           default:
                    System.out.println("Este não é valor valido!");
       }
   }
}
