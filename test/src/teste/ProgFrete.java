package teste;
import java.util.*;
public class ProgFrete
{
    public static void main (String args[])
    {
        int cod,vez=1;
        double totalnota,va;
        String des,saida="n";
        Scanner x=new Scanner (System.in);
        System.out.println("Informe valor da nota: ");
        va=x.nextDouble();
        
        Frete f=new Frete(va);
        
        while (saida.equals("n"))
        {
            System.out.println("Digite o c�digo da carga:");
            cod=x.nextInt();
            System.out.println("Digite destino da carga:");
            des=x.next();
            if (vez==2)
            {
                System.out.println("Digite o valor da carga: ");
                va=x.nextDouble();
                f.setValue(va);
            }  
            
            f.setCode(cod);
            f.setDest(des);
            
            if (des.equals("SP"))
            {
                totalnota=f.FreteSP(va);
            }
            else
            {
                totalnota=f.FreteOutros(va);
            }
            
            System.out.println("Destino da Carga: "+f.getDest());
            System.out.println("Valor total da nota: "+totalnota);
            System.out.println("----------------------------");
            System.out.println("Digite S - para sair ou N - para continuar");
            saida=x.next();
            vez=2;
        }
        System.exit(0);
    }
   
}