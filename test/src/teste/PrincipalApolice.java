package teste;

import java.util.Scanner;

 class PrincipalApolice {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomeSegurado;
        int idade,cidade,menudo;
        double valorPremio;
        menudo=0;
        while (menudo!=123)
        {
            System.out.println("\n Se deseja sair digite: Sair:123");
            menudo= entrada.nextInt();
            Apolice a1=new Apolice();
            System.out.println("Digite a Idade:");
            a1.idade=entrada.nextInt();
            System.out.println("Digite o nome:");
            a1.nomeSegurado=entrada.next();
            System.out.println("Digite o valor:");
            a1.valorPremio=entrada.nextDouble();
            System.out.println("escolha:1- Curitiba\n 2- Rio de Janeiro \n 3-Sao Paulo \n 4- Belo Horizonte");
            a1.cidade= entrada.nextInt();
            a1.imprimir();
            a1.calcularPremioApolice();
            a1.obterDesconto();
            a1.imprimir();
        System.out.println("\n Se deseja sair digite: Sair:123");
        menudo= entrada.nextInt();
        }
        
        
        
        
        
        
}}
