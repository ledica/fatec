package teste;
import javax.swing.*;
import java.util.Scanner;
public class Voo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menudo,consulta;
        int [] nvoo= new int [2];
        int [] origem= new int [2];
        int [] destino= new int [2];
        int [] vagas = new int [2];

        for(int linha=0 ; linha < 2 ; linha++){
            System.out.printf("Insira o numero:");
            nvoo[linha]=entrada.nextInt();
            System.out.printf("Insira o origem:");
            origem[linha]=entrada.nextInt();
            System.out.printf("Insira o destino:");
            destino[linha]=entrada.nextInt();
            System.out.printf("Insira as vagas disponíveis:");
            vagas[linha]=entrada.nextInt();
        }
        for(int i=0 ; i < 2 ; i++){
            System.out.printf(" n voo|\t %d \t",nvoo[i]);
            System.out.printf(" origem|\t %d \t",origem[i]);
            System.out.printf("destino|\t %d \t ",destino[i]);
            System.out.printf("vagas|\t %d \t ",vagas[i]);

            System.out.println();
        }
        
        menudo=0;
        while (menudo!=123)
        {
            System.out.println("\n Se deseja sair digite: 123 \n Consultar:1 \n Efetuar Reserva:2 \n Sair:123 \n");
            menudo= entrada.nextInt();
            switch (menudo) {
                case 1:
                    System.out.println("Consultar");
                    System.out.println("\n Se deseja sair digite: 123 \n Por número do vôo:4 \n Por origem:5 \n Por destino:6");
                    menudo= entrada.nextInt();
                    switch (menudo) {
                        case 4:
                            System.out.println("Por número do vôo");
                            System.out.println("Entre com número do voo:");
                            consulta = entrada.nextInt();
                            for(int i=0 ; i < 2 ; i++){
                                if (nvoo[i]==consulta) {
                                    System.out.printf("número voo:"+nvoo[i]);
                                    System.out.printf("|    origem:"+origem[i]);
                                    System.out.printf("|    destino:"+destino[i]);
                                    System.out.printf("|    vagas:"+vagas[i]);
                                    }
                                 }

                            break;
                        case 5:
                            System.out.println("Por origem");
                            consulta = entrada.nextInt();
                            for(int i=0 ; i < 2 ; i++){
                                if (origem[i]==consulta) {
                                    System.out.printf("número voo:"+nvoo[i]);
                                    System.out.printf("|    origem:"+origem[i]);
                                    System.out.printf("|    destino:"+destino[i]);
                                    System.out.printf("|    vagas:"+vagas[i]);
                                }
                                break;}
                            break;
                        case 6:
                            System.out.println("Por destino");
                            consulta = entrada.nextInt();
                            for(int i=0 ; i < 2 ; i++){
                                if (destino[i]==consulta) {
                                    System.out.printf("número voo:"+nvoo[i]);
                                    System.out.printf("|    origem:"+origem[i]);
                                    System.out.printf("|    destino:"+destino[i]);
                                    System.out.printf("|    vagas:"+vagas[i]);
                                }}
                            break;
                        case 123:
                            System.out.println("Sair");
                            break;
                        default:
                            System.out.println("Este não é um dia válido!");
                    }
                    
                    break;
                case 2:
                    System.out.println("Efetuar Reserva:");
                    System.out.println("número do voo:");
                    consulta = entrada.nextInt();
                    int existente=0;
                    for(int i=1 ; i < 2 ; i++){
                        if (nvoo[i]==consulta) {
                        existente=1;
                        if (vagas[i]>0){
                            System.out.println("RESERVA CONFIRMADA");
                            vagas[i] = vagas[i]-1;}
                        else {
                            System.out.println("Lotado");
                        }
                        }
                    }
                    if (existente==0 )
                    {System.out.println("Voo Inexistente");}
                    break;
                case 123:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Este não é um dia válido!");
            }
        }
    }
}
